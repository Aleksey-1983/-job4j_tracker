package ru.job4j.tracker;

public class Jukebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox x = new Jukebox();
        int song = 0;
        int song1 = 1;
        int song2 = 2;
        x.music(song1);
        x.music(song2);
        x.music(song);
    }
}
