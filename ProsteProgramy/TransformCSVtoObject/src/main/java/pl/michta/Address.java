package pl.michta;

public class Address {

    private String administrativeArea;
    private String city;
    private String street;
    private String houseNumber;
    private String houseName;
/*
    public pl.michta.Address(){
    }
*/
    public Address(String administrativeArea, String city, String street, String houseNumber, String houseName) {

        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.houseName = houseName;
        this.administrativeArea = administrativeArea;
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

    public String getHouseName() {
        return houseName;
    }

    public String getAdministrativeArea() {
        return administrativeArea;
    }
}
