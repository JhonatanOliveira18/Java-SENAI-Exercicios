package br.senai.logica;

import java.util.Scanner;

/**
 Considerando o exercício anterior (08 - Calculo Potencia), calcule e exiba a corrente (A) que circula por
determinado aparelho eletroeletrônico a partir da potência (P) e tensão (V) digitadas pelo
usuário.
 */
public class Exercicio09CalculoCorrente {

    public static void main(String[] args) {
        //Variáveis
        double tensao;
        double potencia;
        
        //Instanciando a classe Scanner
        Scanner e = new Scanner(System.in);
        
       
        //Solicitando ao usuario que insira os valores
        System.out.println("Insira o valor da tensao (V):");
        tensao = e.nextDouble();
       
        System.out.println("Insira o valor da potencia (W):");
        potencia = e.nextDouble();
        e.close();
        
        //Calculo da corrente
        //FORMULA A = P / V 
        // P é a potência em watts (W), V é a tensão em volts (V),  A é a corrente em amperes (A)
        
        double corrente = potencia / tensao;
        
        System.out.println("Corrente: " + corrente);
    }
    
}
