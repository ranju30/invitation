package option;

import filters.AgeFilter;
import filters.CountryFilter;
import filters.Filter;

import java.util.ArrayList;

public class ArgumentHandler {
    private String[] arguments;

    public ArgumentHandler(String[] args) {
        this.arguments = args;
    }


    public String getFileName() {
        return this.arguments[arguments.length - 1];
    }

    public String getOption() {
        if(arguments[0].contains("l"))
            return "lastNameFirst";
        return "firstNameFirst";
    }

    public ArrayList<Filter> getFilter() {
        ArrayList<Filter> filters = new ArrayList<>();
        for (int i = 0; i < arguments.length; i++) {
            if(arguments[i].substring(0,2).equals("-a")){
                int givenAge = Integer.parseInt(arguments[i].substring(2));
                filters.add(new AgeFilter(givenAge));
            }
            if(arguments[i].substring(0,2).equals("-c")){
                String givenCountry = arguments[i].substring(2);
                filters.add(new CountryFilter(givenCountry));
            }
        }
        return filters;
    }
}
