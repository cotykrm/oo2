package ar.edu.unlp.info.oo1.ejercicio8;

import java.time.Duration;
import java.time.LocalDateTime;

public class InProgress extends ToDoItemState{

    public InProgress(ToDoItem task){
        super(task);
        this.getToDoItem().setStart();
    }

    @Override
    public void start() {
        throw new RuntimeException("El objeto ToDoItem no se encuentra en Pending");

    }

    @Override
    public void togglePause() {
        ToDoItem task = this.getToDoItem();
		task.changeState(new Paused(task));
    }

    @Override
    public void finish() {
        ToDoItem task = this.getToDoItem();
	    task.changeState(new Finished(task));
    }

    @Override
    public Duration workedTime() {
        return Duration.between(this.getToDoItem().getStart(), LocalDateTime.now());
    }

    @Override
    public void addComment(String comment) {
        this.getToDoItem().getComments().add(comment);
    }

}
