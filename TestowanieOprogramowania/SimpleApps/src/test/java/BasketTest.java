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

    @Before
    public void dataSetUp(){

        itemID0001 = new Item("Palki perkusyjne",10.50);
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
