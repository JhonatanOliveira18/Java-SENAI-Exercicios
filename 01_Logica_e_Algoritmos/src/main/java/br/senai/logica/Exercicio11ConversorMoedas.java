package br.senai.logica;

import java.util.Scanner;

/**
 Desenvolva um programa em Java que realize a conversão de moedas. O usuário deve
informar um valor em Reais (BRL), e o programa deve calcular e exibir o valor equivalente em
Euros (EUR) e Dólares (USD). Utilize valores fixos para as taxas de conversão e apresente esses
valores ao usuário.
 */

public class Exercicio11ConversorMoedas {

    public static void main(String[] args) {
        // Instanciando a classe Scanner
        Scanner e = new Scanner(System.in);
        
        //Variáveis
        double valorReal;
        double cotacaoDolar = 5.38;
        double cotacaoEuro  = 6.23;
        
        //Solicitando ao usuario que insira o valor em reais a ser convertido
        System.out.print("Insira o valor em reais a ser convertido para DOLAR e EURO:");
        valorReal = e.nextDouble();
        e.close();
        
        double conversaoDolar = valorReal / cotacaoDolar;
        double conversaoEuro  = valorReal / cotacaoEuro;
        
        System.out.println("Convertendo o valor fornecido em reais, voce possui: " + conversaoDolar + "dolares e: " + conversaoEuro + "euros");
        
        
    }
    
}
