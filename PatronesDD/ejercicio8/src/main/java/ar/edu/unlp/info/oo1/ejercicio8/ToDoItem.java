package ar.edu.unlp.info.oo1.ejercicio8;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {
    private ToDoItemState state;
    private String name;
    private LocalDateTime start;
    private LocalDateTime end;
    private List<String> comments;

    public ToDoItem(String name){
        this.name = name;
        ToDoItemState state = new Pending(this);
        this.state = state;
        this.comments = new ArrayList<String>();
    }

    public void changeState(ToDoItemState state) {
		this.state = state;
	}

    public void setStart() {
		this.start = LocalDateTime.now();
	}
	
	public void setEnd() {
		this.end = LocalDateTime.now();
	}
	
	public LocalDateTime getStart() {
		return this.start;
	}

	public LocalDateTime getEnd() {
		return this.end;
	}
	
	public List<String> getComments() {
		return this.comments;
	}

    /**
* Pasa el ToDoItem a in-progress, siempre y cuando su estado actual sea
* pending. Si se encuentra en otro estado, no hace nada.
*/
    public void start(){
        this.state.start();
    }

	/**
* Pasa el ToDoItem a paused si su estado es in-progress, o a in-progress sí 
* su estado es paused. Caso contrario (pending o finished) genera un error
* informando la causa específica del mismo.
*/
    public void togglePause(){
        this.state.togglePause();
    }


	/**
* Pasa el ToDoItem a finished, siempre y cuando su estado actual sea 
* in-progress o paused. Si se encuentra en otro estado, no hace nada.
*/
    public void finish(){
        this.state.finish();
    }


	/**
* Retorna el tiempo que transcurrió desde que se inició el ToDoItem (start)
* hasta que se finalizó. En caso de que no esté finalizado, el tiempo que
* haya transcurrido hasta el momento actual. Si el ToDoItem no se inició,
* genera un error informando la causa específica del mismo.
*/
    public Duration workedTime(){
        return this.state.workedTime();
    }


/**
* Agrega un comentario al ToDoItem siempre y cuando no haya finalizado. Caso
* contrario no hace nada."

*/
    public void addComment(String comment){
        this.state.addComment(comment);
    }

    

}
