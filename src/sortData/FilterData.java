package sortData;

import filters.Filter;
import guest.Guest;

import java.util.ArrayList;

public class FilterData {

    private final ArrayList<Filter> filters;
    private final ArrayList<Guest> guests;

    public FilterData(ArrayList<Guest> guests, ArrayList<Filter> filters) {
        this.guests = guests;
        this.filters = filters;
    }

    public ArrayList<Guest> getFilterdGuest() {
        ArrayList<Guest> sortedGuest = new ArrayList<>();
        for (Guest guest : guests) {
            if (isValidGuest(guest)) {
                sortedGuest.add(guest);
            }
        }
        return sortedGuest;
    }

    private boolean isValidGuest(Guest guest) {
        for (Filter filter : filters) {
            if (!filter.isValid(guest))
                return false;
        }
        return true;
    }
}
