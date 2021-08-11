import java.math.BigDecimal;

public abstract class PizzaWithTopping extends Pizza{
    private BigDecimal toppingPrice;
    private Pizza basePrice;

    public PizzaWithTopping(Pizza pizza, BigDecimal toppingPrice){
        this.basePrice = pizza;
        this.toppingPrice = toppingPrice;
    }
    @Override
    public BigDecimal getPrice() {
        return basePrice.getPrice().add(toppingPrice);
    }
    @Override
    public String toString() {
        return "Pizza with topping";
    }
}