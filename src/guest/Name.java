package guest;

import designs.NameConvention;

public class Name {

    private String firstName;
    private String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getNameRepresentation(NameConvention nameFormat) {
        return nameFormat.getNameRepresentation(firstName, lastName);
    }

//    public String getRepresentation(NameConvention nameFormater) {
//        return nameFormater.getNameRepresentation(firstName,lastName);
//    }
}
