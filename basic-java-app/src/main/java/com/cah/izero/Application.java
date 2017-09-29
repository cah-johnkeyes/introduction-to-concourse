package com.cah.izero;

public class Application {

    public static void main(String[] args) {
        GreetingMachine machine = new GreetingMachine("Howdy");
        System.out.println(machine.greet("John"));
    }

}
