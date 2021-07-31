package WebBasket;

public class Main {
    public static void main(String[] args) {

        Basket basket = new Basket();
        Item itemID0001 = new Item("Palki perkusyjne",10.50);
        Item itemID0003 = new Item("Talerz Crash 18",259.50);
        Item itemID0004 = new Item("Stołek perkusyjny",150.65);
        Item itemID0005 = new Item("Bijak filcowy",52.49);
        Item itemID0007 = new Item("Stopa Twin Custom",1789.49);
        Item itemID0008 = new Item("Stojak łamany",379.49);

        basket.add(itemID0001,5);
        basket.add(itemID0003,2);
        basket.add(itemID0004,1);
        basket.add(itemID0005,2);
        basket.add(itemID0007,1);
        basket.add(itemID0008,2);

        basket.buy();
    }
}
