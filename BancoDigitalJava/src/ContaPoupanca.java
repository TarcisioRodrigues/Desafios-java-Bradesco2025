class ContaPoupanca extends Conta {
    private static final double RENDIMENTO = 0.02;

    public ContaPoupanca(String titular) {
        super(titular);
    }

    public void aplicarRendimento() {
        double rendimento = getSaldo() * RENDIMENTO;
        depositar(rendimento);
        System.out.println("Rendimento aplicado: R$ " + rendimento);
    }
}
