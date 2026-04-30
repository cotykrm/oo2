package ar.edu.unlp.info.oo1.ejercicio8;

import java.time.Duration;

public class Finished extends ToDoItemState{

    public Finished(ToDoItem task){
        super(task);
        this.getToDoItem().setEnd();
    }

    @Override
    public void start() {
        throw new RuntimeException("El objeto ToDoItem no se encuentra en Pending");
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
        return Duration.between(this.getToDoItem().getStart(), this.getToDoItem().getEnd());
    }

    @Override
    public void addComment(String comment) {
        throw new RuntimeException("El objeto ToDoItem no se encuentra en pending o pause o in-progress");
    }

}

