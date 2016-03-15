package guest;

import designs.NameTemplate;

public class Name {

    private String firstName;
    private String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getNameRepresentation(NameTemplate format) {
        return format.getNameRepresentation(firstName, lastName);
    }
}
