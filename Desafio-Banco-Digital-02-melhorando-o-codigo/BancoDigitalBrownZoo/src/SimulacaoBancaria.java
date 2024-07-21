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
            System.out.println("6: Imprimir Extrato");
            System.out.println("0: Encerrar");

            int opcao = lerInteiro(scanner);
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
                case 6:
                    imprimirExtrato(scanner);
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
        int tipoConta = lerInteiro(scanner);
        Conta conta;
        if (tipoConta == 1) {
            conta = new ContaCorrente(cliente);
        } else if (tipoConta == 2) {
            conta = new ContaPoupanca(cliente);
        } else {
            System.out.println("Tipo de conta inválido.");
            return;
        }
        banco.adicionarConta(conta);
        System.out.println("Conta criada com sucesso.");
    }

    private static void movimentarConta(Scanner scanner, String acao) {
        System.out.println("Digite o número da conta:");
        int numeroConta = lerInteiro(scanner);
        Conta conta = banco.encontrarContaPorNumero(numeroConta);
        if (conta != null) {
            if (acao.equals("depositar")) {
                System.out.println("Digite o valor a ser depositado:");
                double valor = lerDouble(scanner);
                conta.depositar(valor);
            } else if (acao.equals("sacar")) {
                System.out.println("Digite o valor a ser sacado:");
                double valor = lerDouble(scanner);
                conta.sacar(valor);
            }
            System.out.printf("Saldo atual: %.2f%n", conta.getSaldo());
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    private static void transferir(Scanner scanner) {
        System.out.println("Digite o número da conta de origem:");
        int numeroOrigem = lerInteiro(scanner);
        Conta contaOrigem = banco.encontrarContaPorNumero(numeroOrigem);

        System.out.println("Digite o número da conta de destino:");
        int numeroDestino = lerInteiro(scanner);
        Conta contaDestino = banco.encontrarContaPorNumero(numeroDestino);

        if (contaOrigem != null && contaDestino != null) {
            System.out.println("Digite o valor a ser transferido:");
            double valor = lerDouble(scanner);
            contaOrigem.transferir(valor, contaDestino);
            System.out.println("Transferência realizada com sucesso.");
        } else {
            System.out.println("Uma ou ambas as contas não foram encontradas.");
        }
    }

    private static void consultarSaldo(Scanner scanner) {
        System.out.println("Digite o número da conta:");
        int numeroConta = lerInteiro(scanner);
        Conta conta = banco.encontrarContaPorNumero(numeroConta);
        if (conta != null) {
            System.out.printf("Saldo atual: %.2f%n", conta.getSaldo());
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    private static void imprimirExtrato(Scanner scanner) {
        System.out.println("Digite o número da conta:");
        int numeroConta = lerInteiro(scanner);
        Conta conta = banco.encontrarContaPorNumero(numeroConta);
        if (conta != null) {
            conta.imprimirExtrato();
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    private static int lerInteiro(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                scanner.next(); // Limpa o buffer do scanner
            }
        }
    }

    private static double lerDouble(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número decimal.");
                scanner.next(); // Limpa o buffer do scanner
            }
        }
    }
}

// Aqui você deve incluir as classes Cliente, Conta, ContaCorrente, ContaPoupanca e Banco
