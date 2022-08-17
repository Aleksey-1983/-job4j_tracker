package ru.job4j.tracker;

public class DummyDic {
    public String engToRus(String eng) {
        String rsl = "Неизвестное слово " + eng;
        return rsl;
    }

    public static void main(String[] args) {
        DummyDic dummyDic = new DummyDic();
        String rsl1 = dummyDic.engToRus("Unknown line");
        System.out.println(rsl1);
    }
}