package br.senai.logica;


public class Exercicio02Operadores {

    /**
     Crie um programa em Java que defina 4 constantes, cada uma contendo um número
    inteiro. Utilize todos os operadores aritméticos (adição, subtração, multiplicação,
    divisão e módulo) para realizar cálculos com essas constantes. Após realizar os cálculos,
    o programa deve exibir os resultados no terminal.
     */
    
    public static void main(String[] args) {
        //Declarando constantes
        final int NUMERO1 = 1974;
        final int NUMERO2 = 13;
        final int NUMERO3 = 75;
        final int NUMERO4 = 22;
        
        //MULTIPLICACAO
        int multiplicacao = NUMERO1 * NUMERO2;
        
        //DIVISAO
        int divisao = NUMERO3 / NUMERO4;
        
        //RESTO DA DIVISAO
        int restoDivisao = NUMERO3 % NUMERO4;
        
        //SOMA
        int soma = NUMERO2 + NUMERO3;
        
        //SUBTRACAO
        int subtracao = NUMERO3 - NUMERO4;
        
        System.out.println("O resultado da soma: " + soma);
        System.out.println("O resultado da subtracao: " + subtracao);
        System.out.println("O resultado da multiplicacao: " + multiplicacao);
        System.out.println("O resultado da divisao: " + divisao);
        System.out.println("O resto da divisao: " + restoDivisao);
        
    }
    
}
