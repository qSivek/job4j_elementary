package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Frank Lampard";
        names[1] = "John Terry";
        names[2] = "Petr Cech";
        names[3] = "Didier Drogba";

        System.out.println("Размер массива ages равен: " + ages.length);
        System.out.println("Размер массива surnames равен: " + surnames.length);
        System.out.println("Размер массива prices равен: " + prices.length);
        for (String name : names) {
            System.out.println(name);
        }
    }
}
