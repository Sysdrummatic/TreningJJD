import java.text.DecimalFormat;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pizza margherita = new Pizza();
        Pizza withMozzarella = new PizzaWithMozzarella(margherita);
        Pizza withHam = new PizzaWithHam(withMozzarella);

    DecimalFormat df = new DecimalFormat("#,00 zł");
    for(Pizza pizza : List.of (margherita,withMozzarella,withHam)){
        System.out.println(String.format("%s costs %s.", pizza, df.format(pizza.getPrice())));
    }
}}
