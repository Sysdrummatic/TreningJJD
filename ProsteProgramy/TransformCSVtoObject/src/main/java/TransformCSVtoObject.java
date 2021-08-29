import java.util.Arrays;

public class TransformCSVtoObject {



    public static void main(String[] args) {

        String givenAddress1 = "Rīga, Āraišu iela 36 - 1A";
        String givenAddress2 = "Jelgavas nov., Cenu pag., Brankas, Spartaka iela 9 - 13";
        String givenAddress3 = "Dundagas nov., Kolkas pag., Kolka, \"Krastnieki\"";
        String givenAddress4 = "Tukuma nov., Tukums, Eksporta iela 8";

       Address address = parseAddress(givenAddress2);


        System.out.println(address.getAdministrativeArea());
        System.out.println(address.getCity());
        System.out.println(address.getStreet());
        System.out.println(address.getHouseNumber());
        System.out.println(address.getHouseName());
    }

     static Address parseAddress(String addressAsString){

        String[] parts = addressAsString.split(",");

        int addressPartsLength = parts.length;


            String firstPartOfAddress = parts[0];
            String secondPartOfAddress = parts[1];
            String thirdPartOfAddress = parts[2];
            String fourthPartOfAddress = parts[3];
        //String fifthPartOfAddress = parts[4];


        String administrativeArea = concatAdministrativeAreaIfExist(firstPartOfAddress,secondPartOfAddress);
        String city = checkCityPositionInAddress(firstPartOfAddress,secondPartOfAddress,thirdPartOfAddress);
        String street = extractStreetNameFromAddress(firstPartOfAddress,secondPartOfAddress,thirdPartOfAddress,fourthPartOfAddress);
        String houseNumber = extractBuildingNumberFromAddress(firstPartOfAddress, secondPartOfAddress, thirdPartOfAddress,fourthPartOfAddress);
        String houseName = checkBuildingName(firstPartOfAddress,secondPartOfAddress,thirdPartOfAddress,fourthPartOfAddress);

        return new Address(administrativeArea, city, street, houseNumber, houseName);
    }

    public static String concatAdministrativeAreaIfExist(String firstPart, String secondPart){
        String adminAreaConcated;
        String keywordPag = "pag.";
        String keywordNov = "nov.";
        Boolean foundPag = Arrays.asList(secondPart.split(" ")).contains(keywordPag);
        Boolean foundNov = Arrays.asList(firstPart.split(" ")).contains(keywordNov);
        if(foundPag) {
            adminAreaConcated = firstPart.concat(secondPart);
        } else if(foundNov) {

                adminAreaConcated = firstPart;
            } else {
            adminAreaConcated = null;
        }
        return adminAreaConcated;
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
            street = null;
        } else if(foundNov&&foundPag) {
            street = fourthPart.replaceAll("\\d","").replaceAll("-","").trim();
        } else if(foundNov) {
            street = thirdPart.replaceAll("\\d","").replaceAll("-","").trim();
        } else {
            street = secondPart.replaceAll("\\d","").replaceAll("-","").trim();
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
                number = fourthPart.trim();
            } else {
                number = thirdPart.trim();
            }
        } else number = null;
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
        } else name = null;
        return name;
    }
}
