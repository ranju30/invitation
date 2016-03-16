package app;

import filters.Filter;
import guest.Guest;
import guest.GuestGenerator;
import cli.ArgumentHandler;
import sortData.FilterData;
import io.ReadFile;
import display.PrintGuest;

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

        FilterData filterData = new FilterData(guests, filter);
        ArrayList<Guest> filterdGuest = filterData.getFilterdGuest();

        PrintGuest printGuest = new PrintGuest(filterdGuest);
        printGuest.print(option);
    }
}
