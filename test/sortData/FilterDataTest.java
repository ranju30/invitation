package sortData;

import cli.ArgumentHandler;
import filters.Filter;
import guest.Guest;
import guest.GuestGenerator;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class FilterDataTest {
    private ArrayList<Guest> guests = new ArrayList<>();
    private ArrayList<Filter> filters = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        GuestGenerator generator = new GuestGenerator();
        guests.add(generator.createGuest(new String[]{"Julius", "Barrows", "Female", "18", "Veda haven", "Vermont", "Macedonia"}));
        guests.add(generator.createGuest(new String[]{"Melody", "Dooley", "Female", "31", "West Shanna", "Vermont", "Bangladesh"}));
        guests.add(generator.createGuest(new String[]{"Gavin", "Hyatt", "Male", "36", "Crooks ton", "Illinois", "Romania"}));
        guests.add(generator.createGuest(new String[]{"Carlos", "Johns", "Male", "35", "West Shanna", "South Carolina", "Bangladesh"}));
        guests.add(generator.createGuest(new String[]{"Brandt", "Huel", "Female", "25", "West Shanna", "Illinois", "Macedonia"}));
        String[] args = {"-f", "-cBan", "-a20", "data/records"};
        ArgumentHandler argumentHandler = new ArgumentHandler(args);
        filters = argumentHandler.getFilters();
    }

    @Test
    public void testToGetGuestsAccordingToTheCondition() throws Exception {
        String[] args = {"-f", "-cMacedonia", "-a15"};
        ArgumentHandler argumentHandler = new ArgumentHandler(args);
        filters = argumentHandler.getFilters();
        FilterData filterData = new FilterData(filters);
        ArrayList<Guest> filterGuest = filterData.filter(guests);
        assertEquals(2, filterGuest.size());
    }
}