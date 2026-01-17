package br.senai.logica;

import java.util.Scanner;

public class Exercicio15ContaBancariaSimples {

    /**
     Desenvolva um programa em Java que simule a abertura de uma conta bancária. O
    programa deve:
    1. Inicializar o saldo da conta com o valor de zero.
    2. Solicitar ao usuário o valor de um depósito, atualizar o saldo e exibir o novo
    valor.
    3. Solicitar ao usuário o valor de um saque, atualizar o saldo e exibir o valor final
    da conta.
    4. Garantir que o valor do saque não seja maior que o saldo disponível, exibindo
    uma mensagem de erro caso isso aconteça.
     */
    public static void main(String[] args) {
        // Instanciando classe Scanner
        Scanner e = new Scanner(System.in);
        
        //Mensagem de inicio
        System.out.println("Bem vindo ao Banco Senai");
        
        //Variáveis
        double saldo = 0;
        
        //Solicitando ao usuário um valor de depósito e guardando
        System.out.println("SALDO: "+saldo+"\nInsira um valor de depósito: ");
        double deposito = e.nextDouble();
        
        //Atualizando saldo e exibindo
        saldo += deposito;
        System.out.println("SALDO: "+saldo);
        
        
        //Solicitar ao usuário o valor de um saque, atualizar o saldo e exibir o valor final da conta.
        System.out.print("Insira o valor do saque: ");
        double saque = e.nextDouble();
        e.close();
        
        if (saque <= saldo){
            saldo -= saque;
            System.out.println("Saque realizado com sucesso! \nSeu saldo atual é de " + (saldo));
        } 
        else {
            System.out.println("Voce nao possui saldo o suficiente para realizar esse saque.\nSeu saldo atual é de " + (saldo));
        }
    }
    
}
