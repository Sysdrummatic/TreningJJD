import java.math.BigDecimal;

public class PizzaWithBasil extends PizzaWithTopping{
    private static final BigDecimal BASIL_PRICE = new BigDecimal(3);

    public PizzaWithBasil(Pizza basePrice) {
        super(basePrice, BASIL_PRICE);
    }
    @Override
    public String toString() {
        return "Pizza with mozzarella, ham and basil";
    }
}
