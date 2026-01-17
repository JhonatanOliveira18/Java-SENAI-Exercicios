package br.senai.logica;

import java.util.Scanner;

public class Exercicio14OperacoesBasicas {

    /**
     Desenvolva um programa em Java que solicite ao usuário a entrada de dois
    números. O programa deve calcular e exibir:
     A soma dos dois números.
     A subtração do primeiro número pelo segundo.
     A multiplicação dos dois números.
     A divisão do primeiro número pelo segundo.
    Certifique-se de apresentar os resultados de forma organizada e com mensagens claras
    para o usuário.
     */
    public static void main(String[] args) {
        // Instanciando a classe Scanner
        Scanner e = new Scanner(System.in);
        
        //Variáveis
        double num1;
        double num2;
        double soma;
        double subtracao;
        double multiplicacao;
        double divisao;
        double resultado;
        
        //Mensagem inicial
        System.out.println("--------- Programa de calculo de dois valores --------");
       
       //Solicitando que o usuario insira dois valores
        System.out.print("Insira um valor: ");
        num1 = e.nextDouble();
        
        System.out.print("Insira um segundo valor: \n");
        num2 = e.nextDouble();
        e.close();
        
        //Cálculo
        soma = num1 + num2;
        subtracao = num1 - num2;
        multiplicacao = num1 * num2;
        divisao = num1 / num2;
        
        //Exibindo resultados
        System.out.println("======= Resultados dos calculos com os 4 principais operadores com base nos dois numeros informados =======");
        System.out.println("Resultado da soma: " + soma);
        System.out.println("Resultado da subtracao: " + subtracao);
        System.out.println("Resultado da multiplicacao: " + multiplicacao);
        System.out.println("Resultado da divisao: " + divisao);
        
        
    }
    
}
