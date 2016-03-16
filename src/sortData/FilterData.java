package sortData;

import filters.Filter;
import guest.Guest;

import java.util.ArrayList;

public class FilterData {

    private final ArrayList<Filter> filters;

    public FilterData(ArrayList<Filter> filters) {
        this.filters = filters;
    }

    private boolean isValidGuest(Guest guest) {
        for (Filter filter : filters) {
            if (!filter.isValid(guest))
                return false;
        }
        return true;
    }

    public ArrayList<Guest> filter(ArrayList<Guest> guests) {
        ArrayList<Guest> filteredGuests = new ArrayList<>();
        for (Guest guest : guests) {
            if (isValidGuest(guest)) {
                filteredGuests.add(guest);
            }
        }
        return filteredGuests;
    }
}
