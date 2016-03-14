package guest;

import designs.NamingConvention;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NameTest {
    @Test
    public void test_name_will_give_firstName_and_lastName() throws Exception {
        NamingConvention firstNameFirst = new NamingConvention("firstNameFirst");
        Name rito = new Name("Rito", "Kumar");
        String name = rito.getNameRepresentation(firstNameFirst);
        assertEquals("Rito Kumar", name);
    }

    @Test
    public void test_name_will_give_lastName_and_firstName() throws Exception {
        NamingConvention firstNameFirst = new NamingConvention("lastNameFirst");
        Name rito = new Name("Rito", "Kumar");
        String name = rito.getNameRepresentation(firstNameFirst);
        assertEquals("Kumar, Rito", name);
    }
}
