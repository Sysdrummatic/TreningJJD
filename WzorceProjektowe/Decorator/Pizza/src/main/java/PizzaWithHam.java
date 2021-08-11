import java.math.BigDecimal;
import java.text.DecimalFormat;

public class PizzaWithHam extends PizzaWithTopping{
    private static final BigDecimal HAM_PRICE = new BigDecimal(7);

    public PizzaWithHam(Pizza basePrice) {
        super(basePrice, HAM_PRICE);
    }


}
