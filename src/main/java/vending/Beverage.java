package vending;

public class Beverage extends Product {
    private double flOz;

    public Beverage(String name, double price, double flOz) {
        super(name, price);
        this.flOz = flOz;
    }

    public double getFlOz() {
        return flOz;
    }

    public void setFlOz(double flOz) {
        this.flOz = flOz;
    }

    @Override
    public String toString() {
        return "Beverage: " + "name= " +
                super.getName() + ", Price= " + super.getPrice() +
                ", flOz=" + getFlOz();
    }
}
