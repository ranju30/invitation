package guest;

import designs.AddressTemplate;
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

    public String represent(Designs design, NameTemplate format) {
        AddressTemplate addressTemplate = new AddressTemplate();
        String nameRepresentation = this.getName(format);
        String entityRepresentation = address.getAddress(addressTemplate);
        return design.getDesign(nameRepresentation, entityRepresentation);
    }


}
