package com;

public enum Gender {
    MALE("Mr"),
    FEMALE("Ms");

    private String prefix;


    Gender(String pre) {
        this.prefix = pre;
    }

    @Override
    public String toString() {
        return prefix;
    }
}
