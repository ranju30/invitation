public class Guest {

    private Name name;
    private Gender gender;
    private Age age;
    private Address address;

    public Guest(String firstName, String lastName, Gender gender, String age, String city, String state, String country) {
        this.name = new Name(firstName, lastName);
        this.gender = gender;
        this.age = new Age(age);
        this.address = new Address(city, state, country);
    }

    public String getTitleAndFirstNameFirst() {
        return gender.title() + " " + name.getFirstLastName();
    }

    public String getTitleAndLastNameFirst() {
        return gender.title() + " " + name.getLastFirstName();
    }

    public String getFirstNameFirstAndCountry() {
        return this.getTitleAndFirstNameFirst() + ", " + address.getCountry();
    }

    public String getLastNameFirstAndCountry() {
        return this.getTitleAndLastNameFirst() + ", " + address.getCountry();
    }

    public String getInformalLegalAgedGuest(){
        return getFirstNameFirstAndCountry() + ", " +age.getAge();
    }

    public String getFormalLegaledGuest() {
        return getLastNameFirstAndCountry() + ", "+age.getAge();

    }
}
