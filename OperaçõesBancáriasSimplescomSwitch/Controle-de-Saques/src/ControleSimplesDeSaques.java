import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita que o usuário informe o limite diário de saque
       // System.out.println("Informe o limite diário de saque:");
        double limiteDiario = scanner.nextDouble();

        // Loop for para iterar sobre os saques
        for (int i = 1; ; i++) {
            // Solicita que o usuário informe o valor do saque
       //     System.out.println("Informe o valor do saque:");
            double valorSaque = scanner.nextDouble();

            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break; // Encerra o loop
            } else if (valorSaque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break; // Encerra o loop
            } else {
                // Atualiza o limite diário
                limiteDiario -= valorSaque;
                // Imprime a saída no formato dos exemplos
                System.out.printf("Saque realizado. Limite restante: %.1f%n", limiteDiario);
            }
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
