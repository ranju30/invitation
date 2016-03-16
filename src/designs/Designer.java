package designs;

public class Designer implements Designs {

    private String lineGenerator(int length, String borderSymbol, String centerSymbol) {

        String line = borderSymbol;
        for (int index = 0; index < length; index++) {
            line += centerSymbol;
        }
        line += borderSymbol;
        return line;
    }

    private int getMaxLength(int nameLength, int addressLength1, int addressLength2) {
        if (nameLength > addressLength1 && nameLength > addressLength2)
            return nameLength;
        if (addressLength1 > addressLength2)
            return addressLength1;
        return addressLength2;
    }

    public String getDesign(String nameRepresentation, String entitiesRepresentation) {
        String representation = "";
        String firstAddress = entitiesRepresentation.split("\n")[0];
        String secondAddress = entitiesRepresentation.split("\n")[1];
        int maxLength = getMaxLength(nameRepresentation.length(), firstAddress.length(), secondAddress.length());

        int maxLengthForLine = maxLength + 2;
        int maxLengthForEntities = maxLength + 1;

        String borderSymbol = "+";
        String centerSymbol = "-";

        representation += lineGenerator(maxLengthForLine, borderSymbol, centerSymbol) + "\n";
        representation += "| " + nameRepresentation + lineGenerator(maxLengthForEntities - nameRepresentation.length(), "", " ") + "|" + "\n";
        representation += lineGenerator(maxLengthForLine, "|", centerSymbol) + "\n";
        representation += "| " + firstAddress + lineGenerator(maxLengthForEntities - firstAddress.length(), "", " ") + "|" + "\n";
        representation += "| " + secondAddress + lineGenerator(maxLengthForEntities - secondAddress.length(), "", " ") + "|" + "\n";
        representation += lineGenerator(maxLengthForLine, borderSymbol, centerSymbol);
        return representation;
    }
}
