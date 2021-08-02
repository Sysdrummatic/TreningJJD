package WebBasket;

import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Basket {

    private final Map<Item, Integer> orderedItem = new TreeMap<>();
    Scanner typePromocode = new Scanner(System.in);

    public void add(Item item){
        add(item,1);
    }

    public void add(Item item, Integer quantity){
        if(quantity <= 0)
        {
            throw new IllegalArgumentException("You can't add less than one product");
        }
        if(orderedItem.containsKey(item)){
            quantity = orderedItem.get(item) + quantity;
        }
        orderedItem.put(item, quantity);
    }
    public void remove(Item item){
        remove(item,1);
    }

    public void remove(Item item, Integer quantity){
        if(quantity <= 0) {
            throw new IllegalArgumentException("You can't remove more than you your basket content");
        }
        quantity = orderedItem.get(item) - quantity;
        if(quantity == 0){
            orderedItem.remove(item);
        }
        else if(quantity <0){
            throw new IllegalArgumentException("No items to remove");
        }
        else{
            orderedItem.put(item, quantity);
        }
    }
    public void removeAll(){
        orderedItem.clear();
    }
    public double getOrderValue() {
        double orderValue = 0;

        for(Map.Entry<Item, Integer> itemOrder : orderedItem.entrySet()) {
            orderValue += itemOrder.getKey().getPrice() * itemOrder.getValue();
        }
        return orderValue;
    }
    public Map<Item, Integer> getOrderedItem() {
        return Collections.unmodifiableMap(orderedItem);
    }
//getOrderValue method unused on purpose
    public double showBasketDetails() {
        double totalPrice = 0;
        System.out.println("Items in the basket:");
        for (Map.Entry<Item, Integer> entry : orderedItem.entrySet()) {
            String name = entry.getKey().getName();
            double price = entry.getKey().getPrice();
            Integer value = entry.getValue();
            double itemsMultiplied = price*value;
            totalPrice += price * value;
            System.out.println("Product: " + name + " - " + price + " zł for single item. " + value + " items added. " + itemsMultiplied + " zł for all.");
        }
        System.out.println("------");
        System.out.println("Total price for all basket is: " + totalPrice + " zł.");
        return totalPrice;
    }
    public double discount(String promocode){
        final double  DISCOUNT = 0.15;
        double AFTER_DISCOUNT = 0;
        final String CORRECT_PROMOCODE = "xyz";
        if(promocode.equals(CORRECT_PROMOCODE)) {
            AFTER_DISCOUNT = getOrderValue() - (getOrderValue() * DISCOUNT);
            AFTER_DISCOUNT = Math.round(AFTER_DISCOUNT);
            System.out.println("Your price with promocode " + CORRECT_PROMOCODE + " is: " + AFTER_DISCOUNT + " zł.");
        }
        return AFTER_DISCOUNT;
    }
    public void buy(){
        System.out.println("Thank you for buying at DrumCo.com!");
        System.out.println("Type a promocode if you have one. Otherwise press enter.");
        String promocode = typePromocode.nextLine();
        showBasketDetails();
        discount(promocode);
        removeAll();
    }
}
