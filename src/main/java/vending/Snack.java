package vending;

public class Snack extends Product{
    private boolean isVegan;

    public Snack(String name, double price, boolean isVegan) {
        super(name, price);
        this.isVegan = isVegan;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void setVegan(boolean vegan) {
        isVegan = vegan;
    }

    @Override
    public String toString() {
        return "Snack: name = " + super.getName() +
                ", Price= " + super.getPrice() +
                ", isVegan= " + isVegan();
    }
}
