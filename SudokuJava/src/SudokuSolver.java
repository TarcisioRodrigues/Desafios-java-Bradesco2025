public class SudokuSolver {
    private static final int SIZE = 9;

    public static boolean solve(int[][] board) {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (board[row][col] == 0) {
                    for (int num = 1; num <= SIZE; num++) {
                        if (isValidMove(board, row, col, num)) {
                            board[row][col] = num;
                            if (solve(board)) return true;
                            board[row][col] = 0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isValidMove(int[][] board, int row, int col, int num) {
        return !isInRow(board, row, num) && !isInCol(board, col, num) && !isInBox(board, row, col, num);
    }

    private static boolean isInRow(int[][] board, int row, int num) {
        for (int i = 0; i < SIZE; i++) {
            if (board[row][i] == num) return true;
        }
        return false;
    }

    private static boolean isInCol(int[][] board, int col, int num) {
        for (int i = 0; i < SIZE; i++) {
            if (board[i][col] == num) return true;
        }
        return false;
    }

    private static boolean isInBox(int[][] board, int row, int col, int num) {
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[startRow + i][startCol + j] == num) return true;
            }
        }
        return false;
    }
}
