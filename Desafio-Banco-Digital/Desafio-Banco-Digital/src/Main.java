public class Main {
    public static void main(String[] args) {
        Cliente Luciana = new Cliente();
        Luciana.setNome("Luciana");
        
        Conta cc = new ContaCorrente(Luciana);
        Conta poupanca = new ContaPoupanca(Luciana);

        cc.depositar(25);
        cc.transferir(10, poupanca);
        
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
