package ru.job4j.inheritance;

public class PizzaExtraCheese extends Pizza {
    private static final String name = "extra cheese";

    public PizzaExtraCheese(String name) {
        super(name);
    }

    public String name() {
        return name + super.name();
    }
}
