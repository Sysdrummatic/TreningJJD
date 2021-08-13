import java.text.DecimalFormat;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pizza margherita = new Pizza();
        Pizza withMozzarella = new PizzaWithMozzarella(margherita);
        Pizza withHam = new PizzaWithHam(withMozzarella);
        Pizza withBasil = new PizzaWithBasil(withHam);

        DecimalFormat df = new DecimalFormat("#,00 zł");
        for(Pizza pizza : List.of (margherita,withMozzarella,withHam,withBasil)){
            System.out.printf("%s costs %s.%n", pizza, df.format(pizza.getPrice()));
        }
    }
}
