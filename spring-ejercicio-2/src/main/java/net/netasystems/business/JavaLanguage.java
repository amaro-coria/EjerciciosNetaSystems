package net.netasystems.business;

import org.springframework.stereotype.Component;

@Component
public class JavaLanguage implements Languaje {
    public String description() {
        return "Java rules!!";
    }
}
