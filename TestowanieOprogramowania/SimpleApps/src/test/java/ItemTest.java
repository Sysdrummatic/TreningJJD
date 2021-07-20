import WebBasket.Item;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ItemTest {

    private Item product;
    private String correctName;
    private String wrongName;
    private double floatPrice;
    private double integerPrice;
    private double zeroPrice;
    private double nullPrice;

    @Before
    public void setUpData(){
        //given
        correctName = "Produkt 1";
        wrongName = null;
        integerPrice = 2;
        floatPrice = 1.59;
        zeroPrice = 0;
        product = new Item(correctName, floatPrice);

    }

    @Test
    public void shouldReturnTheName(){
        Assert.assertEquals(product.getName(), correctName);
    }

    @Test
    public void shouldReturnThePrice(){

        Assert.assertEquals(product.getPrice(),1.59,0);
        //Assert.assertTrue(product.getName().equals(price));
    }
    @Test(expected = IllegalArgumentException.class)
    public void throwErrorForValuesLessOrEqual0(){

        new Item(correctName,zeroPrice);
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwErrorForNullValuedName(){

        new Item(wrongName,floatPrice);
    }
}
