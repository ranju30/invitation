import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PersonTest {
    @Test
    public void test_getName_will_give_the_name_of_the_person() throws Exception {
        Person person = new Person("Ranju", "Karmakar", Gender.Male, "22", "kolkata", "WB", "India");
        String name = person.getTitleAndFirstNameFirst();
        assertEquals(name, "Mr Ranju Karmakar");
    }

    @Test
    public void test_to_get_age_of_a_given_detail() throws Exception {
        Person ranju = new Person("Ranju", "Karmakar", Gender.Male, "22",  "kolkata", "WB", "India");
        assertEquals("Mr Karmakar, Ranju",ranju.getTitleAndLastNameFirst());
    }

    @Test
    public void test_to_get_with_country_name_and_first_name() throws Exception {
        Person ranju = new Person("Ranju", "Karmakar", Gender.Male, "22",  "kolkata", "WB", "India");
        assertEquals("Mr Ranju Karmakar, India",ranju.getFirstNameFirstAndCountry());
    }

    @Test
    public void test_to_get_with_country_name_and_last_name() throws Exception {
        Person ranju = new Person("Ranju", "Karmakar", Gender.Male, "22",  "kolkata", "WB", "India");
        assertEquals("Mr Karmakar, Ranju, India",ranju.getLastNameFirstAndCountry());
    }
}
