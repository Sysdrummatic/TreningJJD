import java.math.BigDecimal;

public class PizzaWithMozzarella extends Pizza {
    private static final BigDecimal MOZZARELLA_PRICE = new BigDecimal(5);
    private Pizza basePrice;

    public PizzaWithMozzarella(Pizza basePrice){
        this.basePrice = basePrice;
    }

    public BigDecimal getPrice() {
        return basePrice.getPrice().add(MOZZARELLA_PRICE);
    }
}
