import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class TestMorseCodeDecodeEncode {

    @Test
    public void shouldTranslateMorseCodeToText() {

        //Given
        String morseCodeExample = ".... . -.--   .--- ..- -.. .";

        //When
        var textToDecode = MorseCodeDecodeEncode.decode(morseCodeExample);

        //Then
        Assert.assertEquals("hey jude", textToDecode);
    }

    @Test
    public void shouldTranslateTextToMorseCode() {

        //Given
        String textToEncode = "HEY JUDE";

        //When
        var encodedText = MorseCodeDecodeEncode.encode(textToEncode);

        //Then
        Assert.assertEquals(".... . -.--   .--- ..- -.. .", encodedText);
    }

    @Test
    public void testIfListIsOK() {
        //Given

        //When

        //Then

        String morseCode = ".... . -.--   .--- ..- -.. .";
        List<String> splittedMorseCode = Arrays.asList(morseCode.split(" "));


        Assert.assertEquals(" ", splittedMorseCode.get(3));
    }

    @Test
    public void testIfPart4IsPlus() {
        //Given

        //When

        //Then

        String morseCode = ".... . -.--   .--- ..- -.. .";
        morseCode = morseCode.replaceAll("   ", " + ");
        String[] splittedMorseCode = morseCode.split(" ");
        //splittedMorseCode[3].matches("+"," ");

        Assert.assertEquals("+", splittedMorseCode[3]);
    }

    @Test
    public void testIfListSizeIs2() {
        //Given

        //When

        //Then

        String morseCode = ".... . -.--   .--- ..- -.. .";
        morseCode = morseCode.replaceAll("   ", " + ");
        String[] splittedMorseCode = morseCode.split(" ");
        //splittedMorseCode[3].matches("+"," ");

        Assert.assertEquals("+", splittedMorseCode[3]);
    }
}
