package argumentHandler;

import filters.Filter;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class ArgumentHandlerTest {
    @Test
    public void testToGetTheNameFormatAccordicToTheInputWhenInputIsF() throws Exception {
        String[] args = {"-f","-cIndia","-a20","data/records"};
        ArgumentHandler argumentHandler = new ArgumentHandler(args);
        assertEquals("firstNameFirst",argumentHandler.getOption());
    }

    @Test
    public void testToGetTheNameFormatAccordicToTheInputWhenInputIsL() throws Exception {
        String[] args = {"-l","-cIndia","-a20","data/records"};
        ArgumentHandler argumentHandler = new ArgumentHandler(args);
        assertEquals("lastNameFirst",argumentHandler.getOption());
    }

    @Test
    public void testToGetFilterWhencountryNameIsGiven() throws Exception {
        String[] args = {"-f","-cIndia","-a20","data/records"};
        ArgumentHandler argumentHandler = new ArgumentHandler(args);
        ArrayList<Filter> filter = argumentHandler.getFilter();
        assertEquals(2,filter.size());
    }

    @Test
    public void testGetFileName() throws Exception {
        String[] args = {"-l","-cIndia","-a20","data/records"};
        ArgumentHandler argumentHandler = new ArgumentHandler(args);
        assertEquals("data/records",argumentHandler.getFileName());
    }

}
