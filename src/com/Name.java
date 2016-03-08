package com;

public class Name {

    private String firstName;
    private String lastName;

    public Name(String fName, String lName) {
        this.firstName = fName;
        this.lastName = lName;
    }

    public String getFirstLastName() {
        return String.format("%s %s",this.firstName,this.lastName);
    }

    public String getLastFirstName() {
        return String.format("%s, %s",this.lastName,this.firstName);
    }
}
