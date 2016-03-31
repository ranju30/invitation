package cli;

import designs.FirstNameFirst;
import designs.LastNameFirst;
import designs.NameConvention;
import filters.AgeFilter;
import filters.CountryFilter;
import filters.Filter;

import java.util.ArrayList;
import java.util.HashMap;

public class ArgumentHandler {
    private String[] arguments;

    public ArgumentHandler(String[] args) {
        this.arguments = args;
    }


    public String getFileName() {
        return this.arguments[arguments.length - 1];
    }

    public NameConvention getNameFormat() {
        HashMap<String,NameConvention> nameFormator = new HashMap<>();
        nameFormator.put("-f",new FirstNameFirst());
        nameFormator.put("-l",new LastNameFirst());
        return nameFormator.get(arguments[0]);
    }

    public ArrayList<Filter> getFilters() {
        ArrayList<Filter> filters = new ArrayList<>();
        for (int i = 0; i < arguments.length; i++) {
            if (arguments[i].equals("-c")) {
                String givenCountry = arguments[++i];
                filters.add(new CountryFilter(givenCountry));
            }
            if (arguments[i].equals("-a")) {
                int givenAge = Integer.parseInt(arguments[++i]);
                filters.add(new AgeFilter(givenAge));
            }
        }
        return filters;
    }
}
