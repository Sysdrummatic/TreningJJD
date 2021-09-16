public class MorseCodeDecodeEncode {

    public static String decode(String morseCode){

        String morseCodeToTranslate = morseCode;
        StringBuilder textAfterTranslation = new StringBuilder();



        morseCodeToTranslate = morseCodeToTranslate.toLowerCase();

        for (int i = 0; i < morseCodeToTranslate.length(); i++) {
            for (short j = 0; j < 37; j++) {
                if (morseCodeToTranslate.charAt(i) == AlfaMorseTables.letters[j]) {
                    textAfterTranslation.append(AlfaMorseTables.morseLetters[j]);
                    textAfterTranslation.append("   ");

                    break;
                }
            }
        }
        return textAfterTranslation.toString();
    }

    public static String encode(String morseCode){

        return "";
    }
}
