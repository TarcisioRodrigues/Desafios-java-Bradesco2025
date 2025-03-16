import java.util.Random;

public class SudokuBoard {
    private int[][] board;
    private static final int SIZE = 9;
    private static final int EMPTY = 0;

    public SudokuBoard() {
        board = new int[SIZE][SIZE];
        generateBoard();
    }

    private void generateBoard() {
        Random random = new Random();
        for (int i = 0; i < SIZE / 2; i++) {
            int row = random.nextInt(SIZE);
            int col = random.nextInt(SIZE);
            int num = random.nextInt(9) + 1;
            if (isValidMove(row, col, num)) {
                board[row][col] = num;
            }
        }
    }

    public boolean isValidMove(int row, int col, int num) {
        return !isInRow(row, num) && !isInCol(col, num) && !isInBox(row, col, num);
    }

    private boolean isInRow(int row, int num) {
        for (int i = 0; i < SIZE; i++) {
            if (board[row][i] == num) return true;
        }
        return false;
    }

    private boolean isInCol(int col, int num) {
        for (int i = 0; i < SIZE; i++) {
            if (board[i][col] == num) return true;
        }
        return false;
    }

    private boolean isInBox(int row, int col, int num) {
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[startRow + i][startCol + j] == num) return true;
            }
        }
        return false;
    }

    public void printBoard() {
        for (int i = 0; i < SIZE; i++) {
            if (i % 3 == 0 && i != 0) System.out.println("-----------");
            for (int j = 0; j < SIZE; j++) {
                if (j % 3 == 0 && j != 0) System.out.print("|");
                System.out.print(board[i][j] == EMPTY ? " ." : " " + board[i][j]);
            }
            System.out.println();
        }
    }

    public int[][] getBoard() {
        return board;
    }
}
