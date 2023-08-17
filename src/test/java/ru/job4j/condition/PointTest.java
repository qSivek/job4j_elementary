package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when22to23then1() {
        double expected = 1;
        Point a = new Point(2, 2);
        Point b = new Point(2, 3);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when11to68then8dot6() {
        double expected = 8.6;
        Point a = new Point(1, 1);
        Point b = new Point(6, 8);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when40to158then13dot6() {
        double expected = 13.6;
        Point a = new Point(4, 0);
        Point b = new Point(15, 8);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when00to68then10() {
        double expected = 10;
        Point a = new Point(0, 0);
        Point b = new Point(6, 8);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when40and84and166then11dot48() {
        double expected = 11.48;
        Point one = new Point(4, 8, 16);
        Point two = new Point(0, 4, 6);
        double out = one.distance3d(two);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when22and146and5427then28dot16() {
        double expected = 28.16;
        Point one = new Point(2, 14, 54);
        Point two = new Point(2, 6, 27);
        double out = one.distance3d(two);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}