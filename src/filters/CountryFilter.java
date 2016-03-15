package filters;

import guest.Guest;

public class CountryFilter implements Filter {
    private String givenCountry;

    public CountryFilter(String givenCountry) {
        this.givenCountry = givenCountry;
    }

    @Override
    public Boolean isValid(Guest guest) {
        return guest.isFrom(givenCountry);
    }
}
