import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

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

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrownIllegalArgumentExceptionOnWrongParameters1(){
        new Range(20,10);
    }

    @Test
    public void shouldHaveProperErrorMessage(){
        try {
            new Range(20,10);
            fail("Exception wasn't thrown!");
        }
        catch(IllegalArgumentException exception){
            assertEquals("lowerBound is bigger than upperBound", exception.getMessage());
        }
    }

}
