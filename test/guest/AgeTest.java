package guest;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;

public class AgeTest {
    @Test
    public void test_to_get_the_age_if_a_person() throws Exception {
        Age age = new Age(30);
        assertEquals(30, age.getAge());
    }

    @Test
    public void test_to_check_eligibility_of_a_person_according_to_the_age() throws Exception {
        Age age = new Age(35);
        assertTrue(age.isLegal(30));
    }

    @Test
    public void test_to_check_eligibility_of_a_person_according_to_the_age_gives_false() throws Exception {
        Age age = new Age(25);
        assertFalse(age.isLegal(30));
    }
}
