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
        if(arguments.length == 3 && format.contains("WithPattern")){
            this.countryName = arguments[2];
            return operateData.getRepresentationTemplate(format,fileName,countryName);
        }
        else if(arguments.length == 3){
            this.countryName = arguments[2];
            return operateData.getRepresentationWithCountryName(format,fileName,countryName);
        }
        else if(arguments.length == 4){
            this.countryName = arguments[2];
            this.ageLimit = arguments[3];
            return operateData.getRepresentationWithLegalAge(format,fileName,countryName,ageLimit);
        }
        else {
            return operateData.getDataRepresentationForOnlyName(format, fileName);
        }
    }
}
