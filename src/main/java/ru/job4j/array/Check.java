package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        for (boolean i : data) {
            boolean temp = data[0];
            if (temp != i) {
                return false;
            }
        }
        return true;
    }
}