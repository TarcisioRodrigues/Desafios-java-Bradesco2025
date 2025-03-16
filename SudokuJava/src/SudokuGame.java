import java.util.Scanner;

public class SudokuGame {
    private SudokuBoard board;

    public SudokuGame() {
        board = new SudokuBoard();
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        boolean gameOver = false;

        while (!gameOver) {
            board.printBoard();
            System.out.println("\n1. Inserir número");
            System.out.println("2. Resolver automaticamente");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Linha (0-8): ");
                    int row = scanner.nextInt();
                    System.out.print("Coluna (0-8): ");
                    int col = scanner.nextInt();
                    System.out.print("Número (1-9): ");
                    int num = scanner.nextInt();

                    if (board.isValidMove(row, col, num)) {
                        board.getBoard()[row][col] = num;
                    } else {
                        System.out.println("Movimento inválido!");
                    }
                    break;

                case 2:
                    SudokuSolver.solve(board.getBoard());
                    board.printBoard();
                    System.out.println("Sudoku resolvido!");
                    gameOver = true;
                    break;

                case 3:
                    gameOver = true;
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
        System.out.println("Jogo encerrado!");
    }
}
