package com.cah.izero;

public class GreetingMachine {

    private String salutation;

    public GreetingMachine(String salutation) {
        this.salutation = salutation;
    }

    public String greet(String name) {
        return salutation + ", " + name;
    }

    public String greet() {
        
        return salutation;
    }
}
