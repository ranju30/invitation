package designs;

public class LastNameFirst implements NameConvention {
    @Override
    public String getNameRepresentation(String firstName, String lastName) {
        return lastName + ", " + firstName;
    }
}
