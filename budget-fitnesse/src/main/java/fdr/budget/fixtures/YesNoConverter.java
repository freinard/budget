package fdr.budget.fixtures;

import fitnesse.slim.Converter;

public class YesNoConverter implements Converter<Boolean> {

    @Override
    public String toString(Boolean aBoolean) {
        if (aBoolean == null) throw new IllegalArgumentException("Cannot convert null to Yes or No");
        return aBoolean ? "Yes" : "No";
    }

    @Override
    public Boolean fromString(String s) {
        if (s == null) throw new IllegalArgumentException("Cannot convert null to True or False");
        if (!"Yes".equalsIgnoreCase(s) && !"No".equalsIgnoreCase(s))
            throw new IllegalArgumentException("String to convert must be Yes or No");
        return "Yes".equalsIgnoreCase(s);
    }

}
