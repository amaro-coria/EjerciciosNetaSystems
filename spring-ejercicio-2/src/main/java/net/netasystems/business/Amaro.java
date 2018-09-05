package net.netasystems.business;

public class Amaro implements Programmer{

    private Languaje languaje;

    public Amaro(Languaje languaje){
        this.languaje = languaje;
    }

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