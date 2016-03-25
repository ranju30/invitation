package guest;

import designs.*;

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

    public String getName(NameConvention nameFormat) {
        return String.format("%s %s", gender.title(), name.getNameRepresentation(nameFormat));
    }

    public String represent(Designs design, NameConvention nameFormat) {
        AddressTemplate addressTemplate = new AddressTemplate();
        String nameRepresentation = this.getName(nameFormat);
        String entityRepresentation = address.getAddress(addressTemplate);
        return design.getDesign(nameRepresentation, entityRepresentation);
    }
}
