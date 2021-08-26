public class Address {

    private String city;
    private String street;
    private String houseNumber;
    private String buildingName;
    private String cityArea;
/*
    public Address(){
    }
*/
    public Address(String city, String street, String houseNumber, String buildingName, String cityArea) {

        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.buildingName = buildingName;
        this.cityArea = cityArea;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public String getCityArea() {
        return cityArea;
    }
}
