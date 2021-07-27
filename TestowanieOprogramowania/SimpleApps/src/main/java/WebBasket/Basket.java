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

    public void add(Item item, int quantity){
        if(quantity <= 0)
        {
            throw new IllegalArgumentException("You can't add less than one product");
        }
        orderedItem.put(item, quantity);
    }

    public void remove(Item item){
        remove(item,1);
    }

    public void remove(Item item, int quantity){
        if(quantity > orderedItem.size())
        {
            throw new IllegalArgumentException("You can't remove more than you your basket content");
        }
        orderedItem.remove(item, quantity);
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
