package designs;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NamingConventionTest {
    @Test
    public void testToCheckForFormalName() throws Exception {
        NamingConvention lastNameFirst = new NamingConvention("lastNameFirst");
        assertEquals(lastNameFirst.getNameRepresentation("Rito","Kumar"),"Kumar, Rito");
    }

    @Test
    public void testToCheckForInformalName() throws Exception {
        NamingConvention firstNameFirst = new NamingConvention("firstNameFirst");
        assertEquals(firstNameFirst.getNameRepresentation("Rito","Kumar"),"Rito Kumar");
    }
}