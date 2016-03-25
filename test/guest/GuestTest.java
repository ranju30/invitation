package guest;

import designs.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.*;

public class GuestTest {

    private Guest rito;

    @Before
    public void setUp() throws Exception {
        Name name = new Name("Rito", "Kumar");
        Gender g = Gender.MALE;
        Age age = new Age(22);
        City city = new City("Kolkata");
        State state = new State("WB");
        Country country = new Country("India");
        Address address = new Address(city, state, country);
        rito = new Guest(name, g, age, address);
    }



    @Test
    public void testToCheckAPersonIsFromACountry() throws Exception {
        assertTrue(rito.isFrom("India"));
        assertFalse(rito.isFrom("Pakistan"));
    }


    @Test
    public void testWheatherAgivenAgeIsLegalAccordingToCondition() throws Exception {
        assertTrue(rito.isLegalAge(20));
        assertFalse(rito.isLegalAge(25));
    }

    @Test
    public void test_getFormalNameTemplate() throws Exception {
        NameConvention nameFormat = new LastNameFirst();
//        NameTemplate lastNameFirst = new NameTemplate("lastNameFirst");
        assertEquals("Mr Kumar, Rito", rito.getName(nameFormat));
    }

    @Test
    public void test_getInformalNameTemplate() throws Exception {
        NameConvention nameFormat = new FirstNameFirst();

//        NameTemplate firstNameFirst = new NameTemplate("firstNameFirst");
        assertEquals("Mr Rito Kumar", rito.getName(nameFormat));
    }


    @Test
    public void testGetRepresentationWithStructure() throws Exception {
        Designer designer = new Designer();
        NameConvention nameFormat = new FirstNameFirst();

//        NameTemplate firstNameFirst = new NameTemplate("firstNameFirst");
        String expected = "+---------------+\n" +
                "| Mr Rito Kumar |\n" +
                "|---------------|\n" +
                "| Kolkata, WB   |\n" +
                "| India         |\n" +
                "+---------------+";
        assertEquals(rito.represent(designer, nameFormat), expected);
    }
}
