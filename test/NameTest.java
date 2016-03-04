import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NameTest {
    @Test
    public void test_name_will_give_firstName_and_lastName() throws Exception {
        Name ranju = new Name("Ranju", "Karmakar");
        String name = ranju.getName();
        assertEquals("Ranju Karmakar",name);
    }
}
