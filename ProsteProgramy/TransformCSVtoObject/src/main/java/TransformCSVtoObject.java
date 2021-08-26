public class TransformCSVtoObject {

    public static void main(String[] args) {

       Address address = parseAddress("Rīga, Āraišu iela 36 - 1A");




    }

     static Address parseAddress(String addressAsString){

        String[] parts = addressAsString.split(",");

        String administrativeArea = parts[0];
        String city = parts[1];
        String street = parts[2];
        String houseNumber = parts[3];
        String houseName = parts[4];

        return new Address(administrativeArea, city, street, houseNumber, houseName);
    }
}


//"Rīga, Āraišu iela 36 - 1A"

/*
Address parseAddress(String addressAsString);

I powinna działać tak

Address address = parseAddress("Rīga, Āraišu iela 36 - 1A")
address.getCity() == "Riga"
address.getStreet() == "Āraišu iela"
address.getHouseNumber() == "36 - 1A"




 */