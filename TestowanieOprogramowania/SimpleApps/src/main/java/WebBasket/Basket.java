package WebBasket;

import java.util.Map;
import java.util.TreeMap;

public class Basket {

    private final Map<Item, Integer> orderedItem = new TreeMap<>();

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









        //Wyświetlenie zawartości koszyka z podsumowaniem i ceną.


public void showBasketDetails() {

}
}
