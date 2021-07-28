import WebBasket.Basket;
import WebBasket.Item;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ItemTest {

    private String correctName;
    private String wrongName;
    private double doublePrice;
    private double zeroPrice;
    Item itemID0001;
    Item itemID0002;
    Item itemID0003;


    @Before
    public void setUpData(){
        //given
        correctName = "Produkt 1";
        wrongName = null;
        doublePrice = 1.59;
        zeroPrice = 0;
        itemID0001 = new Item("Palki perkusyjne",10.50);
        itemID0002 = new Item("Palki perkusyjne",10.50);
        itemID0003 = new Item("Talerz Crash 18",259.50);

    }

    @Test
    public void shouldReturnTheCorrectName(){
        Assert.assertEquals("Palki perkusyjne", itemID0001.getName());
    }
    @Test
    public void shouldReturnTheCorrectPrice(){

        Assert.assertEquals(10.50,itemID0001.getPrice(),0);
    }
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowErrorForValuesLessOrEqual0(){

        new Item(correctName,zeroPrice);
    }
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowErrorForNullValuedName(){

        new Item(wrongName, doublePrice);
    }
    @Test
    public void twoItemsWithTheSameNameAndPriceAreEqual(){
        Assert.assertEquals(itemID0001, itemID0002);
    }
    @Test
    public void twoItemsWithdDifferentNameAndPriceAreNotEqual(){
        Assert.assertNotEquals(itemID0001, itemID0003);
    }

}
