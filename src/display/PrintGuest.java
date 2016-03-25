package display;

import designs.Designer;
import designs.NameConvention;
import guest.Guest;

import java.util.ArrayList;

public class PrintGuest {

    private ArrayList<Guest> guests = new ArrayList<>();

    public PrintGuest(ArrayList<Guest> filteredGuest) {
        this.guests = filteredGuest;
    }

    public void print(NameConvention nameFormat) {
        Designer designer = new Designer();
        for (Guest guest : guests) {
            System.out.println(guest.represent(designer, nameFormat));
        }
    }
}
