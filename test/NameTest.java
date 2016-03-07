import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NameTest {
    @Test
    public void test_name_will_give_firstName_and_lastName() throws Exception {
        Name ranju = new Name("Ranju", "Karmakar");
        String name = ranju.getFirstLastName();
        assertEquals("Ranju Karmakar", name);
    }

    @Test
    public void test_name_will_give_lastName_and_firstName() throws Exception {
        Name ranju = new Name("Ranju", "Karmakar");
        String name = ranju.getLastFirstName();
        assertEquals("Karmakar, Ranju", name);
    }
}
