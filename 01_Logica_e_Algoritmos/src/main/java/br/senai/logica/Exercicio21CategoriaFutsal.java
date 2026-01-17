package br.senai.logica;

import java.util.Scanner;

public class Exercicio21CategoriaFutsal {

    /**
     Desenvolva um programa em Java que leia a idade e o nome de um jogador de
    futsal e, com base na idade, informe sua categoria de acordo com a tabela abaixo:
     Infantil: até 10 anos
     Juvenil: até 18 anos
     Profissional: acima de 18 até 40 anos
     Master: acima de 40 anos
     */
    
    public static void main(String[] args) {
        //Instanciando a classe Scanner 
        Scanner e = new Scanner(System.in);
        
        //Variáveis
        String nome;
        int idade;
        
        //Solicitando dados ao usuário
        System.out.println("Informe seu nome:");
        nome = e.nextLine();
        
        System.out.println("Informe sua idade:");
        idade = e.nextInt();
        e.close();
                
        //Estrutura condicional que verifica a idade do jogador
        if (idade <=10) {
            System.out.println("Categoria: infantil");
        }
        else if (idade <=18) {
            System.out.println("Categoria: juvenil");
        }
        else if (idade <= 40) {
            System.out.println("Categoria: profissional");
        }    
        else {
            System.out.println("Categoria: master");        
        }
    }
    
}
