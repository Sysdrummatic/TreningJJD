import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TransformCVStoObjectTest {
    private Address objectFromGivenAddress1;
    private Address objectFromGivenAddress2;
    private Address objectFromGivenAddress3;
    private Address objectFromGivenAddress4;
    private Address objectFromMethod1;
    private Address objectFromMethod2;
    private Address objectFromMethod3;
    private Address objectFromMethod4;


    @Before
    public void dataSetUp(){
        String givenAddress1 = "Rīga, Āraišu iela 36 - 1A";
        String givenAddress2 = "Jelgavas nov., Cenu pag., Brankas, Spartaka iela 9 - 13";
        String givenAddress3 = "Dundagas nov., Kolkas pag., Kolka, \"Krastnieki\"";
        String givenAddress4 = "Tukuma nov., Tukums, Eksporta iela 8";
        objectFromGivenAddress1 = new Address("", "Rīga","Āraišu iela","36 - 1A", "");
        objectFromGivenAddress2 = new Address("Jelgavas nov. Cenu pag.", "Brankas","Spartaka iela","9 - 13", "");
        objectFromGivenAddress3 = new Address("Dundagas nov. Kolkas pag.", "Kolka","","", "\"Krastnieki\"");
        objectFromGivenAddress4 = new Address("Tukuma nov.", "Tukums","Eksporta iela","8", "");
        objectFromMethod1 = TransformCSVtoObject.parseAddress(givenAddress1);
        objectFromMethod2 = TransformCSVtoObject.parseAddress(givenAddress2);
        objectFromMethod3 = TransformCSVtoObject.parseAddress(givenAddress3);
        objectFromMethod4 = TransformCSVtoObject.parseAddress(givenAddress4);
    //Riga
    }
    @Test
    public void checkIfParseAddressAdministrativeAreaIsCorrectForRiga(){
        Assert.assertEquals(objectFromGivenAddress1.getAdministrativeArea(), objectFromMethod1.getAdministrativeArea());
    }
    @Test
    public void checkIfParseAddressCityIsCorrectForRiga(){
        Assert.assertEquals(objectFromGivenAddress1.getCity(), objectFromMethod1.getCity());
    }
    @Test
    public void checkIfParseAddressStreetIsCorrectForRiga(){
        Assert.assertEquals(objectFromGivenAddress1.getStreet(), objectFromMethod1.getStreet());
    }
    @Test
    public void checkIfParseAddressBuildingNoIsCorrectForRiga(){
        Assert.assertEquals(objectFromGivenAddress1.getHouseNumber(), objectFromMethod1.getHouseNumber());
    }
    @Test
    public void checkIfParseAddressBuildingNameIsCorrectForRiga(){
        Assert.assertEquals(objectFromGivenAddress1.getHouseName(), objectFromMethod1.getHouseName());
    }
    //Brankas
    @Test
    public void checkIfParseAddressAdministrativeAreaIsCorrectForBrankas(){
        Assert.assertEquals(objectFromGivenAddress2.getAdministrativeArea(), objectFromMethod2.getAdministrativeArea());
    }
    @Test
    public void checkIfParseAddressCityIsCorrectForBrankas(){
        Assert.assertEquals(objectFromGivenAddress2.getCity(), objectFromMethod2.getCity());
    }
    @Test
    public void checkIfParseAddressStreetIsCorrectForBrankas(){
        Assert.assertEquals(objectFromGivenAddress2.getStreet(), objectFromMethod2.getStreet());
    }
    @Test
    public void checkIfParseAddressBuildingNoIsCorrectForBrankas(){
        Assert.assertEquals(objectFromGivenAddress2.getHouseNumber(), objectFromMethod2.getHouseNumber());
    }
    @Test
    public void checkIfParseAddressBuildingNameIsCorrectForBrankas(){
        Assert.assertEquals(objectFromGivenAddress2.getHouseName(), objectFromMethod2.getHouseName());
    }
    //Kolka
    @Test
    public void checkIfParseAddressAdministrativeAreaIsCorrectForKolka(){
        Assert.assertEquals(objectFromGivenAddress3.getAdministrativeArea(), objectFromMethod3.getAdministrativeArea());
    }
    @Test
    public void checkIfParseAddressCityIsCorrectForKolka(){
        Assert.assertEquals(objectFromGivenAddress3.getCity(), objectFromMethod3.getCity());
    }
    @Test
    public void checkIfParseAddressStreetIsCorrectForKolka(){
        Assert.assertEquals(objectFromGivenAddress3.getStreet(), objectFromMethod3.getStreet());
    }
    @Test
    public void checkIfParseAddressBuildingNoIsCorrectForKolka(){
        Assert.assertEquals(objectFromGivenAddress3.getHouseNumber(), objectFromMethod3.getHouseNumber());
    }
    @Test
    public void checkIfParseAddressBuildingNameIsCorrectForKolka(){
        Assert.assertEquals(objectFromGivenAddress3.getHouseName(), objectFromMethod3.getHouseName());
    }
    //Tukums
    @Test
    public void checkIfParseAddressAdministrativeAreaIsCorrectForTukums(){
        Assert.assertEquals(objectFromGivenAddress4.getAdministrativeArea(), objectFromMethod4.getAdministrativeArea());
    }
    @Test
    public void checkIfParseAddressCityIsCorrectForTukums(){
        Assert.assertEquals(objectFromGivenAddress4.getCity(), objectFromMethod4.getCity());
    }
    @Test
    public void checkIfParseAddressStreetIsCorrectForTukums(){
        Assert.assertEquals(objectFromGivenAddress4.getStreet(), objectFromMethod4.getStreet());
    }
    @Test
    public void checkIfParseAddressBuildingNoIsCorrectForTukums(){
        Assert.assertEquals(objectFromGivenAddress4.getHouseNumber(), objectFromMethod4.getHouseNumber());
    }
    @Test
    public void checkIfParseAddressBuildingNameIsCorrectForTukums(){
        Assert.assertEquals(objectFromGivenAddress4.getHouseName(), objectFromMethod4.getHouseName());
    }
}
