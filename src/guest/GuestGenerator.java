package guest;

import java.util.ArrayList;
import java.util.List;

public class GuestGenerator {

    public Guest createGuest(String[] array) {
        Name name = new Name(array[0], array[1]);
        Gender gender = array[2].contains("Female") ? Gender.FEMALE : Gender.MALE;
        Age age = new Age(Integer.parseInt(array[3]));
        City city = new City(array[4]);
        State state = new State(array[5]);
        Country country = new Country(array[6]);
        Address address = new Address(city, state, country);
        return new Guest(name, gender, age, address);
    }

    public ArrayList<Guest> generateGuestList(List<String> allDetail) {
        ArrayList<Guest> list = new ArrayList<>();
        for (String eachData : allDetail) {
            String[] array = eachData.split(",");
            list.add(createGuest(array));
        }
        return list;
    }
}
