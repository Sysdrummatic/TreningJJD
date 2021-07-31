import WebBasket.Basket;
import WebBasket.Item;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class BasketTest {

    private Basket basket;
    public Item itemID0001;
    public Item itemID0002;
    public Item itemID0003;

    @Before
    public void dataSetUp(){

        itemID0001 = new Item("Drum sticks X",10.50);
        itemID0001 = new Item("Drum sticks X",10.50);
        itemID0002 = new Item("Crash cymbal 18",259.50);
        itemID0003 = new Item("Drum chair",150.65);
        basket = new Basket();
    }
    @Test
    public void shouldAddOnlyOneItem(){

        basket.add(itemID0001);
        Map<Item,Integer> expected = createOrder(itemID0001,1);
        Assert.assertEquals(expected, basket.getOrderedItem());
    }
    @Test
    public void shouldAddOneItemWithQuantityOne(){

        basket.add(itemID0001,1);
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
    public void shouldAddManyItemsOfTheSameType(){

        basket.add(itemID0001,31);
        Map<Item,Integer> expected = createOrder(itemID0001,31);
        Assert.assertEquals(expected,basket.getOrderedItem());
    }
    @Test
    public void shouldRemoveOneItem(){

        basket.add(itemID0001);
        basket.remove(itemID0001);
        Map<Item,Integer> expected = Collections.emptyMap();
        Assert.assertEquals(expected, basket.getOrderedItem());
    }
    @Test
    public void shouldRemoveOnlyOneItem(){

        basket.add(itemID0001,2);
        basket.remove(itemID0001);
        Map<Item,Integer> expected = createOrder(itemID0001,1);
        Assert.assertEquals(expected, basket.getOrderedItem());
    }
    @Test(expected = IllegalArgumentException.class)
    public void shouldNotAcceptQuantityZero(){
        basket.add(itemID0001,0);
    }
    @Test(expected = IllegalArgumentException.class)
    public void shouldNotAllowRemoveQuantityZero(){
        basket.remove(itemID0001,0);
    }
    @Test(expected =  IllegalArgumentException.class)
    public void shouldNotAllowRemoveMinusQuantityValue(){
        basket.remove(itemID0001,-10);
    }
    @Test(expected = IllegalArgumentException.class)
    public void shouldNotRemoveMoreThanExistingItem(){

        basket.add(itemID0001,2);
        basket.remove(itemID0001,3);
    }
    @Test
    public void shouldReturnSimpleOrderValue(){
        basket.add(itemID0001,3);
        double expectedValue = itemID0001.getPrice()*3;
        Assert.assertEquals(expectedValue,basket.getOrderValue(),0);
    }
    @Test
    public void shouldReturnOrderValueWithManyItems(){
        basket.add(itemID0001,3);
        basket.add(itemID0002,2);
        basket.add(itemID0003,1);
        double expectedValue = itemID0001.getPrice()*3 + itemID0002.getPrice()*2 + itemID0003.getPrice();
        Assert.assertEquals(expectedValue,basket.getOrderValue(),0);
    }
    @Test
    public void checkIsAllItemsAreRemoved(){
        basket.add(itemID0001,3);
        basket.add(itemID0002,2);
        basket.add(itemID0003,1);
        basket.removeAll();
        Map<Item,Integer> expected = createOrder(itemID0001,1);
        expected.remove(itemID0001,1);
        Assert.assertEquals(expected,basket.getOrderedItem());

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
