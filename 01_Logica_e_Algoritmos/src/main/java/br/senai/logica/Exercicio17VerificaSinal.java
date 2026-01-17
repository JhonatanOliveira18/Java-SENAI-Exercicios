package br.senai.logica;

import java.util.Scanner;

public class Exercicio17VerificaSinal {

    /*Desenvolva um programa em Java que solicite ao usuário a entrada de um valor
    numérico. O programa deve:
     Verificar se o valor é positivo ou negativo e exibir a mensagem correspondente
    na tela.
     Se o valor for igual a zero, exiba a mensagem &quot;O valor é zero&quot;.
     */
    
    public static void main(String[] args) {
        // Instanciando a classe Scanner
        Scanner e = new Scanner(System.in);
        
        //Variável
        int n1;
                
        //Solicitando dados ao usuário
        System.out.println("Insira um valor: ");
        n1 = e.nextInt();
        e.close();
        
        //Estrutura condicional para verificar o número inserido
        if (n1 >= 1){
            System.out.println(n1 + " é positivo");
        }
        else if (n1 == 0){
            System.out.println(n1 + " é zero");
        }
        else {
            System.out.println(n1 + " é negativo");
        }
    }
    
}
