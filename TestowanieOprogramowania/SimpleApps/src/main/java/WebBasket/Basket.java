package WebBasket;

import java.sql.SQLOutput;
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
        
    }

    public void remove(Item item){
        remove(item,1);
    }

    public void remove(Item item, int quantity){

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
