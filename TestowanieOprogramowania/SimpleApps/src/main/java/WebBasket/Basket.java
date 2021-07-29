package WebBasket;

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

    public double getOrderValue() {
        double orderValue = 0;

        for(Map.Entry<Item, Integer> itemOrder : orderedItem.entrySet()) {
            orderValue += itemOrder.getKey().getPrice() * itemOrder.getValue();
        }

        return orderValue;
    }

    public void removeAll(){

    }

    public void buy(){
        System.out.println("Thank you for buying at DrumCo.com!");
        System.out.println("Type a promocode if you have one. Otherwise type - and enter.");
        String promocode = typePromocode.nextLine();
    }

        //Wyświetlenie zawartości koszyka z podsumowaniem i ceną.


public void showBasketDetails() {

        //Wyświetl listę przedmiotów w koszyku z nazwą, ilością, sceną oraz zbiorczą sumą zamówienia

}
}
