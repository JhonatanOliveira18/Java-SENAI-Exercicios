/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.senai.logica;

import javax.swing.JOptionPane;

/**
 *
 * @author Jhinin
 */
public class Exercicio34ArrayValidacao {

    /*
 Implementação de Array com Validação e Tratamento de Erros. Com base no código de
inicialização de arrays fornecido no Slide 12 da apresentação Java 012, desenvolva uma
aplicação que atenda aos seguintes requisitos:
Iteração para Preenchimento: Implemente uma estrutura de repetição (for ou while) para
controlar e garantir o preenchimento completo do array notaAluno.
Validação de Intervalo: Dentro do loop de repetição, insira uma validação (do-while é
recomendado para este ponto) que force o usuário a inserir notas estritamente no intervalo
entre 0.0 e 10.0 (inclusive). A repetição deve continuar até que um valor válido seja fornecido.
Tratamento de Exceções: Utilize o bloco try-catch para tratar eventuais erros de entrada de
dados (se o usuário digitar texto em vez de um valor numérico). Em caso de erro, a aplicação
deve notificar o usuário e solicitar a entrada da nota novamente, sem encerrar o programa.
Objetivo: Garantir a robustez do programa contra dados inválidos e formatos incorretos.
 */

    public static void main(String[] args) {
        //Variaveis
        int qntNotas = 0; //Programa não informa uma quantidade de notas especifica, então irei solicitar ao usuário que escolha
        double[] notasAluno = new double[qntNotas]; //Criacao do array
        String escolha = "S";

        //Mensagem inicial
        JOptionPane.showMessageDialog(null, "ARRAY COM VALIDACAO");

        do{
            try{
                //Coletando a quantidade de notas
                qntNotas = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade de notas"));


                //Estrutura de repeticao
                for(int i = 0; i < qntNotas; i++){
                    double verificaNota = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a "+(i + 1)+" nota.\nObs: A nota deve ser entre 0 e 10"));
                    //Loop para permitir apenas notas dentro do limite estabelecido
                    while(verificaNota < 0 || verificaNota > 10){
                        notasAluno[i] = verificaNota;
                        JOptionPane.showMessageDialog(null, notasAluno[i]);
                    }
                }
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "ERRO: Dado inserido incorretamente.");
            }
        }while(escolha.equalsIgnoreCase("S"));


    }
    
}
