class ContaCorrente extends Conta {
    private static final double TAXA_SAQUE = 2.50;

    public ContaCorrente(String titular) {
        super(titular);
    }

    @Override
    public void sacar(double valor) {
        double valorComTaxa = valor + TAXA_SAQUE;
        if (valorComTaxa > 0 && getSaldo() >= valorComTaxa) {
            super.sacar(valorComTaxa);
            System.out.println("Taxa de saque aplicada: R$ " + TAXA_SAQUE);
        } else {
            System.out.println("Saldo insuficiente para saque incluindo a taxa.");
        }
    }
}
