package br.senai.logica;

/**
 Crie um programa em Java que declare 4 variáveis, cada uma representando a nota
de um aluno em uma disciplina diferente. O programa deve exibir no terminal as notas
do aluno e calcular a média dessas notas, apresentando o resultado de forma clara.
 */
public class Exercicio05MediaAluno {

    public static void main(String[] args) {
        //Variáveis
        double nota1 = 5; 
        double nota2 = 5;
        double nota3 = 5;
        double nota4 = 5;
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        //Exibição: Notas e Resultado
        System.out.println("Nota 1 :" + nota1);
        System.out.println("Nota 2 :" + nota2);
        System.out.println("Nota 3 :" + nota3);
        System.out.println("Nota 4 :" + nota4);
        System.out.println("A media das notas: " + media);
    }
    
}
