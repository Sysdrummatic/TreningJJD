public class Address {

    private String address;
    private String city;
    private String street;
    private String houseNumber;
    private String buildingName;
    private String cityArea;

    public Address(){

    }
    public Address(String address, String city, String street, String houseNumber, String buildingName, String cityArea) {
        this.address = address;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.buildingName = buildingName;
        this.cityArea = cityArea;
    }

    public String getAddress() {
        return address;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    private void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    private void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    private void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getBuildingName() {
        return buildingName;
    }

    private void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getCityArea() {
        return cityArea;
    }

    private void setCityArea(String cityArea) {
        this.cityArea = cityArea;
    }

    public Address parseAddress(String addressAsString){

        return new Address(address, city, street, houseNumber, buildingName, cityArea);
    }
}


   /*
I powinna działać tak

Address address = parseAddress("Rīga, Āraišu iela 36 - 1A")
address.getCity() == "Riga"
address.getStreet() == "Āraišu iela"
address.getHouseNumber() == "36 - 1A"
*/

