package app;

import filters.Filter;
import guest.Guest;
import guest.GuestGenerator;
import option.ArgumentHandler;
import option.FilterData;
import option.ReadFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PrintLabels {
    public static void main(String[] args) throws IOException {
        ArgumentHandler operateArguments = new ArgumentHandler(args);
        String fileName = operateArguments.getFileName();
        String option = operateArguments.getOption();
        ArrayList<Filter> filter = operateArguments.getFilter();


        List<String> list = ReadFile.getList(fileName);
        ArrayList<Guest> guests = new GuestGenerator().generateGuest(list);

        FilterData filterData = new FilterData();
        ArrayList<Guest> filterdGuest = filterData.getFilterdGuest(guests, filter);

        

//        ArrayList<String> representation = operateArguments.getRepresentation();
//        for (String guest : representation) {
//            System.out.println(guest);
//        }
    }
}
