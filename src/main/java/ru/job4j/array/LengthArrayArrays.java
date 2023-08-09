package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] num = {{12}, {27, 54}, {1, 2, 3}, {1, 3, 3, 7}};
        for (int i = 0; i < num.length; i++) {
            System.out.println("Размер вложенного массива равен: " + num[i].length);
        }
    }
}
