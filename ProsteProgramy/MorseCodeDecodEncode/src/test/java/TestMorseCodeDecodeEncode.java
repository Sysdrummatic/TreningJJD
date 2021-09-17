import org.junit.Assert;
import org.junit.Test;

public class TestMorseCodeDecodeEncode {

    @Test
    public void testIfMessageIsDecodedCorrect() {
        Assert.assertEquals("hej jude",MorseCodeDecodeEncode.decode(".... . -.--   .--- ..- -.. ."));
    }

    @Test
    public void testIfMessageIsEncodedCorrect() {

        Assert.assertEquals(".... . -.--   .--- ..- -.. .", MorseCodeDecodeEncode.encode("HEY JUDE"));
    }

}
