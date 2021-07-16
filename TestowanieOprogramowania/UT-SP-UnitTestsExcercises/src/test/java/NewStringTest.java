import org.junit.Assert;
import org.junit.Test;

public class NewStringTest {

    @Test
    public void twoLiterals()
    {
        String someVariable = "Lukasz Michta";
        String otherVariable = "Lukasz Michta";

        Assert.assertEquals(someVariable,otherVariable);
        Assert.assertSame(someVariable,otherVariable);
    }

    @Test
    public void twoNewObjects()
    {
        String someVariable = new String("Lukasz Michta");
        String otherVariable = new String("Lukasz Michta");

        Assert.assertEquals(someVariable,otherVariable);
        Assert.assertSame(someVariable,otherVariable);
    }

    @Test
    public void literalAndInternedObject()
    {
        String someVariable = "Lukasz Michta";
        String otherVariable = new String("Lukasz Michta").intern();

        Assert.assertEquals(someVariable,otherVariable);
        Assert.assertSame(someVariable,otherVariable);
    }

}

