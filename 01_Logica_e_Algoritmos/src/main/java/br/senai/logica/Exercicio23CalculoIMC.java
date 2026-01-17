package br.senai.logica;

import java.util.Scanner;

public class Exercicio23CalculoIMC {

    /*
     Desenvolva um programa em Java que calcule o Índice de Massa Corporal (IMC)
    de uma pessoa e determine sua situação de acordo com a tabela fornecida. O programa
    deve:
    1. Solicitar ao usuário o peso (em kg) e a altura (em metros) da pessoa.
    2. Calcular o IMC utilizando a fórmula:
    o IMC = peso / (altura * altura).
    3. Exibir o valor do IMC calculado e a situação da pessoa conforme a tabela
    abaixo: 
            Valor do IMC	Situação
    Abaixo de 18,5	Você está abaixo do peso ideal
    Entre 18,5 e 24,9	Parabéns, você está em seu peso normal
    Entre 25,0 e 29,9	Você está acima de seu peso (sobrepeso)
    Entre 30,0 e 34,9	Obesidade grau I
    Entre 35,0 e 39,9	Obesidade grau II
    40,0 e acima	Obesidade grau III
     */
    
    public static void main(String[] args) {
        // Instanciando a classe Scanner
        Scanner e = new Scanner(System.in);
        
        //Mensagem inicial
        System.out.println("========CALCULADORA DE IMC========= \n" );
        
        //Solicitando dados
        System.out.print("Insira seu peso em KG: ");
        double peso = e.nextDouble();
        
        System.out.print("Insira sua altura em Metros: ");
        double altura = e.nextDouble();
        e.close();
        
        //Cálculo
        double imc = peso / (altura * altura);
        
        //Estrutura condicional para verificar a situação da pessoa conforme o peso informado
        if(imc < 18.5){
            System.out.println("Você está abaixo do peso ideal!!!!");
        }
        else if(imc <= 24.9){
            System.out.println("Parabéns você está com peso normal");
        }
        else if(imc <= 29.9){
            System.out.println("Voce esta acima do seu peso!! Imenso.");
        }
        else if(imc <= 34.9){
            System.out.println("OBESIDADE GRAU 1");
        }
        else if(imc <= 39.9){
            System.out.println("OBESIDADE GRAU 2");
        }
        else{
            System.out.println("OBESIDADE GRAU 3");
        }
    }
    
}
