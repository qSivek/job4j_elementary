package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class FindLoopTest {
    @Test
    void whenArrayHas5Then0() {
        int[] data = {5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }
    @Test
    void whenArrayHas23Then4() {
        int[] data = {13, 25, 11, 5, 23};
        int el = 23;
        int result = FindLoop.indexOf(data, el);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }
    @Test
    void whenArrayHas17ThenNotFound() {
        int[] data = {22, 16, 33, 28, 14, 66, 89};
        int el = 17;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }
}