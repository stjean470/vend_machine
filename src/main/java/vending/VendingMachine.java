package vending;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    private Map<String, Slot<? extends Product>> slots;

    public VendingMachine() {
        slots = new HashMap<>();
    }
    public void addProduct(String code, Slot<Product> slot){
        slots.put(code, slot);
    }

    public Product dispenseProduct(String code) {
        if (!slots.isEmpty()) {
            if (slots.containsKey(code) && slots.get(code).getQuantity() > 0) {
                Slot<? extends Product> s = slots.get(code);
                s.setQuantity(s.getQuantity() - 1);
                return s.getProduct();
            }
        }
        System.out.println("Product not available");
        return null;
    }

    public void displayProducts() {
        for (String code: slots.keySet()) {
            if(slots.get(code).getProduct() != null) {
                System.out.println(slots.get(code).getProduct());
            }
        }
    }
//slots.get("Cheerios").getProduct().getName()


}
