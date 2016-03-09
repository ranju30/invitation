import com.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;

public class GuestTest {

    private Guest ranju;

    @Before
    public void setUp() throws Exception {
        Name name = new Name("Rito", "Kumar");
        Gender g = Gender.MALE;
        Age age = new Age(22);
        City city = new City("Kolkata");
        State state = new State("WB");
        Country country = new Country("India");
        Address address = new Address(city,state,country);
        ranju = new Guest(name, g, age, address);
    }


    @Test
    public void testGetFormalLegalGuest() throws Exception {
        assertEquals("Mr Kumar, Rito, India, 22", ranju.getFormalTemplate());
    }

    @Test
    public void testGetInformalLegalGuest() throws Exception {
        assertEquals("Mr Rito Kumar, India, 22",ranju.getInformalTemplate());
    }

    @Test
    public void testToCheckAPersonIsFromACountry() throws Exception {
        assertTrue(ranju.isFrom("India"));
        assertFalse(ranju.isFrom("Pakistan"));
    }

    @Test
    public void testWheatherAgivenAgeIsLegalAccordingToCondition() throws Exception {
        assertTrue(ranju.isLegalAge(20));
        assertFalse(ranju.isLegalAge(25));

    }
}
