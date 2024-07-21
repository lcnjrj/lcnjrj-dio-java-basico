public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Banco Brown Zoo Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }
}
