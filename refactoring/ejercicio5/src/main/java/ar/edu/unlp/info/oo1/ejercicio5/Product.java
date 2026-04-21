package ar.edu.unlp.info.oo1.ejercicio5;

import java.time.LocalDate;

public abstract class Product {
    protected TimePeriod timePeriod;
    protected double cost;

    public Product(double cost, TimePeriod timePeriod){
        this.cost = cost;
        this.timePeriod = timePeriod;
    }

    public LocalDate startDate() {
        return this.timePeriod.start();
    }

    public LocalDate endDate() {
        return this.timePeriod.end();
    }

    public abstract double price();
}
