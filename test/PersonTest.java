import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PersonTest {
    @Test
    public void test_getName_will_give_the_name_of_the_person() throws Exception {
        Person person = new Person("Ranju", "Karmakar", "male", 22, "kolkata", "WB", "India");
        String name = person.getName();
        assertEquals(name, "Ranju Karmakar");
    }

    @Test
    public void test_to_get_age_of_a_given_detail() throws Exception {
        Person ranju = new Person("Ranju", "Karmakar", "male", 22,  "kolkata", "WB", "India");
        assertEquals(22,ranju.getAge());
    }

    @Test
    public void test_to_get_city_of_a_given_person() throws Exception {
        Person ranju = new Person("Ranju", "Karmakar", "male", 22,  "kolkata", "WB", "India");
        assertEquals("kolkata",ranju.getCity());
    }

    @Test
    public void test_to_get_state_of_a_given_person() throws Exception {
        Person ranju = new Person("Ranju", "Karmakar", "male", 22,  "kolkata", "WB", "India");
        assertEquals("WB",ranju.getState());
    }

    @Test
    public void test_to_get_country_of_a_given_detail() throws Exception {
        Person ranju = new Person("Ranju", "Karmakar", "male", 22,  "kolkata", "WB", "India");
        assertEquals("India",ranju.getCountry());
    }

    @Test
    public void test_to_get_prefix_according_to_gender() throws Exception {
        Person ranju = new Person("Ranju", "Karmakar", "male", 22,  "kolkata", "WB", "India");
        Person shreya = new Person("Shreya", "Ghoshal", "female", 25, "howrah", "WB", "India");
        assertEquals("Mr ", ranju.generatePrefix());
        assertEquals("Ms ", shreya.generatePrefix());
    }

    @Test
    public void test_to_get_name_and_prefix() throws Exception {
        Person ranju = new Person("Ranju", "Karmakar", "male", 22,  "kolkata", "WB", "India");
        assertEquals("Mr Ranju Karmakar",ranju.makeAddressing());
    }

    @Test
    public void test_to_get_name_and_prefix_for_female() throws Exception {
        Person shreya = new Person("Shreya", "Ghoshal", "female", 25, "howrah", "WB", "India");
        assertEquals("Ms Shreya Ghoshal", shreya.makeAddressing());
    }

    @Test
    public void test_to_get_name_and_country() throws Exception {
        Person ranju = new Person("Ranju", "Karmakar", "male", 22,  "kolkata", "WB", "India");
        Person shreya = new Person("Shreya", "Ghoshal", "female", 25, "howrah", "WB", "India");
        assertEquals("Mr Ranju Karmakar,India", ranju.getNameAndCountry());
        assertEquals("Ms Shreya Ghoshal,India", shreya.getNameAndCountry());
    }
}
