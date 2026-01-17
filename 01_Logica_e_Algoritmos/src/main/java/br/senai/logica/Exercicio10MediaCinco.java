package br.senai.logica;

import java.util.Scanner;

/**
 Crie um programa em Java que solicite ao usuário a entrada de 5 números. Após a
entrada de todos os números, o programa deve calcular e exibir a média desses valores.
 */
public class Exercicio10MediaCinco {

    public static void main(String[] args) {
        //Variáveis
        double n1; 
        double n2;
        double n3;       
        double n4;       
        double n5;
        
        //Instanciando a classe Scanner
        Scanner e = new Scanner(System.in);
        
        //Solicitando ao usuário que insira os 5 valores para o calculo da media deles
        System.out.println("Insira a primeira nota: ");
        n1 = e.nextDouble();
        
        System.out.println("Insira a segunda nota: ");
        n2 = e.nextDouble();
        
        System.out.println("Insira a terceira nota: ");   
        n3 = e.nextDouble();
        
        System.out.println("Insira a quarta nota: ");
        n4 = e.nextDouble();
        
        System.out.println("Insira a quinta nota: ");
        n5 = e.nextDouble();
        e.close();
        
        //Calculando a media
        double media = (n1 + n2 + n3 + n4 + n5) / 5;
        
        //Exibindo a media
        System.out.println("A sua media das notas: " + media);
    }
    
}
