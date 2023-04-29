package ru.job4j.inheritance;

public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {
    private static final String name = "extra tomato";

    public PizzaExtraCheeseExtraTomato(String name) {
        super(name);
    }

    public String name() {
        return name + super.name();
    }
}
