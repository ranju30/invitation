import com.ArgumentHandler;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class ArgumentHandlerTest {
    @Test
    public void testGetRepresentationShouldReturnRepresentationAccordingToTheCondition() throws Exception {
        ArgumentHandler argumentHandler = new ArgumentHandler(new String[]{"./data/sample.csv", "lastNameFirst", "India", "20"});
        ArrayList<String> representation = argumentHandler.getRepresentation();
        assertEquals("Mr Kumar, Rito, India, 22", representation.get(0));
    }

    @Test
    public void testGetRepresentationShouldReturnRepresentationIfNoConditionIsGiven() throws Exception {
        ArgumentHandler argumentHandler = new ArgumentHandler(new String[]{"./data/sample.csv", "lastNameFirst"});
        ArrayList<String> representation = argumentHandler.getRepresentation();
        assertEquals("Mr Kumar, Rito", representation.get(0));
    }

    @Test
    public void testGetRepresentationShouldReturnRepresentationIfCountryIsGiven() throws Exception {
        ArgumentHandler argumentHandler = new ArgumentHandler(new String[]{"./data/sample.csv", "lastNameFirst","India"});
        ArrayList<String> representation = argumentHandler.getRepresentation();
        assertEquals("+---------------+\n| Mr Rito Kumar |\n|---------------|\n| Hooghly, WB   |\n| India         |\n+---------------+", representation.get(0));
    }
}
