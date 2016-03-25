package designs;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class DesignerTest {


    @Test
    public void test_to_get_the_output_according_to_the_pattern() throws Exception {
        String nameRepresentation = "Mr Balistreri, Rodolfo";
        String entityRepresentation = "Crooks ton, Georgia\n" + "Bangladesh";
        Designer designer = new Designer();
        String expected = "+------------------------+\n" +
                "| Mr Balistreri, Rodolfo |\n" +
                "|------------------------|\n" +
                "| Crooks ton, Georgia    |\n" +
                "| Bangladesh             |\n" +
                "+------------------------+";
        assertEquals(designer.getDesign(nameRepresentation, entityRepresentation), expected);
    }

    @Test
    public void test_to_get_the_output_according_to_the_pattern_where_Address_is_Bigger() throws Exception {
        String nameRepresentation = "Mr Balistreri, Rodolfo";
        String entityRepresentation = "Hydrabad, Andhrapradesh\n" + "India";
        Designer designer = new Designer();
        String expected = "+-------------------------+\n" +
                "| Mr Balistreri, Rodolfo  |\n" +
                "|-------------------------|\n" +
                "| Hydrabad, Andhrapradesh |\n" +
                "| India                   |\n" +
                "+-------------------------+";
        assertEquals(designer.getDesign(nameRepresentation, entityRepresentation), expected);
    }


    @Test
    public void test_to_get_the_output_according_to_the_pattern_where_countryName_Is_highestLength() throws Exception {
        String nameRepresentation = "Mr Balistreri, Rodolfo";
        String entityRepresentation = "Crooks ton, Georgia\n" + "Slovakia (Slovak Republic)";
        Designer designer = new Designer();
        String expected = "+----------------------------+\n" +
                "| Mr Balistreri, Rodolfo     |\n" +
                "|----------------------------|\n" +
                "| Crooks ton, Georgia        |\n" +
                "| Slovakia (Slovak Republic) |\n" +
                "+----------------------------+";
        assertEquals(designer.getDesign(nameRepresentation, entityRepresentation), expected);
    }


}