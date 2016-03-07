public enum Gender {
    Male("Mr"),
    Female("Ms");

    private String prefix;


    Gender(String pre) {
        this.prefix = pre;
    }

    @Override
    public String toString() {
        return prefix;
    }
}
