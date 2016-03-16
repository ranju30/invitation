package designs;

public class AddressTemplate {

    public String addressRepresentation(String city, String state, String country) {
       return String.format("%s, %s\n%s", city, state, country);
    }

}
