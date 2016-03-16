package designs;

public class NameTemplate {
    private String representationFormat;

    public NameTemplate(String representation) {
        this.representationFormat = representation;
    }

    public String getNameRepresentation(String firstName, String lastName) {
        if (representationFormat.equals("firstNameFirst"))
            return firstName + " " + lastName;
        return lastName + ", " + firstName;
    }
}
