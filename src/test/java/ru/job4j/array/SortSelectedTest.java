package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSortFiveNum() {
        int[] data = {5, 2, 13, 8, 7};
        int[] result = SortSelected.sort(data);
        int[] expected = {2, 5, 7, 8, 13};
        assertThat(result).containsExactly(expected);
    }
    @Test
    void whenSortThreeNum(){
        int[] data = {27, 54, 30};
        int[] result = SortSelected.sort(data);
        int[] expected = {27,30,54};
        assertThat(result).containsExactly(expected);
    }
}