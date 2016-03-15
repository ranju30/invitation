package print;

import designs.FirstDesign;
import designs.NameTemplate;
import guest.Guest;

import java.util.ArrayList;

public class PrintGuest {

    private ArrayList<Guest> guests = new ArrayList<>();

    public PrintGuest(ArrayList<Guest> filteredGuest){
        this.guests = filteredGuest;
    }

    public void print(String option) {
        FirstDesign firstDesign = new FirstDesign();
        NameTemplate format = new NameTemplate(option);
        for (Guest guest : guests) {
            System.out.println(guest.getRepresentationWithStructure(firstDesign,format));
        }
    }
}
