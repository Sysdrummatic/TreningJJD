import WebBasket.Item;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ItemTest {

    private Item product;
    private String name;
    private double price;

    @Before
    public void setUpDataForConstructor(){
        //given
        name = "Produkt 1";
        price = 1.59;
        product = new Item(name, price);
    }

    @Test
    public void shouldReturnTheName(){
        Assert.assertEquals(product.getName(), name);
    }

    @Test
    public void shouldReturnThePrice(){

        Assert.assertEquals(product.getPrice(),1.59,0);
        //Assert.assertTrue(product.getName().equals(price));
    }

}
