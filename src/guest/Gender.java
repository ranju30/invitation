package guest;

public enum Gender {
    MALE("Mr"),
    FEMALE("Ms");

    private String prefix;


    Gender(String prefix) {
        this.prefix = prefix;
    }

    public String title() {
        return prefix;
    }
}
