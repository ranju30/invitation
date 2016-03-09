package com;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArgumentHandler {
    private String format;
    private String fileName;
    private String countryName;
    private String ageLimit;

    public ArgumentHandler(String[] args){
        this.format = args[0];
        this.fileName = args[1];
        this.countryName = args[2];
        this.ageLimit = args[3];
    }

    private ArrayList<String> getData() throws IOException {
        ReadFile readFile = new ReadFile();
        List<String> list = readFile.getList(fileName);
        return (ArrayList<String>) list;
    }

    private ArrayList<Guest> createGuest() throws IOException {
        ArrayList<Guest> list = new ArrayList<Guest>();
        ArrayList<String> data = getData();
        for (String eachData : data) {
            String[] array = eachData.split(",");
            GuestGenerator guestGenerator = new GuestGenerator();
            list.add(guestGenerator.getEachGuest(array));
        }
        return list;
    }

    private ArrayList<Guest> filterAsCondition() throws IOException {
        ArrayList<Guest> guests = createGuest();
        ArrayList<Guest> list = new ArrayList<Guest>();
        for (Guest guest: guests) {
            if(guest.isFrom(countryName) && guest.isLegalAge(Integer.parseInt(ageLimit))){
                list.add(guest);
            }
        }
        return list;
    }

    public ArrayList<String> getRepresentation() throws IOException {
        ArrayList<Guest> guests = filterAsCondition();
        ArrayList<String> list = new ArrayList<>();
        if(format.equals("firstNameFirst")){
            for (Guest guest:guests) {
                list.add(guest.getInformalLegalAgedGuest());
            }
        }
        else if(format.equals("lastNameFirst")){
            for (Guest guest:guests) {
                list.add(guest.getFormalLegalGuest());
            }
        }
        return list;
    }
}
