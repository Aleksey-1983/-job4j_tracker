package ru.job4j.tracker;

public class Jukebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("����� ����� ��������");
        } else if (position == 2) {
            System.out.println("��������� ����");
        } else {
            System.out.println("����� �� �������");
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
