package designs;

public class FirstNameFirst implements NameConvention {
    public String getNameRepresentation(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}
