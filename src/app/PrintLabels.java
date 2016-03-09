package app;

import com.ArgumentHandler;

import java.io.IOException;
import java.util.ArrayList;

public class PrintLabels {
    public static void main(String[] args) throws IOException {
        ArgumentHandler operateArguments = new ArgumentHandler(args);
        ArrayList<String> representation = operateArguments.getRepresentation();
        for (String guest: representation) {
            System.out.println(guest);
        }
    }
}
