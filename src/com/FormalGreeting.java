package com;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FormalGreeting {
    private String fileName;
    private String countryName;
    private String ageLimit;

    public FormalGreeting(String[] args) {
        this.fileName = args[0];
        this.countryName = args[1];
        this.ageLimit = args[2];
    }

    private Guest getEachGuest(String[] array){
        Name name = new Name(array[0],array[1]);
        Gender g = array[2].contains("Female") ? Gender.FEMALE : Gender.MALE;
        Age age = new Age(array[3]);
        City city = new City(array[4]);
        State state = new State(array[5]);
        Country country = new Country(array[6]);
        Address address = new Address(city,state,country);
        Guest eachGuest = new Guest(name, g,age,address);
        return eachGuest;
    }

    private ArrayList<String> getAllDetail(List<String> lines){
        ArrayList<String> list = new ArrayList<String>();
        for (String line : lines) {
            String[] array = line.split(",");
            Age age = new Age(array[3]);
            Country country = new Country(array[6]);
            if (country.isEqual(countryName) && age.isLegal(ageLimit)) {
                Guest eachGuest = getEachGuest(array);
                list.add(eachGuest.getFormalLegalGuest());
            }
        }
        return list;
    }

    public ArrayList<String> getFormalRepresentation() throws IOException {
        ReadFile readFile = new ReadFile(fileName);
        List<String> lines = readFile.getList();
        ArrayList<String> list = getAllDetail(lines);
        return list;
    }
}
