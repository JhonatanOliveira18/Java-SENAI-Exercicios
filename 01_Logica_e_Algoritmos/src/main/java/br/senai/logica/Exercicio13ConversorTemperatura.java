package br.senai.logica;

import java.util.Scanner;

public class Exercicio13ConversorTemperatura {

    /**
     Desenvolva um programa em Java que solicite ao usuário a temperatura em graus
    Celsius. O programa deve calcular e exibir o valor equivalente em graus Fahrenheit,
    utilizando a fórmula:
F = (C × 1.8) + 32
     */
    public static void main(String[] args) {
        // Instanciando a classe Scanner
        Scanner e = new Scanner(System.in);
        
        //Variáveis
        double grausCelsius;
        double grausFahrenheit;
        
        //Solicitando dados ao usuário
        System.out.print("Insira a temperatura em graus Celsius a ser convertida em Fahrenheit: ");
        grausCelsius = e.nextDouble();
        e.close();
        
        //Conversao para Fahrenheit utilizando a formula F = (C * 1.8) + 32
        grausFahrenheit = (grausCelsius * 1.8) + 32;
        
        //Exibindo resultado
        System.out.println("A temperatura informada em graus Celsius equivale a " +grausFahrenheit+ " graus Fahrenheit.");
    }
    
}
