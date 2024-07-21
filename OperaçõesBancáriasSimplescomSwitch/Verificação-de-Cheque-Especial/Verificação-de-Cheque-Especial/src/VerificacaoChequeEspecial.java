import java.util.Scanner;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita que o usuário informe o saldo atual da conta bancária
       // System.out.println("Informe o saldo atual da conta bancária:");
        double saldo = scanner.nextDouble();

        // Solicita que o usuário informe o valor do saque desejado
       // System.out.println("Informe o valor do saque desejado:");
        double saque = scanner.nextDouble();

        // Define um limite para o cheque especial
        double limiteChequeEspecial = 500;

        // Verifica se o saque ultrapassa o saldo disponível
        if (saque <= saldo) {
            System.out.println("Transacao realizada com sucesso.");
        } else {
            // Verifica se o saque, incluindo o cheque especial, ultrapassa o saldo + limiteChequeEspecial
            if (saque <= saldo + limiteChequeEspecial) {
                System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
            } else {
                System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
            }
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
