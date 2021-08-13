import java.math.BigDecimal;

public class PizzaWithMozzarella extends Pizza {
    private static final BigDecimal MOZZARELLA_PRICE = new BigDecimal(5);
    private final Pizza BASE_PRICE;

    public PizzaWithMozzarella(Pizza basePrice){
        this.BASE_PRICE = basePrice;
    }

    public BigDecimal getPrice() {
        return BASE_PRICE.getPrice().add(MOZZARELLA_PRICE);
    }
    @Override
    public String toString() {
        return "Pizza with mozzarella";
    }
}
