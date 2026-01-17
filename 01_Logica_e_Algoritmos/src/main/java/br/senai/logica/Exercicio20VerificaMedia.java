package br.senai.logica;

import java.util.Scanner;

public class Exercicio20VerificaMedia {

    /*
     Desenvolva um programa em Java que receba 4 notas de um aluno, conforme as
    condições descritas. O programa deve:
    1. Calcular a média das 4 notas.
    2. Verificar a média:
    o Se a média for maior ou igual a 7, exibir a mensagem &quot;Aluno aprovado&quot;.
    o Se a média for inferior a 7, exibir a mensagem &quot;Aluno reprovado&quot;.
    Certifique-se de tratar corretamente as entradas para garantir que o usuário não possa
    informar notas inválidas.
     */
    
    public static void main(String[] args) {
        //Instanciando a classe Scanner
        Scanner e = new Scanner(System.in);
        
        //Variaveis para armazenar as notas
        double n1;
        double n2;
        double n3;
        double n4;
          
        //Solicitando as notas
        System.out.println("Insira a primeira nota (0 a 10): ");
        n1 = e.nextDouble();
        
        System.out.println("Insira a segunda nota (0 a 10): ");
        n2 = e.nextDouble();
        
        System.out.println("Insira a terceira nota (0 a 10): ");   
        n3 = e.nextDouble();
        
        System.out.println("Insira a quarta nota (0 a 10): ");
        n4 = e.nextDouble();
        
        double media = (n1 + n2 + n3 + n4) / 4;
        
        if (media < 0 || media > 10) {
        System.out.println("Notas Inválidas foram inseridas. Média fora do limite (0-10) esperado.");
        } 
        // Se a média é válida (entre 0 e 10), prossegue para a aprovação/reprovação
        else if (media >= 7) {
        System.out.println("Aluno Aprovado");
        } else {
        System.out.println("Aluno Reprovado");
        }
        
        /*Obs: acima foi a solução que eu pensei considerando que o programa deveria utilizar recursos simples somente.
        O programa apesar de blindar alguns valores altos de serem inseridos, ainda possui brechas.
        Em seguida, uma sugestão simples dada pelo professor em conjunto com uma breve pesquisa:*/
        
        /*Criação de uma variável booleana para verificar todos os valores das notas de uma vez.
        
        boolean notasInvalidas = (n1 < 0 || n1 > 10) || 
                                 (n2 < 0 || n2 > 10) ||
                                 (n3 < 0 || n3 > 10) ||
                                 (n4 < 0 || n4 > 10);
        
        Com isso seria possivel utilizando em conjunto uma estrutura condicional que checaria se os requisitos retornaram
        verdadeiro, ou seja, se possui alguma nota inválida presente
        
        if (notasInvalidas) { // É como se fosse um: if (true) "se a condição for verdadeira o tratamento de erro será feito para garantir que o usuário não possa
        informar notas inválidas."
            
        } else { // Se for falso, ou seja, se não tiver valores incorretos o programa irá executar o cálculo seguindo o rumo do código
            
        }
        */
        
        
    }
    
}
