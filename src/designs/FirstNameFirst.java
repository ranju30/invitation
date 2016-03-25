package designs;

public class FirstNameFirst implements NameConvention {
    @Override
    public String getNameRepresentation(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}
