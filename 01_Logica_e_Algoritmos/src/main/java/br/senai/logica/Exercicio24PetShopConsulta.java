package br.senai.logica;

import java.util.Scanner;

public class Exercicio24PetShopConsulta {

    /*
     Elabore um programa para um pet shop que permita ao cliente verificar o valor de
    uma consulta para seu animal de estimação. O pet shop oferece 3 especialidades:
    Clínica Geral, Dermatologia e Odontologia. O cliente deve escolher a especialidade
    desejada e informar se possui convênio.
    Os preços das consultas são:
    Clínica Geral: R$ 100,00.
    Dermatologia: R$ 150,00
    Odontologia: R$ 120,00
    Banho e Tosa: R$ 120,00
    Clientes com convênio recebem um desconto de 20% no valor da consulta. 
     */
    
    public static void main(String[] args) {
        // Instanciando a classe Scanner
        Scanner e = new Scanner(System.in);
        
        ////Declarando variaveis para o valor das consultas, permitindo que possam ser alterados no futuro
        double valorCg = 100.00;
        double valorDerma = 150.00;
        double valorOdonto = 120.00; 
        
        //Menagem inicial
        System.out.println("========= PET SHOP SENAI! =========\n");
        
        //Solicitando dados ao usuário
        System.out.println("Escolha a especialidade desejada: \n");
        System.out.print("[1] - Clinica Geral. \n[2] - Dermatologia. \n[3] - Odontologia.\nESCOLHA: ");
        int escolha = e.nextInt();
        
        System.out.println("Possui convenio? ");
        System.out.println("1 - Sim. \n2 - Nao.");
        int convenio = e.nextInt();
        e.close();
        
        //Estrutura condicional para avaliar o valor da consulta e verificar a possibilidade de desconto
        //Clinica Geral:
        if (escolha == 1 && convenio == 1){
            double desconto = valorCg * 0.80;
            System.out.println("Valor da consulta: " + desconto);
        }
        else if (escolha == 1 && convenio == 2){
            System.out.println("Valor da consulta: " + valorCg);
        }
        
        //Dermatologia
        else if (escolha == 2 && convenio == 1){
            double desconto = valorDerma * 0.80;
            System.out.println("Valor da consulta: " + desconto);
        }
        else if (escolha == 2 && convenio == 2){
            System.out.println("Valor da consulta: " + valorDerma);
        }
        
        //Odontologia
        else if (escolha == 3 && convenio == 1){
            double desconto = valorOdonto * 0.80;
            System.out.println("Valor da consulta: " + desconto);
        }
        else if (escolha == 3 && convenio == 2){
            System.out.println("Valor da consulta: " + valorOdonto);
        }
        
        //Resposta inválida
        else {
            System.out.println("INSIRA UMA OPCAO VALIDA.");
        }
        //Mensagem final
        System.out.println("FIM!");
    }
    
}
