import java.math.BigDecimal;

public abstract class PizzaWithTopping extends Pizza{
    private final BigDecimal TOPPING_PRICE;
    private final Pizza BASE_PRICE;

    public PizzaWithTopping(Pizza pizza, BigDecimal toppingPrice){
        this.BASE_PRICE = pizza;
        this.TOPPING_PRICE = toppingPrice;
    }
    @Override
    public BigDecimal getPrice() {
        return BASE_PRICE.getPrice().add(TOPPING_PRICE);
    }
    @Override
    public String toString() {
        return "Pizza with topping";
    }
}