package net.netasystems.business;

import org.springframework.stereotype.Component;

@Component
public class PerlLanguaje implements Languaje {

    private String descriptionLanguage = "Valor desde anotacion";

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
