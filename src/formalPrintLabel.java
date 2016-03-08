import java.util.ArrayList;

public class FormalPrintLabel {

    public static void main(String[] args) {
        FormalGreeting formalGreeting = new FormalGreeting(args);
        ArrayList<String> formalRepresentation = formalGreeting.getFormalRepresentation();
        for (String eachDetail : formalRepresentation) {
            System.out.println(eachDetail);
        }
    }

}
