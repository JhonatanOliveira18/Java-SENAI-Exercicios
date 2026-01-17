package br.senai.logica;

import java.util.Scanner;

public class Exercicio16CalculoDesconto {

    /*
     Desenvolva um programa em Java que solicite ao usuário o valor de uma compra.
    O programa deve:
     Verificar se o valor é superior a R$ 150,00. Se for, conceder um desconto de
    15% sobre o valor da compra e exibir o valor com o desconto aplicado.
     Caso o valor seja igual ou inferior a R$ 150,00, exibir a mensagem &quot;Sem
    desconto&quot;.
     */
    
    public static void main(String[] args) {
        //Instanciando a classe Scanner
        Scanner e = new Scanner(System.in);
        
        //Mensagem de inicio
        System.out.println("======= Bem vindo Calculador de Desconto! ========");
        
        //Solicitando o valor de uma compra ao usuário
        System.out.println("Insira o valor da compra: ");
        double valorCompra = e.nextDouble();
        e.close();
        
        //Variável que será usada para o cálculo, dessa forma fica mais fácil manipular o percentual de desconto
        double desconto = 0.15;
        
        //Verificando valor por meio de uma estrutura condicional e consultando a possibilidade de aplicar um desconto
        if (valorCompra > 150){
            System.out.println("Parabéns! Você ganhou um desconto de 15%. \n Total da compra: " + (valorCompra - (valorCompra * desconto)));
        }
        else {
            System.out.println("Infelizmente sua compra não atingiu o valor necessário para obter o desconto.");
        }
        
        
    }
    
}
