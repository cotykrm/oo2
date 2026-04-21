package ar.edu.unlp.info.oo1.ejercicio5;

public class Company {
    private final double price;
    private final double promotionRate;

    public Company(double price, double promotionRate) {
        this.price = price;
        this.promotionRate = promotionRate;
    }

    public double price() {
        return this.price;
    }

    public double promotionRate() {
        return this.promotionRate;
    }
}
