package pl.michta;
import org.junit.Assert;
import org.junit.Test;

public class TransformCVStoObjectTest {

    @Test
    public void shouldParseAddressFindCityAndAddress() {

        //Given
        String addressString = "Rīga, Āraišu iela 36 - 1A";

        //When
        var address = TransformCSVtoObject.parseAddress(addressString);

        //Then
        Assert.assertNull(address.getAdministrativeArea());
        Assert.assertNull(address.getHouseName());
        Assert.assertEquals("Rīga", address.getCity());
        Assert.assertEquals("Āraišu iela", address.getStreet());
        Assert.assertEquals("36 - 1A", address.getHouseNumber());
    }

    @Test
    public void shouldParseAddressFindAdminAreaAndCityAndAddress() {

        //Given
        String addressString = "Jelgavas nov., Cenu pag., Brankas, Spartaka iela 9 - 13";

        //When
        var address = TransformCSVtoObject.parseAddress(addressString);

        //Then
        Assert.assertEquals("Jelgavas nov. Cenu pag.", address.getAdministrativeArea());
        Assert.assertNull(address.getHouseName());
        Assert.assertEquals("Brankas", address.getCity());
        Assert.assertEquals("Spartaka iela", address.getStreet());
        Assert.assertEquals("9 - 13", address.getHouseNumber());
    }

    @Test
    public void shouldParseAddressFindAdminAreaAndCityAndHouseName() {

        //Given
        String addressString = "Dundagas nov., Kolkas pag., Kolka, \"Krastnieki\"";

        //When
        var address = TransformCSVtoObject.parseAddress(addressString);

        //Then
        Assert.assertEquals("Dundagas nov. Kolkas pag.", address.getAdministrativeArea());
        Assert.assertEquals("\"Krastnieki\"", address.getHouseName());
        Assert.assertNull(address.getStreet());
        Assert.assertNull(address.getHouseNumber());
        Assert.assertEquals("Kolka", address.getCity());
    }

    @Test
    public void shouldParseAddressFindAdminAreaAndCityAndStreetAndHouseNumber() {

        //Given
        String addressString = "Tukuma nov., Tukums, Eksporta iela 8";

        //When
        var address = TransformCSVtoObject.parseAddress(addressString);

        //Then
        Assert.assertEquals("Tukuma nov.", address.getAdministrativeArea());
        Assert.assertNull( address.getHouseName());
        Assert.assertEquals("Eksporta iela",address.getStreet());
        Assert.assertEquals("8",address.getHouseNumber());
        Assert.assertEquals("Tukums", address.getCity());
    }
}
