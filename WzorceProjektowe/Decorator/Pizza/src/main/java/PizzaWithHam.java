import java.math.BigDecimal;

public class PizzaWithHam extends PizzaWithTopping{
    private static final BigDecimal HAM_PRICE = new BigDecimal(7);

    public PizzaWithHam(Pizza basePrice) {
        super(basePrice, HAM_PRICE);
    }
}
