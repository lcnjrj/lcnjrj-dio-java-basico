import java.util.Scanner;

public class SimulacaoBancaria {

    private static Banco banco = new Banco(); // Instância do banco

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha uma opção:");
            System.out.println("1: Criar Conta");
            System.out.println("2: Depositar");
            System.out.println("3: Sacar");
            System.out.println("4: Transferir");
            System.out.println("5: Consultar Saldo");
            System.out.println("0: Encerrar");

            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    criarConta(scanner);
                    break;
                case 2:
                    movimentarConta(scanner, "depositar");
                    break;
                case 3:
                    movimentarConta(scanner, "sacar");
                    break;
                case 4:
                    transferir(scanner);
                    break;
                case 5:
                    consultarSaldo(scanner);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }

    private static void criarConta(Scanner scanner) {
        System.out.println("Digite o nome do cliente:");
        String nome = scanner.next();
        Cliente cliente = new Cliente();
        cliente.setNome(nome);

        System.out.println("Escolha o tipo de conta: 1: Corrente, 2: Poupança");
        int tipoConta = scanner.nextInt();
        Conta conta;
        if (tipoConta == 1) {
            conta = new ContaCorrente(cliente);
        } else {
            conta = new ContaPoupanca(cliente);
        }
        banco.adicionarConta(conta);
        System.out.println("Conta criada com sucesso.");
    }

    private static void movimentarConta(Scanner scanner, String acao) {
        System.out.println("Digite o número da conta:");
        int numeroConta = scanner.nextInt();
        Conta conta = banco.encontrarContaPorNumero(numeroConta);
        if (conta != null) {
            if (acao.equals("depositar")) {
                System.out.println("Digite o valor a ser depositado:");
                double valor = scanner.nextDouble();
                conta.depositar(valor);
            } else if (acao.equals("sacar")) {
                System.out.println("Digite o valor a ser sacado:");
                double valor = scanner.nextDouble();
                conta.sacar(valor);
            }
            System.out.printf("Saldo atual: %.2f%n", conta.getSaldo());
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    private static void transferir(Scanner scanner) {
        System.out.println("Digite o número da conta de origem:");
        int numeroOrigem = scanner.nextInt();
        Conta contaOrigem = banco.encontrarContaPorNumero(numeroOrigem);

        System.out.println("Digite o número da conta de destino:");
        int numeroDestino = scanner.nextInt();
        Conta contaDestino = banco.encontrarContaPorNumero(numeroDestino);

        if (contaOrigem != null && contaDestino != null) {
            System.out.println("Digite o valor a ser transferido:");
            double valor = scanner.nextDouble();
            contaOrigem.transferir(valor, contaDestino);
            System.out.println("Transferência realizada com sucesso.");
        } else {
            System.out.println("Uma ou ambas as contas não foram encontradas.");
        }
    }

    private static void consultarSaldo(Scanner scanner) {
        System.out.println("Digite o número da conta:");
        int numeroConta = scanner.nextInt();
        Conta conta = banco.encontrarContaPorNumero(numeroConta);
        if (conta != null) {
            System.out.printf("Saldo atual: %.2f%n", conta.getSaldo());
        } else {
            System.out.println("Conta não encontrada.");
        }
    }
}