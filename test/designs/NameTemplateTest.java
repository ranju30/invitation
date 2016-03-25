package designs;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NameTemplateTest {
    @Test
    public void testToCheckForFormalName() throws Exception {
        LastNameFirst lastNameFirst = new LastNameFirst();
        assertEquals(lastNameFirst.getNameRepresentation("Rito", "Kumar"), "Kumar, Rito");
    }

    @Test
    public void testToCheckForInformalName() throws Exception {
        FirstNameFirst firstNameFirst = new FirstNameFirst();
        assertEquals(firstNameFirst.getNameRepresentation("Rito", "Kumar"), "Rito Kumar");
    }
}