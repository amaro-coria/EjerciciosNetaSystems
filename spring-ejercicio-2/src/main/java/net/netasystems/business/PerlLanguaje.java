package net.netasystems.business;

public class PerlLanguaje implements Languaje {

    private String descriptionLanguage;

    public String getDescriptionLanguage() {
        return descriptionLanguage;
    }

    public void setDescriptionLanguage(String descriptionLanguage) {
        this.descriptionLanguage = descriptionLanguage;
    }

    public String description() {
        return descriptionLanguage;
    }
}
