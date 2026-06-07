package exercicio37sistemabancario;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    /**
     * Crie um sistema bancário simples utilizando o paradigma de orientação a
     * objetos. O sistema deve permitir realizar as seguintes operações:  Saque
     *  Depósito  Consulta de Saldo  Empréstimo
     *
     * Requisitos: 1. Saque: O sistema deve impedir saques de valores negativos.
     * O valor do saque não pode ser superior ao saldo disponível na conta.
     *
     * 2. Empréstimo: Os empréstimos devem ter um acréscimo de 12% sobre o valor
     * solicitado. O usuário não poderá solicitar um novo empréstimo enquanto
     * houver saldo devedor de um empréstimo anterior.
     *
     * 3. Depósito: O depósito deve ser possível a qualquer momento e não tem
     * restrição quanto ao valor.
     *
     * 4. Classe Decimal Format: Utilize a classe DecimalFormat para formatar os
     * valores monetários exibidos no sistema.
     *
     * 5. Tratamento de Exceções: O sistema deve conter um tratamento adequado
     * de exceções para erros como saldo insuficiente, valores inválidos, e
     * empréstimos pendentes.
     */
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#,##0.00");
        Scanner e = new Scanner(System.in);

        int operacao = 10;

        System.out.println("\nInsira seu nome:");
        String nome = e.nextLine();

        Conta c1 = new Conta();
        c1.setTitular(nome);

        System.out.println("\nOlá, " + nome);

        while (operacao != 0) {

            try {
                System.out.println("\nEscolha uma operação:"
                        + "\n[1] Saque"
                        + "\n[2] Solicitar Empréstimo"
                        + "\n[3] Quitar Empréstimo"
                        + "\n[4] Depósito"
                        + "\n[0] Sair");

                operacao = e.nextInt();

                switch (operacao) {

                    case 1:
                        System.out.println("\nSAQUE:\nInsira um valor para o saque: ");
                        c1.saque(e.nextDouble());
                        System.out.println("Saldo atual: R$" + df.format(c1.getSaldo()) + "\n");
                        break;
                    case 2:
                        System.out.println("\nEMPRÉSTIMO:\nInsira o valor do empréstimo: ");
                        c1.solicitarEmprestimo(e.nextDouble());
                        break;
                    case 3:
                        System.out.println("PENDÊNCIAS COM EMPRÉSTIMO");
                        System.out.println("Saldo devedor: R$" + df.format(c1.getSaldoDevedor()));

                        if (c1.getSaldoDevedor() > 0) {

                            System.out.println("Digite o valor para pagamento:");

                            c1.quitarEmprestimo(e.nextDouble());
                        } else {
                            System.out.println("Você não possui pendências.");
                        }
                        break;
                    case 4:
                        System.out.println("DEPÓSITO\n Saldo atual: " + df.format(c1.getSaldo()));
                        System.out.println("\nInsira o valor do depósito: ");
                        c1.depositar(e.nextDouble());
                        System.out.println("Saldo atual: R$" + df.format(c1.getSaldo()));

                }

            } catch (InputMismatchException er) {
                System.out.println("Insira valores númericos de acordo com as opções apresentadas.");
                e.nextLine();
            }
        }

        System.out.println("Sistema encerrado");
    }

}
