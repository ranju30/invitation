package designs;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class FirstDesignTest {


    @Test
    public void test_to_get_the_output_according_to_the_pattern() throws Exception {
        String nameRepresentation = "Mr Balistreri, Rodolfo";
        String entityRepresentation = "Crooks ton, Georgia\n" + "Bangladesh";
        FirstDesign firstDesign = new FirstDesign();
        String expected = "+------------------------+\n"+
                        "| Mr Balistreri, Rodolfo |\n"+
                        "|------------------------|\n"+
                        "| Crooks ton, Georgia    |\n"+
                        "| Bangladesh             |\n"+
                        "+------------------------+";
        assertEquals(firstDesign.getDesign(nameRepresentation,entityRepresentation),expected);
    }

}