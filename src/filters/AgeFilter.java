package filters;


import guest.Guest;

public class AgeFilter implements Filter {
    private int givenAge;

    public AgeFilter(int givenAge) {
        this.givenAge = givenAge;
    }

    @Override
    public Boolean isValid(Guest guest) {
        return guest.isLegalAge(givenAge);
    }
}
