package com;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.ReadFile.getList;

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
        List<String> list = getList(fileName);
        return (ArrayList<String>) list;
    }

    private ArrayList<Guest> createGuest() throws IOException {
        ArrayList<Guest> list = new ArrayList<>();
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
        ArrayList<Guest> list = new ArrayList<>();
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
                list.add(guest.getInformalTemplate());
            }
        }
        else if(format.equals("lastNameFirst")){
            for (Guest guest:guests) {
                list.add(guest.getFormalTemplate());
            }
        }
        return list;
    }
}
