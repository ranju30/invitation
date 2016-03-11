import guest.Guest;
import guest.GuestGenerator;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GuestGeneratorTest {
    @Test
    public void test_to_generate_guest_according_to_the_given_input_and_can_get_formal_representation() throws Exception {
        String[] array = {"Rito","Kumar","Male","22","Hooghly","WB","India"};
        GuestGenerator guestGenerator = new GuestGenerator();
        Guest eachGuest = guestGenerator.getEachGuest(array);
        assertEquals(eachGuest.getFormalTemplate(),"Mr Kumar, Rito, India, 22");
    }

    @Test
    public void test_to_generate_guest_according_to_the_given_input_and_can_get_informal_representation() throws Exception {
        String[] array = {"Rito","Kumar","Male","22","Hooghly","WB","India"};
        GuestGenerator guestGenerator = new GuestGenerator();
        Guest eachGuest = guestGenerator.getEachGuest(array);
        assertEquals(eachGuest.getInformalTemplate(),"Mr Rito Kumar, India, 22");
    }
}
