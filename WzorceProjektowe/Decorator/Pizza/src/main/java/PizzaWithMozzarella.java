import java.math.BigDecimal;

public class PizzaWithMozzarella extends Pizza {
    private static final BigDecimal MOZZARELLA_PRICE = new BigDecimal(5);
    private Pizza basePizza;

    public PizzaWithMozzarella(Pizza basePizza){
        this.basePizza = basePizza;
    }

    public BigDecimal getPrice() {
        return basePizza.getPrice().add(MOZZARELLA_PRICE);
    }
}
