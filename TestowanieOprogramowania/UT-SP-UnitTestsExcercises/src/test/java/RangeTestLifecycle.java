import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RangeTestLifecycle {
    private Range range;

    @Before
    public void setUp(){
        range = new Range(10,20);
    }

    @Test
    public void shouldSayThat15IsInRange(){
        Assert.assertTrue(range.isInRange(15));
    }

    @Test
    public void shouldSayThat5IsOutOfRange(){
        Assert.assertFalse(range.isInRange(5));
    }

}
