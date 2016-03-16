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
        ArgumentHandler argumentHandler = new ArgumentHandler(args);
        String fileName = argumentHandler.getFileName();
        String nameFormat = argumentHandler.getNameFormat();
        ArrayList<Filter> filters = argumentHandler.getFilters();

        List<String> list = ReadFile.getList(fileName);
        ArrayList<Guest> guests = new GuestGenerator().generateGuestList(list);

        FilterData filterData = new FilterData(filters);
        ArrayList<Guest> filterdGuest = filterData.filter(guests);

        PrintGuest printGuest = new PrintGuest(filterdGuest);
        printGuest.print(nameFormat);
    }
}
