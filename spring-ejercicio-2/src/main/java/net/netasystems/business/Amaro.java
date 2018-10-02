package net.netasystems.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Amaro implements Programmer{

	@Autowired
	@Qualifier(value="perlLanguaje")
    private Languaje languaje;

    

    public Languaje getLanguaje() {
        return languaje;
    }

    public void setLanguaje(Languaje languaje) {
        this.languaje = languaje;
    }


    public String hackTheWorld() {
        return "Program in: "+languaje.description();
    }
}