package app;

import designs.NameConvention;
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
        NameConvention nameFormat = argumentHandler.getNameFormat();
        ArrayList<Filter> filters = argumentHandler.getFilters();

        List<String> list = ReadFile.getList(fileName);
        ArrayList<Guest> guests = new GuestGenerator().generateGuestList(list);

        FilterData filterData = new FilterData(filters);
        ArrayList<Guest> filteredGuest = filterData.filter(guests);

        PrintGuest printGuest = new PrintGuest(filteredGuest);
        printGuest.print(nameFormat);
    }
}
