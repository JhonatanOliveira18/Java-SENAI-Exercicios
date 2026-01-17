package br.senai.logica;

import java.util.Scanner;

public class Exercicio12CalculoSalario {

    /**
     Desenvolva um programa em Java que solicite ao usuário o valor do salário em
reais. O programa deve calcular e exibir:
 O valor do adiantamento do salário, considerando 40% do total.
 O valor do desconto em folha, correspondente a 8% do total.
 O valor final a ser recebido pelo usuário ao final do mês, após os descontos.
     */
    
    public static void main(String[] args) {
        // Instanciando a classe Scanner
        Scanner e = new Scanner(System.in);
        
        //Variáveis
        double salario;
        double adiantamentoSalario;
        double desconto;
        double valorFinal;
        
        //Solicitando ao usuário que informe seu salário
        System.out.println("Insira o valor do seu salário:");
        salario = e.nextDouble();
        e.close();
        
        //Calculos
        adiantamentoSalario = (salario * 0.40); 
        System.out.println("Valor do adiantamento: R$" + adiantamentoSalario);
        
        desconto = salario * 0.08;
        System.out.println("Desconto em folha:" + desconto);
        
        valorFinal = (salario - adiantamentoSalario - desconto);
        System.out.println("Total a ser recebido: R$" + valorFinal);
    }
    
}
