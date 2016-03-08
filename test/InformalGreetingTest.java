import com.InformalGreeting;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class InformalGreetingTest {
    @Test
    public void test_to_get_the_detail_from_a_particular_file_according_to_the_inputs() throws Exception {
        String[] args = {"./data/sample.csv","India","20"};
        InformalGreeting informalGreeting = new InformalGreeting(args);
        ArrayList<String> informalRepresentation = informalGreeting.getInformalRepresentation();
        assertEquals("Mr Ranju Karmakar, India, 22",informalRepresentation.get(0));
    }
}
