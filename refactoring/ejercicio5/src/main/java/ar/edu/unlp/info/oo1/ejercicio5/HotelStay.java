package ar.edu.unlp.info.oo1.ejercicio5;

public class HotelStay extends Product {
    private Hotel hotel;

    public HotelStay(double cost, TimePeriod timePeriod, Hotel hotel) {
        super(cost, timePeriod);
        this.hotel = hotel;
    }

    public double priceFactor() {
        return this.cost() / this.price();
    }

    public double price() {
        return this.timePeriod.duration() * this.hotel.nightPrice() * this.hotel.discountRate();
    }

    public double cost() {
        return this.cost;
    }
}
