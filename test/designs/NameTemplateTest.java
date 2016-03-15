package designs;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NameTemplateTest {
    @Test
    public void testToCheckForFormalName() throws Exception {
        NameTemplate lastNameFirst = new NameTemplate("lastNameFirst");
        assertEquals(lastNameFirst.getNameRepresentation("Rito","Kumar"),"Kumar, Rito");
    }

    @Test
    public void testToCheckForInformalName() throws Exception {
        NameTemplate firstNameFirst = new NameTemplate("firstNameFirst");
        assertEquals(firstNameFirst.getNameRepresentation("Rito","Kumar"),"Rito Kumar");
    }
}