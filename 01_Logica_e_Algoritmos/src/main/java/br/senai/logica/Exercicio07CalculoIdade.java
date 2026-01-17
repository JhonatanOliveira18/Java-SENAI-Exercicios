package br.senai.logica;

import java.util.Scanner;

/**
 Crie um programa em Java que receba o nome e o ano de nascimento de uma
pessoa. O programa deve calcular a idade da pessoa com base no ano atual e exibir no
terminal o nome e a idade da pessoa.
 */
public class Exercicio07CalculoIdade {

    public static void main(String[] args) {
        //Instanciando a classe Scanner
        Scanner e = new Scanner(System.in);
        
        //Solicitando dados ao usuário e armazenando
        System.out.println("Insira seu nome: ");
        String nome = e.nextLine();
        
        System.out.println("Insira o seu ano de nascimento: ");
        int anoNascimento = e.nextInt();
        
        System.out.println("Insira o ano atual: ");
        int anoAtual = e.nextInt();
        e.close();
        
        //Calculo
        int idade = anoAtual - anoNascimento;
        
        //Exibindo dados
        System.out.println("Olá "+nome+", sua idade aproximada é " + idade + " anos.");
    }
    
}
