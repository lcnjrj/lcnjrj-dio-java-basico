import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RegistroTransacoesComStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o saldo inicial da conta
        double saldo = scanner.nextDouble();
        // Lê a quantidade total de transações
        int quantidadeTransacoes = scanner.nextInt();

        // Lista para armazenar as transações
        List<Transacao> transacoes = new ArrayList<>();

        // Loop para processar cada transação
        for (int i = 0; i < quantidadeTransacoes; i++) {
            // Lê o tipo de transação e o valor
            char tipoTransacao = scanner.next().toUpperCase().charAt(0);
            double valorTransacao = scanner.nextDouble();

            // Cria uma nova transação e adiciona à lista
            Transacao transacao = new Transacao(tipoTransacao, valorTransacao);
            transacoes.add(transacao);

            // Atualiza o saldo com base no tipo de transação
            if (tipoTransacao == 'D') {
                saldo += valorTransacao;
            } else if (tipoTransacao == 'S') {
                saldo -= valorTransacao;
            } else {
                System.out.println("Tipo de transação inválido. Utilize 'D' para depósito ou 'S' para saque.");
                transacoes.remove(transacao); // Remove a transação inválida
                i--; // Decrementa o índice para repetir a iteração
            }
        }

        // Exibe o saldo final
        System.out.println("Saldo : " + saldo);
        
        // Exibe as transações formatadas
        System.out.println("Transacoes:");
        transacoes.stream()
                .map(transacao -> transacao.getTipo() + " de " + transacao.getValor())
                .map(str -> str.replace("D", "d").replace("S", "s"))
                .forEach(System.out::println);

        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}

class Transacao {
    private char tipo;
    private double valor;

    public Transacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public char getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }
}
