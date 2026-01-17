package br.senai.logica;

import java.util.Scanner;

public class Exercicio18CalculoMacas {

    /*
    Desenvolva um programa em Java que solicite ao usuário o número de maçãs
    compradas. O programa deve:
     Verificar se o número de maçãs compradas é inferior a 12. Se for, o preço
    unitário será R$ 0,30.
     Se o número de maçãs for 12 ou mais, o preço unitário será R$ 0,25.
     Calcular e exibir o valor total da compra, considerando o preço unitário de
    acordo com a quantidade de maçãs compradas.
     */
    public static void main(String[] args) {
        //Instanciando a classe Scanner
         Scanner e = new Scanner(System.in);
         
        //Variáveis
        int qntMacas;
        double precoUnitario; 
        
        //Solicitando dados ao usuário
        System.out.println("Quantas maças você comprou?");
        qntMacas = e.nextInt();
        e.close();
        
        //Estrutura condicional que checa a quantidade comprada 
        if (qntMacas < 12){
            precoUnitario = 0.30;
        }
        else {
            precoUnitario = 0.25;
        }
        //Cálculo e exibição
        double valorTotal = precoUnitario * qntMacas;
        System.out.println("Total da compra: " + valorTotal);
    }
    
}
