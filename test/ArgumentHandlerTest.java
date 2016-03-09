import com.ArgumentHandler;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class ArgumentHandlerTest {
    @Test
    public void testGetRepresentationShouldReturnRepresentationAccordingToTheCondition() throws Exception {
        ArgumentHandler argumentHandler = new ArgumentHandler(new String[]{"lastNameFirst", "./data/sample.csv", "India", "20"});
        ArrayList<String> representation = argumentHandler.getRepresentation();
        assertEquals("Mr Kumar, Rito, India, 22",representation.get(0));
    }
}
