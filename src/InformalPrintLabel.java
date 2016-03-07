import java.util.ArrayList;

public class informalPrintLabel {
    public static void main(String[] args) {
        InformalGreeting informalGreeting = new InformalGreeting(args);
        ArrayList<String> informalRepresentation = informalGreeting.getInformalRepresentation();
        for (String eachDetail : informalRepresentation) {
            System.out.println(eachDetail);
        }
    }
}

