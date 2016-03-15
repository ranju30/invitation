package guest;

import designs.NameTemplate;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NameTest {
    @Test
    public void test_name_will_give_firstName_and_lastName() throws Exception {
        NameTemplate firstNameFirst = new NameTemplate("firstNameFirst");
        Name rito = new Name("Rito", "Kumar");
        String name = rito.getNameRepresentation(firstNameFirst);
        assertEquals("Rito Kumar", name);
    }

    @Test
    public void test_name_will_give_lastName_and_firstName() throws Exception {
        NameTemplate firstNameFirst = new NameTemplate("lastNameFirst");
        Name rito = new Name("Rito", "Kumar");
        String name = rito.getNameRepresentation(firstNameFirst);
        assertEquals("Kumar, Rito", name);
    }
}
