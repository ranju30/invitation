package guest;

public class Country {
    private String country;

    public Country(String country) {
        this.country = country;
    }

    public boolean isEqual(String anotherCountry) {
        return country.contains(anotherCountry);
    }

    public String getName() {
        return this.country;
    }
}
