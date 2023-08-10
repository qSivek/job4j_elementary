package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        for (int i = 1; i < board.length; i++) {
            if (board[row][0] != board[row][i]) {
                return false;
            }
        }
        return true;
    }
}
