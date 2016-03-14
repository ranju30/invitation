package designs;

public class FirstDesign implements Designs {

    private String lineGenerator(int length, String borderSymbol, String centerSymbol) {

        String line = borderSymbol;
        for (int index = 0; index < length; index++) {
            line += centerSymbol;
        }
        line += borderSymbol;
        return line;
    }

    public String getDesign(String nameRepresentation, String entitiesRepresentation) {
        String representation = "";
        String firstAddress = entitiesRepresentation.split("\n")[0];
        String secondAddress = entitiesRepresentation.split("\n")[1];
        int maxLength = nameRepresentation.length();
        if (maxLength < firstAddress.length())
            maxLength = firstAddress.length();
        if (maxLength < secondAddress.length())
            maxLength = secondAddress.length();

        int maxLengthForLine = maxLength + 2;
        int maxLengthForEntities = maxLength + 1;

        String borderSymbol = "+";
        String centerSymbol = "-";

        representation += lineGenerator(maxLengthForLine, borderSymbol, centerSymbol) + "\n";
        representation += "| " + nameRepresentation + lineGenerator(maxLengthForEntities - nameRepresentation.length(), "", " ") + "|" + "\n";
        representation += lineGenerator(maxLengthForLine, "|", centerSymbol) + "\n";
        representation += "| " + firstAddress + lineGenerator(maxLengthForEntities - firstAddress.length(), "", " ") + "|" + "\n";
        representation += "| " + secondAddress + lineGenerator(maxLengthForEntities - secondAddress.length(), "", " ") + "|" + "\n";
        representation += lineGenerator(maxLengthForLine, borderSymbol, centerSymbol) + "\n";
        return representation;
    }
}
