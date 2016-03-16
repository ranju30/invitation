package filters;

import guest.Guest;
import guest.GuestGenerator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AgeFilterTest {
    private Guest guest;

    @Before
    public void setUp() throws Exception {
        String[] array = {"Rito", "Kumar", "Male", "22", "Hooghly", "WB", "India"};
        GuestGenerator guestGenerator = new GuestGenerator();
        guest = guestGenerator.getEachGuest(array);
    }

    @Test
    public void testToCheckAGivenAgeIsValidIfItIsAboveTheLimit() throws Exception {
        AgeFilter ageFilter = new AgeFilter(20);
        assertTrue(ageFilter.isValid(guest));
    }

    @Test
    public void testToCheckAGivenAgeIsValidIfItIsAboveTheLimitReturnFalseIfNotValid() throws Exception {
        AgeFilter ageFilter = new AgeFilter(25);
        assertFalse(ageFilter.isValid(guest));
    }
}