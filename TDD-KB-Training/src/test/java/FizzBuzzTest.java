import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void shouldProcessSingleNumber(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals("1",fizzBuzz.process(1));
        assertEquals("2", fizzBuzz.process(2));
        assertEquals("Fizz", fizzBuzz.process(3));
        assertEquals("4", fizzBuzz.process(4));
        assertEquals("Buzz", fizzBuzz.process(5));
        assertEquals("6", fizzBuzz.process(6));
        assertEquals("7", fizzBuzz.process(7));
        assertEquals("8", fizzBuzz.process(8));
        assertEquals("9", fizzBuzz.process(9));
        assertEquals("10", fizzBuzz.process(10));
        assertEquals("11", fizzBuzz.process(11));
        assertEquals("12", fizzBuzz.process(12));
        assertEquals("13", fizzBuzz.process(13));
        assertEquals("14", fizzBuzz.process(14));
        assertEquals("FizzBuzz", fizzBuzz.process(15));
    }

}
