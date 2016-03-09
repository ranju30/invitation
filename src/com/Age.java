package com;

public class Age {
    private int age;

    public Age(int age){
        this.age = age;
    }

    public boolean isLegal(int givenAge){
        return this.age > givenAge;
    }

    public int getAge() {
        return this.age;
    }
}
