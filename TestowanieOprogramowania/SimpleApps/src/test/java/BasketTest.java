import WebBasket.Basket;
import WebBasket.Item;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class BasketTest {

    private Basket basket;
    public Item itemID0001;
    public Item itemID0002;
    public Item itemID0003;
    public Item itemID0004;
    public Item itemID0005;
    public Item itemID0006;

    @Before
    public void dataSetUp(){

        itemID0001 = new Item("Palki perkusyjne",10.50);
        itemID0002 = new Item("Talerz Crash 18",259.50);
        itemID0003 = new Item("Stołek perkusyjny",150.65);
        itemID0004 = new Item("Bijak filcowy",52.49);
        itemID0005 = new Item("Stopa Twin Custom",1789.49);
        itemID0006 = new Item("Stojak łamany",379.49);
        basket = new Basket();
    }
    @Test
    public void shouldAddOnlyOneItem(){
        basket.add(itemID0001);

        Map<Item,Integer> expected = createOrder(itemID0001,1);
        Assert.assertEquals(expected, basket.getOrderedItem());
    }

    @Test
    public void shouldAddMoreThanOneItemOfTheSameType(){

        basket.add(itemID0001);
        basket.add(itemID0001);

        Map<Item,Integer> expected = createOrder(itemID0001,2);
        Assert.assertEquals(expected, basket.getOrderedItem());
    }


    @Test
    public void shouldReturn3Items(){
        basket.add(itemID0001,3);
        //Assert.assertEquals(3,basket.orderedItem.size());


    }

    @Test //add method tests
    public void addMoreThanOne() {


        basket.add(itemID0001,3);

        //Assert.assertTrue();

    }
    @Test
    public void removeTest() {

    }
    @Test
    public void removeAllTest() {

    }
    @Test
    public void showBasketDetailsTest() {

    }
    @Test
    public void buyTest() {

    }

    private static Map<Item, Integer> createOrder(Object ... mapContent) {
        Map<Item, Integer> result = new HashMap<>();

        for (int index = 0; index < mapContent.length; index += 2) {
            Item item = (Item) mapContent[index];
            Integer quantity = (Integer) mapContent[index + 1];
            result.put(item, quantity);
        }

        return result;
    }


}
