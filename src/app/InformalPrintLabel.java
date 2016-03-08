package app;

import com.InformalGreeting;

import java.io.IOException;
import java.util.ArrayList;

public class InformalPrintLabel {
    public static void main(String[] args) throws IOException {
        InformalGreeting informalGreeting = new InformalGreeting(args);
        ArrayList<String> informalRepresentation = informalGreeting.getInformalRepresentation();
        for (String eachDetail : informalRepresentation) {
            System.out.println(eachDetail);
        }
    }
}

