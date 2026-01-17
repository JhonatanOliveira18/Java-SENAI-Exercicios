package br.senai.logica;

import java.util.Scanner;

public class Exercicio19AptidaoVoto {

    /*
    Desenvolva um programa em Java que leia a idade de uma pessoa e determine se
    ela pode ou não votar nas próximas eleições. O programa deve:
     Informar se a pessoa pode votar ou não, com base nas seguintes condições:
    o Se a idade for entre 18 e 70 anos (inclusive), o voto é obrigatório.
    o Se a idade for entre 16 e 17 anos ou maior que 70 anos, o voto é
    facultativo.
    o Se a idade for inferior a 16 anos, a pessoa não pode votar.
     Caso a pessoa não esteja apta a votar, o programa deve informar quantos anos
    faltam para que ela possa votar ou exercer o voto obrigatório. 
     */
    
    public static void main(String[] args) {
        // Instanciando a classe Scanner
        Scanner e = new Scanner(System.in);
        
        //Solicitando dados ao usuário
        System.out.println("Insira sua idade: ");
        int idade = e.nextInt();
        e.close();
        
        //Estrutura condicional que checa a idade informada
        if (idade >= 18 && idade <= 70){
            System.out.println("Devido a sua idade ser " + idade + " seu voto e obrigatorio.");       
        }
        else if (idade >= 16 || idade > 70){
            System.out.println("Devido a sua idade ser " + idade + " seu voto e facultativo");
        }
        else {
            System.out.println("Voce nao pode votar. Faltam "  + (16 - idade) + " anos ate voce poder votar sem a obrigatoriedade (voto facultativo)");
        }
    }
    
}
