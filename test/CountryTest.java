import guest.Country;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CountryTest {
    @Test
    public void test_to_check_when_two_country_are_equal() throws Exception {
        Country country = new Country("India");
        assertTrue(country.isEqual("India"));
    }
}
