package guest;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GenderTest {
    @Test
    public void test_prefix_for_male() throws Exception {
        Gender male = Gender.MALE;
        assertEquals(male.toString(), "Mr");
    }

    @Test
    public void test_prefix_for_female() throws Exception {
        Gender female = Gender.FEMALE;
        assertEquals(female.toString(), "Ms");
    }
}
