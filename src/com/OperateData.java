package com;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.ReadFile.getList;

public class OperateData {
    public ArrayList<String> getData(String fileName) throws IOException {
        List<String> list = getList(fileName);
        return (ArrayList<String>) list;
    }

    private ArrayList<Guest> createGuest(String fileName) throws IOException {
        ArrayList<Guest> list = new ArrayList<>();
        ArrayList<String> data = getData(fileName);
        for (String eachData : data) {
            String[] array = eachData.split(",");
            GuestGenerator guestGenerator = new GuestGenerator();
            list.add(guestGenerator.getEachGuest(array));
        }
        return list;
    }

    private ArrayList<Guest> filterWithCountryAndAge(String fileName, String countryName, String ageLimit) throws IOException {
        ArrayList<Guest> guests = createGuest(fileName);
        ArrayList<Guest> list = new ArrayList<>();
        for (Guest guest : guests) {
            if (guest.isFrom(countryName) && guest.isLegalAge(Integer.parseInt(ageLimit))) {
                list.add(guest);
            }
        }
        return list;
    }


    public ArrayList<String> getDataRepresentationForOnlyName(String format, String fileName) throws IOException {
        ArrayList<Guest> guests = createGuest(fileName);
        ArrayList<String> list = new ArrayList<>();
        if (format.equals("firstNameFirst")) {
            for (Guest guest : guests) {
                list.add(guest.getInformalNameTemplate());
            }
        } else if (format.equals("lastNameFirst")) {
            for (Guest guest : guests) {
                list.add(guest.getFormalNameTemplate());
            }
        }
        return list;
    }

    public ArrayList<String> getRepresentationWithCountryName(String format, String fileName, String countryName) throws IOException {
        ArrayList<Guest> guests = filterAsCountryName(fileName,countryName);
        ArrayList<String> list = new ArrayList<>();
        if (format.equals("firstNameFirst")) {
            for (Guest guest : guests) {
                list.add(guest.getInformalNameAndCountryTemplate());
            }
        } else if (format.equals("lastNameFirst")) {
            for (Guest guest : guests) {
                list.add(guest.getFormalNameCountryTemplate());
            }
        }
        return list;
    }

    private ArrayList<Guest> filterAsCountryName(String fileName, String countryName) throws IOException {
        ArrayList<Guest> guests = createGuest(fileName);
        ArrayList<Guest> list = new ArrayList<>();
        for (Guest guest : guests) {
            if (guest.isFrom(countryName)) {
                list.add(guest);
            }
        }
        return list;
    }

    public ArrayList<String> getRepresentationWithLegalAge(String format, String fileName, String countryName, String ageLimit) throws IOException {
        ArrayList<Guest> guests = filterWithCountryAndAge(fileName,countryName,ageLimit);
        ArrayList<String> list = new ArrayList<>();
        if (format.equals("firstNameFirst")) {
            for (Guest guest : guests) {
                list.add(guest.getInformalTemplate());
            }
        } else if (format.equals("lastNameFirst")) {
            for (Guest guest : guests) {
                list.add(guest.getFormalTemplate());
            }
        }
        return list;
    }

    public ArrayList<String> getRepresentationTemplate(String format, String fileName, String countryName) throws IOException {
        ArrayList<Guest> guests = filterAsCountryName(fileName,countryName);
        ArrayList<String> list = new ArrayList<>();
        if (format.equals("firstNameFirst")) {
            for (Guest guest : guests) {
                list.add(guest.getInformalNameAndCountryTemplate());
            }
        } else if (format.equals("lastNameFirst")) {
            for (Guest guest : guests) {
                list.add(guest.getFormalStructure());
            }
        }
        return list;
    }
}
