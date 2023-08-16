package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int oneNum = 1;
        int twoNum = 2;
        int result = Max.max(oneNum, twoNum);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To3Then5() {
        int oneNum = 5;
        int twoNum = 3;
        int result = Max.max(oneNum, twoNum);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax10To22Then22() {
        int oneNum = 10;
        int twoNum = 22;
        int result = Max.max(oneNum, twoNum);
        int expected = 22;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To5Then5() {
        int oneNum = 5;
        int twoNum = 5;
        int result = Max.max(oneNum, twoNum);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax23and1and4Then23() {
        int oneNum = 23;
        int twoNum = 1;
        int threeNum = 4;
        int result = Max.max(oneNum, twoNum, threeNum);
        int expected = 23;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax13and299and54Then299() {
        int oneNum = 13;
        int twoNum = 299;
        int threeNum = 54;
        int result = Max.max(oneNum, twoNum, threeNum);
        int expected = 299;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1and29and33and66Then66() {
        int oneNum = 1;
        int twoNum = 29;
        int threeNum = 33;
        int fourNum = 66;
        int result = Max.max(oneNum, twoNum, threeNum, fourNum);
        int expected = 66;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax75and2and3and666Then66() {
        int oneNum = 75;
        int twoNum = 2;
        int threeNum = 3;
        int fourNum = 666;
        int result = Max.max(oneNum, twoNum, threeNum, fourNum);
        int expected = 666;
        assertThat(result).isEqualTo(expected);
    }
}