import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMorseCodeDecodeEncode {

/*    @Before
//    public void dataSetup() {
//        String morseCodeToTranslate = ".... . -.--   .--- ..- -.. .";

    "HEY JUDE"
*/

    @Test
    public void testIfMessageIsDecodedCorrect() {
        Assert.assertEquals("hej jude",MorseCodeDecodeEncode.decode(".... . -.--   .--- ..- -.. ."));
    }

    @Test
    public void testIfMessageIsEncodedCorrect() {

        Assert.assertEquals(".... . -.--   .--- ..- -.. .", MorseCodeDecodeEncode.encode("HEY JUDE"));
    }

    @Test
    public void testIfDataFromTablesCanBeReached() {
        Assert.assertEquals('a',AlfaMorseTables.letters[1]);
    }

    @Test
    public void testTheLengthOfTheString() {
        String morseCodeToTranslate = ".... . -.--   .--- ..- -.. .";
        Assert.assertEquals(28,morseCodeToTranslate.length());
    }

    @Test
    public void testTheLengthOfTheCharTable() {

        Assert.assertEquals(37, AlfaMorseTables.letters.length);
    }
}
