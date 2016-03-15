package app;

import guest.Guest;
import guest.GuestGenerator;
import option.ArgumentHandler;
import option.OperateData;
import option.ReadFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PrintLabels {
    public static void main(String[] args) throws IOException {
        ArgumentHandler operateArguments = new ArgumentHandler(args);
        String fileName = operateArguments.getFileName();
        String[] options = operateArguments.getOptions();

        List<String> list = ReadFile.getList(fileName);
        ArrayList<Guest> guests = new GuestGenerator().generateGuest(list);

        OperateData operateData = new OperateData();
//        ArrayList<String> strings = operateData.filterData(guests,options);


        ArrayList<String> representation = operateArguments.getRepresentation();
        for (String guest : representation) {
            System.out.println(guest);
        }
    }
}
