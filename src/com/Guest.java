package com;

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

    public String getTitleAndFirstNameFirst() {
        return String.format("%s %s", gender, name.getFirstLastName());
    }

    public String getTitleAndLastNameFirst() {
        return String.format("%s %s", gender, name.getLastFirstName());
    }

    public String getFirstNameFirstAndCountry() {
        return String.format("%s, %s", this.getTitleAndFirstNameFirst(), address.getCountry());
    }

    public String getLastNameFirstAndCountry() {
        return String.format("%s, %s", this.getTitleAndLastNameFirst(), address.getCountry());
    }

    public String getInformalLegalAgedGuest() {
        return String.format("%s, %s", getFirstNameFirstAndCountry(), age.getAge());
    }

    public String getFormalLegalGuest() {
        return String.format("%s, %s", getLastNameFirstAndCountry(), age.getAge());
    }
    public boolean isFrom(String countryName){
        return address.isEqualWith(countryName);
    }
    public boolean isLegalAge(int givenAge){
        return age.isLegal(givenAge);
    }
}
