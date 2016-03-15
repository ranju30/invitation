package filters;

import guest.Guest;

public interface Filter {
    Boolean isValid(Guest guest);
}
