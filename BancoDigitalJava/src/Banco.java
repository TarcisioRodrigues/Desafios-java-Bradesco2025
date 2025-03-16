import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
        System.out.println("Conta adicionada para " + conta.getTitular());
    }

    public void listarContas() {
        System.out.println("\n=== Contas do Banco " + nome + " ===");
        for (Conta conta : contas) {
            System.out.println(conta);
        }
    }
}
