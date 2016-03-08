package app;

import com.FormalGreeting;

import java.io.IOException;
import java.util.ArrayList;

public class FormalPrintLabel {

    public static void main(String[] args) throws IOException {
        FormalGreeting formalGreeting = new FormalGreeting(args);
        ArrayList<String> formalRepresentation = formalGreeting.getFormalRepresentation();
        for (String eachDetail : formalRepresentation) {
            System.out.println(eachDetail);
        }
    }

}
