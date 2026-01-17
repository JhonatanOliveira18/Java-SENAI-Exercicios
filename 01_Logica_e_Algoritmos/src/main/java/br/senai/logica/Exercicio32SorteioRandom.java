package br.senai.logica;

import javax.swing.JOptionPane;

public class Exercicio32SorteioRandom {

    /*
    Elabore um programa que realize o sorteio de 6 números aleatórios entre 1 e 100. O
 programa deve exibir os números sorteados no formato:
 Números sorteados: 13 74 9 45 7 49
 Inclua a possibilidade para que o usuário possa realizar um novo sorteio.
    */
    public static void main(String[] args) {
    //Variaveis
    String escolha = "S";
    String numerosSorteados = ""; //Serve para armazenar os numeros

    
        //Mensagem inicial
        JOptionPane.showMessageDialog(null, "SORTEIO DE NUMEROS ALEATORIOS ENTRE 1 E 100");

        do{
            //Estrutura de repetição que faz com que o programa gere 6 números;
            for(int i = 0;i < 6; i++){

                //Utilizando a classe Math para gerar numeros aleatorios
                int aleatorio = (int)(Math.random() * 100) + 1; //O 100 após o operador * indica o intervalo de números

                 numerosSorteados += aleatorio + " ";
            }

            //Exibindo os números
            JOptionPane.showMessageDialog(null,"Números sorteados: " + numerosSorteados);

            //Barrando valores nulos
            String verificaEscolha = JOptionPane.showInputDialog(null, "Deseja repetir o programa?"
                    + "\n[S]Sim"
                    + "\n[N]Não");
            if(verificaEscolha == null || !verificaEscolha.equalsIgnoreCase("S")){
                escolha = "N";
            }else{
                escolha = "S";
                numerosSorteados = ""; //Limpando a variavel
            }

        }while(escolha.equalsIgnoreCase("S"));

        //Mensagem final
        JOptionPane.showMessageDialog(null, "FIM!");

}



}
