import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;


public class TestMorseCodeDecodeEncode {

    @Test
    public void testIfMessageIsDecodedCorrect() {
        Assert.assertEquals("hey jude",MorseCodeDecodeEncode.decode(".... . -.--   .--- ..- -.. ."));
    }

    @Test
    public void testIfMessageIsEncodedCorrect() {

        Assert.assertEquals(".... . -.--   .--- ..- -.. .", MorseCodeDecodeEncode.encode("HEY JUDE"));
    }

    @Test
    public void testIfListIsOK() {
        String morseCode = ".... . -.--   .--- ..- -.. .";
        List<String> splittedMorseCode = Arrays.asList(morseCode.split(" "));


        Assert.assertEquals(" ", splittedMorseCode.get(3));
    }

    @Test
    public void testIfPart4IsPlus() {
        String morseCode = ".... . -.--   .--- ..- -.. .";
        morseCode = morseCode.replaceAll("   "," + ");
        String[] splittedMorseCode = morseCode.split(" ");
        //splittedMorseCode[3].matches("+"," ");

        Assert.assertEquals("+", splittedMorseCode[3]);
    }

    @Test
    public void testIfListSizeIs2() {
        String morseCode = ".... . -.--   .--- ..- -.. .";
        morseCode = morseCode.replaceAll("   "," + ");
        String[] splittedMorseCode = morseCode.split(" ");
        //splittedMorseCode[3].matches("+"," ");

        Assert.assertEquals("+", splittedMorseCode[3]);
    }
}
