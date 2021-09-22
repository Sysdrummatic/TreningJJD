public class MorseCodeDecodeEncode {

    public static String decode(String morseCode){

        StringBuilder textAfterTranslation = new StringBuilder();
        morseCode = morseCode.replaceAll("   "," + ");
        String[] splittedMorseCode = morseCode.split(" ");

        for (String splittedWithPlus : splittedMorseCode) {
            if (splittedWithPlus.equals("+")) {
                splittedWithPlus.replace("+", "   ");
            }
        }

        for (String splitted : splittedMorseCode) {
            for (short j = 0; j < 37; j++) {
                if (splitted.equals(AlfaMorseTables.morseLetters[j])) {
                    textAfterTranslation.append(AlfaMorseTables.letters[j]);
                    break;
                }
            }
        }
        return textAfterTranslation.toString();
    }

    public static String encode(String textToEncode){

        StringBuilder textAfterTranslation = new StringBuilder();
        textToEncode = textToEncode.toLowerCase();

        for (int i = 0; i < textToEncode.length(); i++)
        {
            for (short j = 0; j < 37; j++)
            {
                if (textToEncode.charAt(i) == AlfaMorseTables.letters[j])
                {
                    textAfterTranslation.append(AlfaMorseTables.morseLetters[j]);
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

class AlfaMorseTables {

    public static char[] letters = { ' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };
    static String[] morseLetters = { " ", ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",  "--", "-.", "---", ".--.", "--.-", ".-.", "...", "_", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----"};
}