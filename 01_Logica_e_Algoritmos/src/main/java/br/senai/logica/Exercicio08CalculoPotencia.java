package br.senai.logica;

import java.util.Scanner;

/**
 Crie um programa em Java que receba a tensão (V) e a corrente (A) de um aparelho
eletroeletrônico, fornecidas pelo usuário. O programa deve calcular a potência (P)
consumida pelo aparelho, utilizando a fórmula:

P = V × I
Onde:

 P é a potência em watts (W)
 V é a tensão em volts (V)
 I é a corrente em amperes (A)
 */
public class Exercicio08CalculoPotencia {

    public static void main(String[] args) {
        //Variáveis
        double tensao;
        double corrente;
        
        //Instanciando a classe Scanner
        Scanner e = new Scanner(System.in);
        
       
        //Solicitando dados ao usuário 
        System.out.println("Insira o valor da tensao (V):");
        tensao = e.nextDouble();
        
        System.out.println("Insira o valor da corrente (A):");
        corrente = e.nextDouble();
        e.close();
        
        //Calculo da potencia 
        //FORMULA P = V * I
        // P é a potência em watts (W), V é a tensão em volts (V),  A é a corrente em amperes (A)
        
        double potencia = tensao * corrente;
        
        System.out.println("Potencia consumida: " + potencia + "W");
    }
    
}
