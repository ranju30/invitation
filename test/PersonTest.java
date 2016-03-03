import junit.framework.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PersonTest {
    @Test
    public void test_getName_will_give_the_name_of_the_person() throws Exception {
        Person person = new Person("Ranju","Karmakar","male",22, new String[]{"kolkata WB India"});
        String name = person.getName();
        assertEquals(name,"Ranju Karmakar");
    }

    @Test
    public void test_to_get_prefix_according_to_gender() throws Exception {
        Person ranju = new Person("Ranju","Karmakar","male",22, new String[]{"kolkata WB India"});
        Person girl = new Person("Shreya","Ghoshal","female",25, new String[]{"howrah WB India"});
        assertEquals("Mr ",ranju.generatePrefix());
        Assert.assertEquals("Ms ",girl.generatePrefix());
    }
}
