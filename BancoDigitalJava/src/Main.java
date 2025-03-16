public class Main {
    public static void main(String[] args) {
        // Criando o banco
        Banco banco = new Banco("Banco Digital");

        // Criando contas e adicionando ao banco
        ContaCorrente conta1 = new ContaCorrente("João");
        ContaPoupanca conta2 = new ContaPoupanca("Maria");

        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);

        // Operações bancárias
        conta1.depositar(1000);
        conta2.depositar(500);

        conta1.sacar(200);
        conta2.aplicarRendimento();

        conta1.transferir(100, conta2);

        // Listando contas no banco após as operações
        banco.listarContas();
    }
}
