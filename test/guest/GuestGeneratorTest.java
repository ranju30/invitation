package guest;

import designs.NamingConvention;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GuestGeneratorTest {
    @Test
    public void test_to_generate_guest_according_to_the_given_input_and_can_get_formal_representation() throws Exception {
        String[] array = {"Rito","Kumar","Male","22","Hooghly","WB","India"};
        GuestGenerator guestGenerator = new GuestGenerator();
        NamingConvention lastNameFirst = new NamingConvention("lastNameFirst");
        Guest eachGuest = guestGenerator.getEachGuest(array);
        assertEquals(eachGuest.getRepresentationWithCountryAndAge(lastNameFirst),"Mr Kumar, Rito, India, 22");
    }

    @Test
    public void test_to_generate_guest_according_to_the_given_input_and_can_get_informal_representation() throws Exception {
        String[] array = {"Rito","Kumar","Male","22","Hooghly","WB","India"};
        GuestGenerator guestGenerator = new GuestGenerator();
        Guest eachGuest = guestGenerator.getEachGuest(array);
        NamingConvention firstNameFirst = new NamingConvention("firstNameFirst");
        assertEquals(eachGuest.getRepresentationWithCountryAndAge(firstNameFirst),"Mr Rito Kumar, India, 22");
    }
}
