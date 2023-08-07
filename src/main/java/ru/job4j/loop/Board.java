package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        for (int i = 0; i < width; i++) {
            for (int y = 0; y < height; y++) {
                if ((i + y) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
        System.out.println();
        paint(8, 8);
    }
}
