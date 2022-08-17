package ru.job4j.tracker;

public class DummyDic {
    public String engToRus() {
        String voice = "Unknown line";
        return voice;
    }

    public static void main(String[] args) {
        DummyDic a = new DummyDic();
        String b = a.engToRus();
        System.out.println("Неизвестная строчка " + b);
    }
}
