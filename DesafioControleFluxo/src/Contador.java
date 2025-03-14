import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        // Entrada dos parâmetros
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt(); // Lendo o primeiro parâmetro

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt(); // Lendo o segundo parâmetro

        try {
            // Chamando o método de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            // Imprimir a mensagem de erro se a exceção for lançada
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    // Método para realizar a contagem
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se o primeiro parâmetro é maior que o segundo
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O primeiro parâmetro não pode ser maior ou igual ao segundo.");
        }

        // Realizar a contagem entre os dois parâmetros
        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println(i); // Imprimir o número atual
        }
    }
}

// Exceção personalizada
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}
