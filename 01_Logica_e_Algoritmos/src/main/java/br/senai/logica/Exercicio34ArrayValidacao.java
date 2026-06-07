package br.senai.logica;

import javax.swing.JOptionPane;

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

        //Mensagem Inicial
        JOptionPane.showMessageDialog(null, "Verificador de notas.\nInsira a quantidade de notas a serem verificadas.");

        //Criação do Array
        double[] notaAluno = new double[0];
        
        //Variável que determina a quantidade de notas
        int tamanhoArray;
        
        //Variável booleana para verificação do preenchimento do campo
        boolean verificaTamanho = false;

        do {

            try {

                //Variáveis
                tamanhoArray = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade de notas: "));

                if (tamanhoArray < 0) {
                    JOptionPane.showMessageDialog(null, "Insira um valor acima de 0");
                } else {
                    //Preenchimento do Array
                    notaAluno = new double[tamanhoArray];
                    verificaTamanho = true;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Informe somente números.");
            } 

        } while (!verificaTamanho);
                
        
        //Iteração para preenchimento
        for (int i = 0; i < notaAluno.length; i++) {
        boolean verificaNota = false;

            //Validação de Intervalo
            do {
                try {
                    notaAluno[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a " + (i + 1) + "° nota:\nA nota deve estar entre 0.0 e 10.0"));

                    if (notaAluno[i] < 0 || notaAluno[i] > 10) {
                        JOptionPane.showMessageDialog(null, "Nota fora do intervalo. Tente novamente.");
                    }else{
                        verificaNota = true;
                    }

                    

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Informe somente números.");
                }
            } while (!verificaNota);

        } 
           

            //Exibindo as notas registradas
            String mensagemFinal = "Dados Finais: "
                    + "\nQuantidade de notas inseridas: " + notaAluno.length
                    + "\nNotas informadas: ";

            for (int i = 0; i < notaAluno.length; i++) {
                mensagemFinal += notaAluno[i] + "  /";

            }

            JOptionPane.showMessageDialog(null, mensagemFinal);

        }
    }
