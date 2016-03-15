package guest;

import designs.NameTemplate;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

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
        Address address = new Address(city,state,country);
        rito = new Guest(name, g, age, address);
    }


    @Test
    public void testGetFormalLegalGuest() throws Exception {
        NameTemplate lastNameFirst = new NameTemplate("lastNameFirst");
        assertEquals("Mr Kumar, Rito, India, 22", rito.getRepresentationWithCountryAndAge(lastNameFirst));
    }

    @Test
    public void testGetInformalLegalGuest() throws Exception {
        NameTemplate firstNameFirst = new NameTemplate("firstNameFirst");
        assertEquals("Mr Rito Kumar, India, 22",rito.getRepresentationWithCountryAndAge(firstNameFirst));
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
        NameTemplate lastNameFirst = new NameTemplate("lastNameFirst");
        assertEquals("Mr Kumar, Rito",rito.getName(lastNameFirst));
    }

    @Test
    public void test_getInformalNameTemplate() throws Exception {
        NameTemplate firstNameFirst = new NameTemplate("firstNameFirst");
        assertEquals("Mr Rito Kumar",rito.getName(firstNameFirst));
    }

    @Test
    public void testgetFormalNameCountryTemplate() throws Exception {
        NameTemplate lastNameFirst = new NameTemplate("lastNameFirst");
        assertEquals("Mr Kumar, Rito, India",rito.getNameAndCountry(lastNameFirst));
    }
    @Test
    public void testgetInformalNameCountryTemplate() throws Exception {
        NameTemplate firstNameFirst = new NameTemplate("firstNameFirst");
        assertEquals("Mr Rito Kumar, India",rito.getNameAndCountry(firstNameFirst));
    }
}
