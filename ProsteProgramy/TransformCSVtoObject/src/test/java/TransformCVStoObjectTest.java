import org.junit.Before;
import org.junit.Test;

public class TransformCVStoObjectTest {
private Address address;

    @Before
    public void dataSetUp(){
        String givenAddress1 = "Rīga, Āraišu iela 36 - 1A";
        String givenAddress2 = "Jelgavas nov., Cenu pag., Brankas, Spartaka iela 9 - 13";
        String givenAddress3 = "Dundagas nov., Kolkas pag., Kolka, \"Krastnieki\"";
        address = new Address(null, "Rīga","Āraišu iela","36 - 1A", null);
    }

    @Test
    public void checkIfParseAddressCityIsCorrect(){


        address.getCity();
    }
}
