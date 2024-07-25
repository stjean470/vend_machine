package vending;

public class VendRunner {
    public static void main(String[] args) {
        Snack s1 = new Snack("Cheerios", 4.25, false);
        Beverage b1 = new Beverage("Pepsi", 2.25, 12.0);
        Product p1 = new Product("rice", 3.45);
        Snack s2 = new Snack("Lays", 3.05, false);
        Beverage b2 = new Beverage("Minute Maid", 3.14, 12.0);

        Slot<Product> slot1 = new Slot<>(s1, 5);
        Slot<Product> slot2 = new Slot<>(b1, 3);
        Slot<Product> slot3 = new Slot<>(p1, 8);
        Slot<Product> slot4 = new Slot<>(s2, 10);
        Slot<Product> slot5 = new Slot<>(b2, 4);

        VendingMachine vm = new VendingMachine();
        vm.addProduct("chips1", slot1);
        vm.addProduct("beverage32", slot2);
        vm.addProduct("grain", slot3);
        vm.addProduct("chips2", slot4);
        vm.addProduct("beverage33", slot5);

        vm.displayProducts();
        System.out.println(vm.dispenseProduct("ugh"));
        //System.out.println(vm.dispenseProduct("chips1"));
        //System.out.println(vm.dispenseProduct("beverage32"));

    }
}
