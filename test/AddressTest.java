import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AddressTest {

    @Test
    public void test_from_address_for_getCity() throws Exception {
        Address address = new Address("kolkata", "WB", "India");
        assertEquals("kolkata",address.getCity());
    }

    @Test
    public void test_to_get_state_of_a_given_address() throws Exception {
        Address address = new Address("kolkata", "WB", "India");
        assertEquals("WB",address.getState());
    }

    @Test
    public void test_to_get_country_name_from_a_given_address() throws Exception {
        Address address = new Address("kolkata", "WB", "India");
        assertEquals("India",address.getCountry());
    }
}
