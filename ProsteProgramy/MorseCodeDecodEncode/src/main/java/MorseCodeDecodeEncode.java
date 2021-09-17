public class MorseCodeDecodeEncode {

    public static String decode(String morseCode){

        String morseCodeToTranslate = morseCode;
        StringBuilder textAfterTranslation = new StringBuilder();

        morseCodeToTranslate = morseCodeToTranslate.toLowerCase();


        char[] letters = { ' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };
        String[] morseLetters = { "    ", ". ___", "___ . . .", "___ . ___ .", "___ . .", ".", ". . ___ .", "___ ___ .", ". . . .", ". .", ". ___ ___ ___", "___ . ___", ". ___ . .",  "___ ___", "___ .", "___ ___ ___", ". ___ ___ .", "___ ___ . ___", ". ___ .", ". . .", "_", ". . ___", ". . . ___", ". ___ ___", "___ . . ___", "___ . ___ ___", "___ ___ . .", ". ___ ___ ___ ___", ". . ___ ___ ___", ". . . ___ ___", ". . . . ___", ". . . . .", "___ . . . .", "___ ___ . . .", "___ ___ ___ . .", "___ ___ ___ ___ .", "___ ___ ___ ___ ___"};


        for (int i = 0; i < morseCodeToTranslate.length(); i++) {
            for (short j = 0; j < 37; j++) {
                if (morseCodeToTranslate.charAt(i) == letters[j]) {
                    textAfterTranslation.append(morseLetters[j]);
                    textAfterTranslation.append("   ");


                }
            }
        }
        return textAfterTranslation.toString();
    }

    public static String encode(String textToEncode){

        StringBuilder textAfterTranslation = new StringBuilder();
        textToEncode = textToEncode.toLowerCase();

        char[] letters = { ' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };
        String[] morseLetters = { " ", ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",  "--", "-.", "---", ".--.", "--.-", ".-.", "...", "_", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----"};

        for (int i = 0; i < textToEncode.length(); i++)
        {
            for (short j = 0; j < 37; j++)
            {
                if (textToEncode.charAt(i) == letters[j])
                {
                    textAfterTranslation.append(morseLetters[j]);
                    if (i != textToEncode.length()-1)
                    {
                        textAfterTranslation.append(" ");
                    }
                    break;
                }
            }
        }
        return textAfterTranslation.toString();
    }
}
