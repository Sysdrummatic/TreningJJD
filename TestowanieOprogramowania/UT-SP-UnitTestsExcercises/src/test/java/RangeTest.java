import org.junit.Assert;
import org.junit.Test;

public class RangeTest {

    @Test
    public void shouldSayThat15IsInRange() {

    //given
    long testCaseNumber = 15;
    long lowerBound = 10;
    long upperBound = 20;
    Range range = new Range(lowerBound, upperBound);

    //when
    boolean result = range.isInRange(testCaseNumber);

    //than
        Assert.assertTrue(result);
    }
}
