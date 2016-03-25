package guest;

import designs.FirstNameFirst;
import designs.LastNameFirst;
import designs.NameConvention;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NameTest {
    @Test
    public void test_name_will_give_firstName_and_lastName() throws Exception {
        NameConvention nameFormat = new FirstNameFirst();

//        NameTemplate firstNameFirst = new NameTemplate("firstNameFirst");
        Name rito = new Name("Rito", "Kumar");
        String name = rito.getNameRepresentation(nameFormat);
        assertEquals("Rito Kumar", name);
    }

    @Test
    public void test_name_will_give_lastName_and_firstName() throws Exception {
        NameConvention nameFormat = new LastNameFirst();

//        NameTemplate firstNameFirst = new NameTemplate("lastNameFirst");
        Name rito = new Name("Rito", "Kumar");
        String name = rito.getNameRepresentation(nameFormat);
        assertEquals("Kumar, Rito", name);
    }
}
