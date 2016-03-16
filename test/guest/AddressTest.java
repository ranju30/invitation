package guest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AddressTest {

    private Address address;

    @Before
    public void setUp() throws Exception {
        City city = new City("Kolkata");
        State state = new State("WB");
        Country country = new Country("India");
        address = new Address(city, state, country);
    }

    @Test
    public void test_to_check_wheather_a_country_is_equal_or_not() throws Exception {
        assertTrue(address.isEqualWith("India"));
    }

    @Test
    public void test_to_check_wheather_a_country_is_equal_or_not_for_other_country() throws Exception {
        assertFalse(address.isEqualWith("Bangladesh"));
    }
}
