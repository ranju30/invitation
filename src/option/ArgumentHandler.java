package option;

import java.io.IOException;
import java.util.ArrayList;

public class ArgumentHandler {
    private String[] arguments;
    private String fileName;
    private String format;
    private String countryName;
    private String ageLimit;

    public ArgumentHandler(String[] args) {
        this.arguments = args;
        this.fileName = args[0];
        this.format = args[1];
    }


    public ArrayList<String> getRepresentation() throws IOException {
        OperateData operateData = new OperateData();
        if (arguments.length == 3 && format.contains("WithPattern")) {
            this.countryName = arguments[2];
            return operateData.getRepresentationTemplate(format, fileName, countryName);
        }
        if (arguments.length == 3) {
            this.countryName = arguments[2];
            return operateData.getRepresentationWithCountryName(format, fileName, countryName);
        }
        if (arguments.length == 4) {
            this.countryName = arguments[2];
            this.ageLimit = arguments[3];
            return operateData.getRepresentationWithLegalAge(format, fileName, countryName, ageLimit);
        }
            return operateData.getDataRepresentationForOnlyName(format, fileName);
    }

    public String getFileName() {
        return this.fileName;
    }

    public String[] getOptions(){
        String[] options = new String[arguments.length-1];
        for (int i = 2; i < arguments.length; i++) {
            options[i-1] = arguments[i];
        }
        return options;
    }

    public String getRepresentationFormat(){
        return format;
    }
}
