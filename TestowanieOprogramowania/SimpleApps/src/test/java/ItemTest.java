import WebBasket.Item;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ItemTest {

    private Item product;
    private String correctName;
    private String wrongName;
    private double doublePrice;
    private double integerPrice;
    private double zeroPrice;
    private double nullPrice;
    Item itemID0001;
    Item itemID0002;
    Item itemID0003;

    @Before
    public void setUpData(){
        //given
        correctName = "Produkt 1";
        wrongName = null;
        integerPrice = 2;
        doublePrice = 1.59;
        zeroPrice = 0;
        product = new Item(correctName, doublePrice);
        itemID0001 = new Item("Palki perkusyjne",10.50);
        itemID0002 = new Item("Palki perkusyjne",10.50);
        itemID0003 = new Item("Talerz Crash 18",259.50);

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

        new Item(wrongName, doublePrice);
    }
    @Test
    public void twoItemsWithTheSameNameAndPriceAreEqual(){
        Assert.assertEquals(new Item("item", 123.12), new Item("item", 123.12));
    }

}
