package filters;

import guest.Guest;
import guest.GuestGenerator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CountryFilterTest {
    private Guest guest;

    @Before
    public void setUp() throws Exception {
        String[] array = {"Rito", "Kumar", "Male", "22", "Hooghly", "WB", "India"};
        GuestGenerator guestGenerator = new GuestGenerator();
        guest = guestGenerator.getEachGuest(array);
    }

    @Test
    public void testToCheckAGivenCountryIsValidIfItfromThatCountryReturnTrue() throws Exception {
        CountryFilter countryFilter = new CountryFilter("India");
        assertTrue(countryFilter.isValid(guest));
    }

    @Test
    public void testToCheckAGivenCountryIsValidIfItfromThatCountryReturnFalse() throws Exception {
        CountryFilter countryFilter = new CountryFilter("Bangladesh");
        assertFalse(countryFilter.isValid(guest));
    }

}