package ar.edu.unlp.info.oo1.ejercicio8;

import java.time.Duration;
import java.time.LocalDateTime;

public class Pending extends ToDoItemState{

    public Pending(ToDoItem task){
        super(task);
    }

    @Override
    public void start() {
        ToDoItem task = this.getToDoItem();
		task.changeState(new InProgress(task));
    }

    @Override
    public void togglePause() {
        throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");

    }

    @Override
    public void finish() {
        throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
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
