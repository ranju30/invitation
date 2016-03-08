package com;

public class Age {
    private String age;

    public Age(String age){
        this.age = age;
    }
    public boolean isLegal(String age){
        return Integer.parseInt(this.age) > Integer.parseInt(age);
    }

    public int getAge() {
        return Integer.parseInt(this.age);
    }
}
