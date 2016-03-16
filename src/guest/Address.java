package guest;

import designs.AddressTemplate;

public class Address {
    private City city;
    private State state;
    private Country country;

    public Address(City city, State state, Country country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public Boolean isEqualWith(String anotherCountry) {
        return country.isEqual(anotherCountry);
    }

    public String getAddress(AddressTemplate addressTemplate) {
        return addressTemplate.addressRepresentation(city.getName(), state.getName(), country.getName());
    }
}
