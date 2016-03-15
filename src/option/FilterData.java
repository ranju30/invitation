package option;

import filters.Filter;
import guest.Guest;

import java.util.ArrayList;

public class FilterData {
    public ArrayList<Guest> getFilterdGuest(ArrayList<Guest> guests, ArrayList<Filter> filters) {
        ArrayList<Guest> sortedGuest = null;
        for (Guest guest : guests) {
            for (Filter filter : filters) {
                if(filter.isValid(guest))
                    sortedGuest.add(guest);
            }
        }
        return sortedGuest;
    }


//    private ArrayList<String> getData(String fileName) throws IOException {
//        List<String> list = ReadFile.getList(fileName);
//        return (ArrayList<String>) list;
//    }

//    private ArrayList<Guest> createGuest(String fileName) throws IOException {
//        ArrayList<Guest> list = new ArrayList<>();
//        ArrayList<String> data = getData(fileName);
//        for (String eachData : data) {
//            String[] array = eachData.split(",");
//            GuestGenerator guestGenerator = new GuestGenerator();
//            list.add(guestGenerator.getEachGuest(array));
//        }
//        return list;
//    }

//    private ArrayList<Guest> filterWithCountryAndAge(String fileName, String countryName, String ageLimit) throws IOException {
//        ArrayList<Guest> guests = createGuest(fileName);
//        ArrayList<Guest> list = new ArrayList<>();
//        for (Guest guest : guests) {
//            if (guest.isFrom(countryName) && guest.isLegalAge(Integer.parseInt(ageLimit))) {
//                list.add(guest);
//            }
//        }
//        return list;
//    }


//    private ArrayList<Guest> filterAsCountryName(String fileName, String countryName) throws IOException {
//        ArrayList<Guest> guests = createGuest(fileName);
//        ArrayList<Guest> list = new ArrayList<>();
//        for (Guest guest : guests) {
//            if (guest.isFrom(countryName)) {
//                list.add(guest);
//            }
//        }
//        return list;
//    }
//
//    public ArrayList<String> getDataRepresentationForOnlyName(String format, String fileName) throws IOException {
//        ArrayList<Guest> guests = createGuest(fileName);
//        ArrayList<String> list = new ArrayList<>();
//        NameTemplate nameFormat = new NameTemplate(format);
//        for (Guest guest : guests) {
//            list.add(guest.getName(nameFormat));
//        }
//        return list;
//    }
//
//    public ArrayList<String> getRepresentationWithCountryName(String format, String fileName, String countryName) throws IOException {
//        ArrayList<Guest> guests = filterAsCountryName(fileName, countryName);
//        ArrayList<String> list = new ArrayList<>();
//        NameTemplate nameFormat = new NameTemplate(format);
//        for (Guest guest : guests) {
//            list.add(guest.getNameAndCountry(nameFormat));
//        }
//        return list;
//    }
//
//    public ArrayList<String> getRepresentationWithLegalAge(String format, String fileName, String countryName, String ageLimit) throws IOException {
//        ArrayList<Guest> guests = filterWithCountryAndAge(fileName, countryName, ageLimit);
//        ArrayList<String> list = new ArrayList<>();
//        NameTemplate nameFormat = new NameTemplate(format);
//        for (Guest guest : guests) {
//            list.add(guest.getRepresentationWithCountryAndAge(nameFormat));
//        }
//        return list;
//    }
//
//    public ArrayList<String> getRepresentationTemplate(String format, String fileName, String countryName) throws IOException {
//        ArrayList<Guest> guests = filterAsCountryName(fileName, countryName);
//        ArrayList<String> list = new ArrayList<>();
//        Designs firstDesign = new FirstDesign();
//        NameTemplate nameFormat = new NameTemplate(format);
//        for (Guest guest : guests) {
//            list.add(guest.getRepresentationWithStructure(firstDesign, nameFormat));
//        }
//        return list;
//    }



}
