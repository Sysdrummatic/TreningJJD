package pl.michta;

import java.util.Arrays;
import java.util.List;

public class TransformCSVtoObject {

    public static final String NOV = "nov.";

    static Address parseAddress(String addressAsString) {


        List<String> splittedAddress = Arrays.asList(addressAsString.split(","));

        String firstPartOfAddress = splittedAddress.get(0);
        String secondPartOfAddress = splittedAddress.get(1);

        String thirdPartOfAddress = "";
        String fourthPartOfAddress = "";

        if (splittedAddress.size() > 2) {

            thirdPartOfAddress = splittedAddress.get(2);
        }

        if (splittedAddress.size() > 3) {

            fourthPartOfAddress = splittedAddress.get(3);
        }

        String administrativeArea = concatAdministrativeAreaIfExist(firstPartOfAddress, secondPartOfAddress);
        String city = checkCityPositionInAddress(firstPartOfAddress, secondPartOfAddress, thirdPartOfAddress);
        String street = extractStreetNameFromAddress(firstPartOfAddress, secondPartOfAddress, thirdPartOfAddress, fourthPartOfAddress);
        String houseNumber = extractBuildingNumberFromAddress(firstPartOfAddress, secondPartOfAddress, thirdPartOfAddress, fourthPartOfAddress);
        String houseName = checkBuildingName(firstPartOfAddress, secondPartOfAddress, thirdPartOfAddress, fourthPartOfAddress);

        return new Address(administrativeArea, city, street, houseNumber, houseName);
    }

    private static String concatAdministrativeAreaIfExist(String firstPart, String secondPart) {
        String adminAreaCombined;
        String keywordPag = "pag."; //alt crtl c
        boolean foundPag = Arrays.asList(secondPart.split(" ")).contains(keywordPag);
        if (foundPag) {
            adminAreaCombined = firstPart.concat(secondPart);
        } else if (firstPart.contains(NOV)) {

            adminAreaCombined = firstPart;
        } else {
            adminAreaCombined = null;
        }
        return adminAreaCombined;
    }

    private static String checkCityPositionInAddress(String firstPart, String secondPart, String thirdPart) {
        String city;
        String keywordPag = "pag.";
        Boolean foundPag = Arrays.asList(secondPart.split(" ")).contains(keywordPag);
        Boolean foundNov = Arrays.asList(firstPart.split(" ")).contains(NOV);
        if (foundNov && foundPag) {
            city = thirdPart;
        } else if (foundNov) {

            city = secondPart;
        } else {
            city = firstPart;
        }
        return city.trim();
    }

    private static String extractStreetNameFromAddress(String firstPart, String secondPart, String thirdPart, String fourthPart) {
        String street;
        String keywordPag = "pag.";
        Boolean foundPag = Arrays.asList(secondPart.split(" ")).contains(keywordPag);
        Boolean foundNov = Arrays.asList(firstPart.split(" ")).contains(NOV);
        if (fourthPart.endsWith("\"")) {
            street = null;
        } else if (foundNov && foundPag) {
            String[] supportArray = fourthPart.split("\\d+", 2);
            street = supportArray[0].trim();
        } else if (foundNov) {
            String[] supportArray = thirdPart.split("\\d+", 2);
            street = supportArray[0].trim();
        } else {
            String[] supportArray = secondPart.split("\\d+", 2);
            street = supportArray[0].trim();
        }
        return street;
    }

    private static String extractBuildingNumberFromAddress(String firstPart, String secondPart, String thirdPart, String fourthPart) {
        String number = null;
        String keywordPag = "pag.";
        Boolean foundPag = Arrays.asList(secondPart.split(" ")).contains(keywordPag);
        Boolean foundNov = Arrays.asList(firstPart.split(" ")).contains(NOV);
        if (!firstPart.endsWith("\"") && !secondPart.endsWith("\"") && !thirdPart.endsWith("\"") & !fourthPart.endsWith("\"")) {
            if (foundNov && foundPag) {
                String[] supportArray = fourthPart.split("\\d+", 2);
                String supportString = supportArray[0].trim();
                number = fourthPart.substring(supportString.length() + 1).trim();
            } else if (foundNov) {
                String[] supportArray = thirdPart.split("\\d+", 2);
                String supportString = supportArray[0].trim();
                number = thirdPart.substring(supportString.length() + 1).trim();
            } else {
                String[] supportArray = secondPart.split("\\d+", 2);
                String supportString = supportArray[0].trim();
                number = secondPart.substring(supportString.length() + 1).trim();
            }
        }
        return number;
    }

    private static String checkBuildingName(String firstPart, String secondPart, String thirdPart, String fourthPart) {
        String name = null;
        String keywordPag = "pag.";
        Boolean foundPag = Arrays.asList(secondPart.split(" ")).contains(keywordPag);
        Boolean foundNov = Arrays.asList(firstPart.split(" ")).contains(NOV);
        if (firstPart.endsWith("\"") || secondPart.endsWith("\"") || thirdPart.endsWith("\"") || fourthPart.endsWith("\"")) {
            if (foundNov && foundPag) {
                name = fourthPart.trim();
            } else {
                name = thirdPart.trim();
            }
        }
        return name;
    }
}
