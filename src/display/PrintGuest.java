package display;

import designs.Designer;
import designs.NameTemplate;
import guest.Guest;

import java.util.ArrayList;

public class PrintGuest {

    private ArrayList<Guest> guests = new ArrayList<>();

    public PrintGuest(ArrayList<Guest> filteredGuest) {
        this.guests = filteredGuest;
    }

    public void print(String option) {
        Designer designer = new Designer();
        NameTemplate format = new NameTemplate(option);
        for (Guest guest : guests) {
            System.out.println(guest.represent(designer, format));
        }
    }
}
