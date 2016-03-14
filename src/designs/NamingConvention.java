package designs;

public class NamingConvention {
    private String representationFormat;

    public NamingConvention(String representation) {
        this.representationFormat = representation;
    }

    public String getNameRepresentation(String firstName,String lastName){
        if(representationFormat.equals("firstNameFirst"))
            return firstName + " " + lastName;
        return lastName + ", " + firstName;
    }
}
