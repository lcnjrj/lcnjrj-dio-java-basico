1021package com.contabanco;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        // Criação do objeto Scanner para receber dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitação e leitura dos dados
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência:");
        scanner.nextLine(); // Consumir a quebra de linha pendente
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        // Fechando o scanner
        scanner.close();

        // Exibição da mensagem final
        String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
                                         nomeCliente, agencia, numero, saldo);
        System.out.println(mensagem);
    }
}
