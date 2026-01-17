package br.senai.logica;

import javax.swing.JOptionPane;

public class Exercicio27TabuadaLoop {

    /**
     Elabore um programa em Java que permita ao usuário escolher um número para
    calcular a tabuada, ao final o programa deve oferecer a oportunidade ao usuário de
    realizar um novo cálculo escolhendo um novo número, o programa deve continuar até
    que o usuário decida finalizar a aplicação.
     */
    
    public static void main(String[] args) {
        //Variáveis
        int num;
        String escolha;
        
        //Mensagem inicial
        JOptionPane.showMessageDialog(null, "BEM VINDO A TABUADA INTERATIVA");
        
        //Laço de repetição garantindo que seja executado ao menos uma vez
        do{
           //Solicitando que o usuário insira um número para ser calculado e convertendo o dado de String para o tipo Int
           num = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o número que deseja para calcular a tabuada."));
            
           //Laço de repetição dentro do do-while que servirá para calcular a tabuada e exibir calculo por calculo
           for(int i = 0; i<11; i++){
           int tab = i * num; //calculo da tabuada
           JOptionPane.showMessageDialog(null, num + "x" +i+ "=" + tab);
           }
           
           //Questionando ao usuário se deseja continuar e armazenando sua resposta dentro da variavel de controle "escolha"
           escolha = JOptionPane.showInputDialog(null, "Deseja inserir outro valor?\n[S](Continua o programa)\n[N](Encerra o programa.)");
           
        //Serve para verificar a escolha do usuário e ignorar a diferença entre maiusculo ou minusculo e repetir o laço enquanto a escolha for "s"
        }while (escolha.equalsIgnoreCase("S"));
        
        //Mensagem de encerramento
        JOptionPane.showMessageDialog(null, "Obrigado por usar a calculadora!");
    }
    
}
