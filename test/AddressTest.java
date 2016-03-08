import com.Address;
import com.City;
import com.Country;
import com.State;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AddressTest {

    private Address address;

    @Before
    public void setUp() throws Exception {
        City city = new City("Kolkata");
        State state = new State("WB");
        Country country = new Country("India");
        address = new Address(city,state,country);
    }

    @Test
    public void test_from_address_for_getCountry() throws Exception {
        assertEquals("India", address.getCountry());
    }
}
