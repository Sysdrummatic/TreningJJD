import java.util.Arrays;
import java.util.List;

public class TransformCSVtoObject {

     static Address parseAddress(String addressAsString){

        String firstPartOfAddress;
        String secondPartOfAddress;
        String thirdPartOfAddress;
        String fourthPartOfAddress;

        List<String> splittedAddress = Arrays.asList(addressAsString.split(","));

         try{
             firstPartOfAddress = splittedAddress.get(0);
         } catch(IndexOutOfBoundsException e) {
             firstPartOfAddress = "";
         }

         try{
             secondPartOfAddress = splittedAddress.get(1);
         } catch(IndexOutOfBoundsException e) {
             secondPartOfAddress = "";
         }

         try{
             thirdPartOfAddress = splittedAddress.get(2);
         } catch(IndexOutOfBoundsException e) {
             thirdPartOfAddress = "";
         }

         try{
             fourthPartOfAddress = splittedAddress.get(3);
         } catch(IndexOutOfBoundsException e) {
             fourthPartOfAddress = "";
         }

        String administrativeArea = concatAdministrativeAreaIfExist(firstPartOfAddress,secondPartOfAddress);
        String city = checkCityPositionInAddress(firstPartOfAddress,secondPartOfAddress,thirdPartOfAddress);
        String street = extractStreetNameFromAddress(firstPartOfAddress,secondPartOfAddress,thirdPartOfAddress,fourthPartOfAddress);
        String houseNumber = extractBuildingNumberFromAddress(firstPartOfAddress, secondPartOfAddress, thirdPartOfAddress,fourthPartOfAddress);
        String houseName = checkBuildingName(firstPartOfAddress,secondPartOfAddress,thirdPartOfAddress,fourthPartOfAddress);

        return new Address(administrativeArea, city, street, houseNumber, houseName);
    }

    public static String concatAdministrativeAreaIfExist(String firstPart, String secondPart){
        String adminAreaCombined;
        String keywordPag = "pag.";
        String keywordNov = "nov.";
        boolean foundPag = Arrays.asList(secondPart.split(" ")).contains(keywordPag);
        boolean foundNov = Arrays.asList(firstPart.split(" ")).contains(keywordNov);
        if(foundPag) {
            adminAreaCombined = firstPart.concat(secondPart);
        } else if(foundNov) {

                adminAreaCombined = firstPart;
            } else {
            adminAreaCombined = "";
        }
        return adminAreaCombined;
    }

    public static String checkCityPositionInAddress(String firstPart, String secondPart, String thirdPart){
        String city;
        String keywordPag = "pag.";
        String keywordNov = "nov.";
        Boolean foundPag = Arrays.asList(secondPart.split(" ")).contains(keywordPag);
        Boolean foundNov = Arrays.asList(firstPart.split(" ")).contains(keywordNov);
        if(foundNov&&foundPag) {
            city = thirdPart;
        } else if(foundNov) {

            city = secondPart;
        } else {
            city = firstPart;
        }
        return city.trim();
    }

    public static String extractStreetNameFromAddress(String firstPart, String secondPart, String thirdPart,String fourthPart){
        String street;
        String keywordPag = "pag.";
        String keywordNov = "nov.";
        Boolean foundPag = Arrays.asList(secondPart.split(" ")).contains(keywordPag);
        Boolean foundNov = Arrays.asList(firstPart.split(" ")).contains(keywordNov);
        if(fourthPart.endsWith("\"")){
            street = "";
        } else if(foundNov&&foundPag) {
            String[] supportArray = fourthPart.split("\\d+",2);
            street = supportArray[0].trim();
        } else if(foundNov) {
            String[] supportArray = thirdPart.split("\\d+",2);
            street = supportArray[0].trim();
        } else {
            String[] supportArray = secondPart.split("\\d+",2);
            street = supportArray[0].trim();
        }
        return street;
    }

    public static String extractBuildingNumberFromAddress(String firstPart, String secondPart, String thirdPart,String fourthPart){
        String number;
        String keywordPag = "pag.";
        String keywordNov = "nov.";
        Boolean foundPag = Arrays.asList(secondPart.split(" ")).contains(keywordPag);
        Boolean foundNov = Arrays.asList(firstPart.split(" ")).contains(keywordNov);
        if(!firstPart.endsWith("\"")&&!secondPart.endsWith("\"")&&!thirdPart.endsWith("\"")&!fourthPart.endsWith("\"")) {
            if (foundNov && foundPag) {
                String[] supportArray = fourthPart.split("\\d+", 2);
                String supportString = supportArray[0].trim();
                number = fourthPart.substring(supportString.length() + 1).trim();
            } else if(foundNov){
                String[] supportArray = thirdPart.split("\\d+", 2);
                String supportString = supportArray[0].trim();
                number = thirdPart.substring(supportString.length() + 1).trim();
            } else {
                String[] supportArray = secondPart.split("\\d+", 2);
                String supportString = supportArray[0].trim();
                number = secondPart.substring(supportString.length() + 1).trim();
            }
        } else number = "";
        return number;
    }

    public static String checkBuildingName(String firstPart, String secondPart, String thirdPart,String fourthPart){
        String name;
        String keywordPag = "pag.";
        String keywordNov = "nov.";
        Boolean foundPag = Arrays.asList(secondPart.split(" ")).contains(keywordPag);
        Boolean foundNov = Arrays.asList(firstPart.split(" ")).contains(keywordNov);
        if(firstPart.endsWith("\"")||secondPart.endsWith("\"")||thirdPart.endsWith("\"")||fourthPart.endsWith("\"")) {
            if (foundNov && foundPag) {
                name = fourthPart.trim();
            } else {
                name = thirdPart.trim();
            }
        } else name = "";
        return name;
    }
}
