package WebBasket;

public class Main {
    public static void main(String[] args) {


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

        basket.add(itemID0001,3);

        System.out.println(basket.getBasketSize());

    }
}
