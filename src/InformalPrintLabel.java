import java.util.ArrayList;

public class InformalPrintLabel {
    public static void main(String[] args) {
        InformalGreeting informalGreeting = new InformalGreeting(args);
        ArrayList<String> informalRepresentation = informalGreeting.getInformalRepresentation();
        for (String eachDetail : informalRepresentation) {
            System.out.println(eachDetail);
        }
    }
}

