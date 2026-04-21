package ar.edu.unlp.info.oo1.ejercicio5;


public class CarRental extends Product {
    private Company company;

    public CarRental(double cost, TimePeriod timePeriod, Company company) {
        super(cost, timePeriod);
        this.company = company;
    }


    public double price() {
        return this.company.price() * this.company.promotionRate();
    }

    public double cost() {
        return this.cost;
    }
}
