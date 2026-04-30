package ar.edu.unlp.info.oo1.ejercicio8;

import java.time.LocalDateTime;
import java.time.Duration;

public class Paused extends ToDoItemState{

    public Paused(ToDoItem task){
        super(task);
    }

    @Override
    public void start() {
        throw new RuntimeException("El objeto ToDoItem no se encuentra en Pending");
    }

    @Override
    public void togglePause() {
        ToDoItem task = this.getToDoItem();
	    task.changeState(new InProgress(task));
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

