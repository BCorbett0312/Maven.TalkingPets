package io.zipcoder.polymorphism;

public class Fox extends Pet {


    public Fox(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Ring-ding-ding-ding-dingeringeding!\n" +
                "Gering-ding-ding-ding-dingeringeding!\n" +
                "Gering-ding-ding-ding-dingeringeding!";
    }
}
