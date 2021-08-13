import java.math.BigDecimal;

public class Pizza {

        private static final BigDecimal BASE_PRICE = new BigDecimal(12);

        public BigDecimal getPrice() {
            return BASE_PRICE;
        }

        public String toString() {
            return "Pizza with no ingredients";
        }
}
