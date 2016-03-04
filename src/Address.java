public class Address {
    private final String city;
    private final String state;
    private final String country;

    public Address(String city, String state, String country){
        this.city = city;
        this.state = state;
        this.country = country;
    }


    public String getCity() {
        return this.city;
    }

    public String getState() {
        return this.state;
    }

    public String getCountry() {
        return this.country;
    }
}
