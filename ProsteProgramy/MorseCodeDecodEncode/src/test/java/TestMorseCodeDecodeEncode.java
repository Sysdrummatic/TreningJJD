import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class TestMorseCodeDecodeEncode {

    @Test
    public void testExampleFromDescription() {
        assertThat(MorseCodeDecodeEncode.decode(".... . -.--   .--- ..- -.. ."), is("HEY JUDE"));
    }
}
