package ru.job4j.tracker;

public class Item {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Item() {
    }
    public Item(String name) {
    }
    public Item(int id, String name) {
    }
    public void printInfo() {
        System.out.println(7 + name);
    }

    public static void main(String[] args) {
        Item first = new Item();
        first.printInfo();
    }
}
