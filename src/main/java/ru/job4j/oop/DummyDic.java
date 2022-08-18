package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return "Неизвестное слово " + eng;
    }

    public static void main(String[] args) {
        DummyDic dummyDic = new DummyDic();
        String rsl1 = dummyDic.engToRus("Unknown line");
        System.out.println(rsl1);
    }
}