package guest;

import designs.NamingConvention;

public class Name {

    private String firstName;
    private String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getNameRepresentation(NamingConvention format) {
        return format.getNameRepresentation(firstName, lastName);
    }
}
