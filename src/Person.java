public class Person {

    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private String city;
    private String state;
    private String country;

    public Person(String firstName, String lastName, String gender, int age, String city, String state, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getAge() {
        return this.age;
    }

    public String getCity() {
        return this.city;
    }

    public String getState() {
        return this.state;
    }

    public String getCountry() {
        return this.country;
    }

    public String generatePrefix() {
        return this.gender.equals("male") ? "Mr " : "Ms ";
    }

    public String makeAddressing() {
        return generatePrefix() + getName();
    }

    public String getNameAndCountry() {
        return makeAddressing() + "," + getCountry();
    }
}
