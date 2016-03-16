package guest;

import designs.Designs;
import designs.NameTemplate;

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

    public boolean isFrom(String countryName) {
        return address.isEqualWith(countryName);
    }

    public boolean isLegalAge(int givenAge) {
        return age.isLegal(givenAge);
    }

    public String getName(NameTemplate format) {
        return String.format("%s %s", gender.title(), name.getNameRepresentation(format));
    }

    public String getNameAndCountry(NameTemplate format) {
        return String.format("%s %s, %s", gender.title(), name.getNameRepresentation(format), address.getCountry());
    }

    public String getRepresentationWithCountryAndAge(NameTemplate format) {
        return String.format("%s %s, %s, %s", gender.title(), name.getNameRepresentation(format), address.getCountry(), age.getAge());
    }

    public String getRepresentationWithStructure(Designs design, NameTemplate format) {
        String nameRepresentation = this.getName(format);
        String entityRepresentation = address.getCity() + ", " + address.getState() + "\n" + address.getCountry();
        return design.getDesign(nameRepresentation, entityRepresentation);
    }


}
