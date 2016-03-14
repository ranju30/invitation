package guest;

import designs.Designs;
import designs.NamingConvention;

public class Guest {

    private Name name;
    private Gender gender;
    private Age age;
    private Address address;

    public Guest(Name name, Gender gender, Age age, Address address) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    public String getRepresentationWithCountryAndAge(NamingConvention format) {
        return String.format("%s %s, %s, %s", gender, name.getNameRepresentation(format), address.getCountry(), age.getAge());
    }

    public boolean isFrom(String countryName) {
        return address.isEqualWith(countryName);
    }

    public boolean isLegalAge(int givenAge) {
        return age.isLegal(givenAge);
    }

    public String getName(NamingConvention format) {
        return String.format("%s %s", gender, name.getNameRepresentation(format));
    }

    public String getNameAndCountry(NamingConvention format) {
        return String.format("%s %s, %s", gender, name.getNameRepresentation(format), address.getCountry());
    }

    public String getRepresentationWithStructure(Designs design, NamingConvention format) {
        String nameRepresentation = gender.toString() + " " + name.getNameRepresentation(format);
        String entityRepresentation = address.getCity() + ", " + address.getState() + "\n" + address.getCountry();
        return design.getDesign(nameRepresentation, entityRepresentation);
    }


}
