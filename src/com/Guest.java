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

    public String getInformalTemplate() {
        return String.format("%s %s, %s, %s",gender,name.getFirstNameFirst(),address.getCountry(),age.getAge());
    }

    public String getFormalTemplate() {
        return String.format("%s %s, %s, %s",gender,name.getLastNameFirst(),address.getCountry(),age.getAge());
    }
    public boolean isFrom(String countryName){
        return address.isEqualWith(countryName);
    }
    public boolean isLegalAge(int givenAge){
        return age.isLegal(givenAge);
    }
}
