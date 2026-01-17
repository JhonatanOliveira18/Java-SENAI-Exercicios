package br.senai.logica;

import java.util.Scanner;

public class Exercicio22ReajusteSalarial {

    /**
     Desenvolva um programa em Java que calcule o reajuste salarial de um colaborador
    de acordo com os seguintes critérios:
     Salários até R$ 1.280,00: aumento de 20%;
     Salários entre R$ 1.280,01 e R$ 1.700,00: aumento de 15%;
     Salários entre R$ 1.700,01 e R$ 2.500,00: aumento de 10%;
     Salários de R$ 2.500,01 em diante: aumento de 5%.
    O programa deve:
    1. Solicitar ao usuário o nome, a função e o salário do colaborador.
    2. Calcular o aumento com base no salário e nas faixas de valor fornecidas.
    3. Exibir na tela:
    o O nome e função do funcionário.
    o O percentual de aumento aplicado.
    o O salário antes do reajuste.
    o O novo salário.
     */
    public static void main(String[] args) {
        // Instanciando a classe Scanner
        Scanner e = new Scanner(System.in);
        
        //Mensagem inicial
        System.out.println("Bem vindo ao calculador de reajuste salarial");
        
        //Solicitando dados ao usuário
        System.out.print("Insira seu nome: ");
        String nome = e.nextLine();
        
        System.out.print("Insira seu cargo: ");
        String cargo = e.nextLine();
        
        System.out.println("Insira seu salario: ");
        double salario = e.nextDouble();
        e.close();
        
        //Exibindo dados
        System.out.println("Funcionario: " + nome +" Cargo: "+ cargo + "\n");
        
        //Estrutura condicional para verificar o percentual de aumento com base no salário informado
        if (salario <= 1280.00){
            System.out.println("Seu salário antigo: R$" + salario);
            salario *= 1.20; 
            System.out.println("Seu novo salário com aumento de 20%: R$" + salario);
        }
        else if (salario <= 1700.00){
            System.out.println("Seu salário antigo: R$" + salario);
            salario *= 1.15;
            System.out.println("Seu novo salário com aumento de 15%: R$" + salario);
        }
        else if (salario <= 2500.00 ) {
            System.out.println("Seu salário antigo: R$" + salario);
            salario *= 1.10;
            System.out.println("Seu novo salário com aumento de 10%: R$" + salario);
        }
        else {
            System.out.println("Seu salário antigo: R$" + salario);
            salario *= 1.05;
            System.out.println("Seu novo salário com aumento de 5%: R$" + salario);
            
        }
       
    }
    
}
