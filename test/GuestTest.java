import com.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GuestTest {

    private Guest ranju;

    @Before
    public void setUp() throws Exception {
        Name name = new Name("Ranju", "Karmakar");
        Gender g = Gender.MALE;
        Age age = new Age("22");
        City city = new City("Kolkata");
        State state = new State("WB");
        Country country = new Country("India");
        Address address = new Address(city,state,country);
        ranju = new Guest(name, g, age, address);
    }

    @Test
    public void test_getName_will_give_the_name_of_the_person() throws Exception {
        String name = ranju.getTitleAndFirstNameFirst();
        assertEquals(name, "Mr Ranju Karmakar");
    }

    @Test
    public void test_to_get_age_of_a_given_detail() throws Exception {
        assertEquals("Mr Karmakar, Ranju", ranju.getTitleAndLastNameFirst());
    }

    @Test
    public void test_to_get_with_country_name_and_first_name() throws Exception {
        assertEquals("Mr Ranju Karmakar, India", ranju.getFirstNameFirstAndCountry());
    }

    @Test
    public void test_to_get_with_country_name_and_last_name() throws Exception {
        assertEquals("Mr Karmakar, Ranju, India", ranju.getLastNameFirstAndCountry());
    }

    @Test
    public void testGetInformalLegalAgedGuest() throws Exception {
        assertEquals("Mr Ranju Karmakar, India, 22", ranju.getInformalLegalAgedGuest());
    }

    @Test
    public void testGetFormalLegaledGuest() throws Exception {
        assertEquals("Mr Karmakar, Ranju, India, 22", ranju.getFormalLegalGuest());
    }
}
