package ru.job4j.inheritance;

public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {
    private static final String Name = "+ extra tomato ";

    public String name() {
        return super.name() + Name;
    }
}