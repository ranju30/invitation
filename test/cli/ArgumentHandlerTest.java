package cli;

import filters.Filter;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class ArgumentHandlerTest {
    @Test
    public void testToGetFilterWhenCountryNameIsGiven() throws Exception {
        String[] args = {"-f", "-c", "India", "-a","20", "data/records"};
        ArgumentHandler argumentHandler = new ArgumentHandler(args);
        ArrayList<Filter> filter = argumentHandler.getFilters();
        assertEquals(2, filter.size());
    }

    @Test
    public void testGetFileName() throws Exception {
        String[] args = {"-l", "-c", "India", "-a","20", "data/records"};
        ArgumentHandler argumentHandler = new ArgumentHandler(args);
        assertEquals("data/records", argumentHandler.getFileName());
    }

}
