public class Person {

    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private String[] address;

    public Person(String firstName, String lastName, String gender, int age, String[] address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public String generatePrefix() {
        return this.gender == "male" ? "Mr " : "Ms ";
    }

    public int getAge(){
        return this.age;
    }

    public String getAddress(){
        return this.address[0];
    }

}
