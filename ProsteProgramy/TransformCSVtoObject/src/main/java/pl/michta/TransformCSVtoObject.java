package pl.michta;

import java.util.Arrays;
import java.util.List;

public class TransformCSVtoObject {

    public static final String NOV = "nov."; //Powstałe na skutek //alt crtl c
    public static final String PAG = "pag.";

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
        if (secondPart.contains(PAG)) {
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
        if (firstPart.contains(NOV) && secondPart.contains(PAG)) {
            city = thirdPart;
        } else if (firstPart.contains(NOV)) {
            city = secondPart;
        } else {
            city = firstPart;
        }
        return city.trim();
    }

    private static String extractStreetBuilder(String extractStreet) {
        String[] supportArray = extractStreet.split("\\d+", 2);
        extractStreet = supportArray[0].trim();
        return extractStreet;
    }

    private static String extractStreetNameFromAddress(String firstPart, String secondPart, String thirdPart, String fourthPart) {
        String street;
        if (fourthPart.endsWith("\"")) {
            street = null;
        } else if (firstPart.contains(NOV) && secondPart.contains(PAG)) {
            street = extractStreetBuilder(fourthPart);
        } else if (firstPart.contains(NOV)) {
            street = extractStreetBuilder(thirdPart);
        } else {
            street = extractStreetBuilder(secondPart);
        }
        return street;
    }

    private static String extractBuildingNameBuilder(String extractBuildingName) {
        String[] supportArray = extractBuildingName.split("\\d+", 2);
        String supportString = supportArray[0].trim();
        extractBuildingName = extractBuildingName.substring(supportString.length() + 1).trim();
        return extractBuildingName;
    }

    private static String extractBuildingNumberFromAddress(String firstPart, String secondPart, String thirdPart, String fourthPart) {
        String number = null;
        if (!firstPart.endsWith("\"") && !secondPart.endsWith("\"") && !thirdPart.endsWith("\"") & !fourthPart.endsWith("\"")) {
            if (firstPart.contains(NOV) && secondPart.contains(PAG)) {
                number = extractBuildingNameBuilder(fourthPart);
            } else if (firstPart.contains(NOV)) {
                number = extractBuildingNameBuilder(thirdPart);
            } else {
                number = extractBuildingNameBuilder(secondPart);
            }
        }
        return number;
    }

    private static String checkBuildingName(String firstPart, String secondPart, String thirdPart, String fourthPart) {
        String name = null;
        if (firstPart.endsWith("\"") || secondPart.endsWith("\"") || thirdPart.endsWith("\"") || fourthPart.endsWith("\"")) {
            if (firstPart.contains(NOV) && secondPart.contains(PAG)) {
                name = fourthPart.trim();
            } else {
                name = thirdPart.trim();
            }
        }
        return name;
    }
}
