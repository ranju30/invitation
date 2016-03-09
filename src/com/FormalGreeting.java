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

    private ArrayList<String> getAllDetail(List<String> lines){
        ArrayList<String> list = new ArrayList<String>();
        for (String line : lines) {
            String[] array = line.split(",");
            Age age = new Age(array[3]);
            Country country = new Country(array[6]);
            if (country.isEqual(countryName) && age.isLegal(ageLimit)) {
                GuestGenerator guestGenerator = new GuestGenerator();
                Guest eachGuest = guestGenerator.getEachGuest(array);
                list.add(eachGuest.getFormalLegalGuest());
            }
        }
        return list;
    }

    public ArrayList<String> getFormalRepresentation() throws IOException {
        ReadFile readFile = new ReadFile();
        List<String> lines = readFile.getList(fileName);
        return getAllDetail(lines);
    }
}
