import com.FormalGreeting;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class FormalGreetingTest {
    @Test
    public void test_to_get_the_detail_from_a_particular_file_according_to_the_inputs() throws Exception {
        String[] args = {"./data/sample.csv","India","20"};
        FormalGreeting formalGreeting = new FormalGreeting(args);
        ArrayList<String> formalRepresentation = formalGreeting.getFormalRepresentation();
        assertEquals("Mr Karmakar, Ranju, India, 22",formalRepresentation.get(0));
    }
}
