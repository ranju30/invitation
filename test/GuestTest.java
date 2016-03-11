import com.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;

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
        assertEquals("Mr Kumar, Rito, India, 22", rito.getFormalTemplate());
    }

    @Test
    public void testGetInformalLegalGuest() throws Exception {
        assertEquals("Mr Rito Kumar, India, 22",rito.getInformalTemplate());
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
        assertEquals("Mr Kumar, Rito",rito.getFormalNameTemplate());
    }

    @Test
    public void test_getInformalNameTemplate() throws Exception {
        assertEquals("Mr Rito Kumar",rito.getInformalNameTemplate());
    }

    @Test
    public void testgetFormalNameCountryTemplate() throws Exception {
        assertEquals("Mr Kumar, Rito, India",rito.getFormalNameCountryTemplate());
    }
    @Test
    public void testgetInformalNameCountryTemplate() throws Exception {
        assertEquals("Mr Rito Kumar, India",rito.getInformalNameAndCountryTemplate());
    }
}
