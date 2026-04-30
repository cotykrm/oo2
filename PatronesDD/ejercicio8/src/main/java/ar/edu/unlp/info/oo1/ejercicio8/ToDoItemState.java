package ar.edu.unlp.info.oo1.ejercicio8;

import java.time.Duration;

public abstract class ToDoItemState {
    private ToDoItem task;

    public ToDoItemState(ToDoItem task){
        this.task = task;
    }

    public ToDoItem getToDoItem(){
        return this.task;
    }

    /**
* Pasa el ToDoItem a in-progress, siempre y cuando su estado actual sea
* pending. Si se encuentra en otro estado, no hace nada.
*/
    public abstract void start();

	/**
* Pasa el ToDoItem a paused si su estado es in-progress, o a in-progress sí * su estado es paused. Caso contrario (pending o finished) genera un error
* informando la causa específica del mismo.
*/
    public abstract void togglePause();


	/**
* Pasa el ToDoItem a finished, siempre y cuando su estado actual sea 
* in-progress o paused. Si se encuentra en otro estado, no hace nada.
*/
    public abstract void finish();


	/**
* Retorna el tiempo que transcurrió desde que se inició el ToDoItem (start)
* hasta que se finalizó. En caso de que no esté finalizado, el tiempo que
* haya transcurrido hasta el momento actual. Si el ToDoItem no se inició,
* genera un error informando la causa específica del mismo.
*/
    public abstract Duration workedTime();


/**
* Agrega un comentario al ToDoItem siempre y cuando no haya finalizado. Caso
* contrario no hace nada."

*/
    public abstract void addComment(String comment);

}
