package WebBasket;

public class Item {

    private String name;
    private double price;

    public Item(String name, double price)
    {
        if(name == null){
            throw new IllegalArgumentException("Product name cant be null");
        }
        if(price <= 0){
            throw new IllegalArgumentException("Product price cant be less or equal 0");
        }
        this.name = name;
        this.price = price;

    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
