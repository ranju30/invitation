package guest;

public class Guest {

    private Name name;
    private Gender gender;
    private Age age;
    private Address address;
    private int dashLength;

    public Guest(Name name, Gender gender, Age age, Address address) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    public String getInformalTemplate() {
        return String.format("%s %s, %s, %s", gender, name.getFirstNameFirst(), address.getCountry(), age.getAge());
    }

    public String getFormalTemplate() {
        return String.format("%s %s, %s, %s", gender, name.getLastNameFirst(), address.getCountry(), age.getAge());
    }

    public boolean isFrom(String countryName) {
        return address.isEqualWith(countryName);
    }

    public boolean isLegalAge(int givenAge) {
        return age.isLegal(givenAge);
    }

    public String getFormalNameTemplate() {
        return String.format("%s %s", gender, name.getLastNameFirst());
    }

    public String getInformalNameTemplate() {
        return String.format("%s %s", gender, name.getFirstNameFirst());
    }

    public String getFormalNameCountryTemplate() {
        return String.format("%s %s, %s", gender, name.getLastNameFirst(), address.getCountry());
    }

    public String getInformalNameAndCountryTemplate() {
        return String.format("%s %s, %s", gender, name.getFirstNameFirst(), address.getCountry());
    }

    public String getInformalStructure() {
        int nameLenght = name.getFirstNameFirst().length() + 5;
        int addressLength = address.getCity().length() + address.getState().length() + 4;
        int countryLength = address.getCountry().length() + 2;
        dashLength = getHighestLength(nameLenght, addressLength, countryLength);
        String s = "";
        s += getDash("+") + "\n";
        s += "| " + gender + " " + name.getFirstNameFirst() + getSpace(nameLenght) + " |" + "\n";
        s += getDash("|") + "\n";
        s += "| " + address.getCity() + ", " + address.getState() + getSpace(addressLength) + " |" + "\n";
        s += "| " + address.getCountry() + getSpace(countryLength) + " |" + "\n";
        s += getDash("+");
        return s;
    }

    public String getFormalStructure() {
        int nameLenght = name.getLastNameFirst().length() + 5;
        int addressLength = address.getCity().length() + address.getState().length() + 4;
        int countryLength = address.getCountry().length() + 2;
        dashLength = getHighestLength(nameLenght, addressLength, countryLength);
        String s = "";
        s += getDash("+") + "\n";
        s += "| " + gender + " " + name.getLastNameFirst() + getSpace(nameLenght) + " |" + "\n";
        s += getDash("|") + "\n";
        s += "| " + address.getCity() + ", " + address.getState() + getSpace(addressLength) + " |" + "\n";
        s += "| " + address.getCountry() + getSpace(countryLength) + " |" + "\n";
        s += getDash("+");
        return s;
    }

    private int getHighestLength(int nameLenght, int addressLength, int countryLength) {

        if (nameLenght > addressLength && nameLenght > countryLength) {
            return nameLenght;
        } else if (addressLength > countryLength) {
            return addressLength;
        } else
            return countryLength;
    }

    private String getSpace(int n) {
        String space = "";
        for (int i = 0; i < dashLength - n; i++) {
            space += " ";
        }
        return space;
    }

    private String getDash(String symbol) {
        String dash = symbol;
        for (int i = 0; i < dashLength; i++) {
            dash += "-";
        }
        return dash + symbol;
    }
}
