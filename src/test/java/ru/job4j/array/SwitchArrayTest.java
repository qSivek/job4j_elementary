package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SwitchArrayTest {
    @Test
    void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap3to4() {
        int[] input = {10, 11, 12, 13, 14, 15, 16, 17};
        int source = 3;
        int dest = 4;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {10, 11, 12, 14, 13, 15, 16, 17};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap1to6() {
        int[] input = {16, 18, 22, 1, 14, 5, 6, 23, 55, 27, 54};
        int source = 1;
        int dest = 6;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {16, 6, 22, 1, 14, 5, 18, 23, 55, 27, 54};
        assertThat(result).containsExactly(expected);
    }
}