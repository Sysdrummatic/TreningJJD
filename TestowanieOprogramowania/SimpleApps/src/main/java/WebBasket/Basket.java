package WebBasket;

import java.util.HashMap;
import java.util.Map;

public class Basket {


    public Basket(){

    }

    public static void main(String[] args) {

        Map<String, Double> orderedItem = new HashMap<>();


        //Wywołanie koszyka

        Basket basket = new Basket();

        //Wywołanie przedmiotów
        Item itemID0001 = new Item("Palki perkusyjne",10.50);
        Item itemID0002 = new Item("Palki perkusyjne",10.50);
        Item itemID0003 = new Item("Talerz Crash 18",259.50);
        Item itemID0004 = new Item("Stołek perkusyjny",150.65);
        Item itemID0005 = new Item("Bijak filcowy",52.49);
        Item itemID0006 = new Item("Bijak filcowy",52.49);
        Item itemID0007 = new Item("Stopa Twin Custom",1789.49);
        Item itemID0008 = new Item("Stojak łamany",379.49);

        //Dodanie do koszyka
        orderedItem.put(itemID0001.getName(),itemID0001.getPrice());
        orderedItem.put(itemID0002.getName(),itemID0002.getPrice());
        orderedItem.put(itemID0003.getName(),itemID0003.getPrice());
        orderedItem.put(itemID0004.getName(),itemID0004.getPrice());
        orderedItem.put(itemID0005.getName(),itemID0005.getPrice());
        orderedItem.put(itemID0006.getName(),itemID0006.getPrice());
        orderedItem.put(itemID0007.getName(),itemID0007.getPrice());
        orderedItem.put(itemID0008.getName(),itemID0008.getPrice());





        //Wyświetlenie zawartości koszyka z podsumowaniem i ceną.

}

public void showBasketDetails() {

}
}
