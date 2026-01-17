package br.senai.logica;

import javax.swing.JOptionPane;

public class Exercicio29IMCTryCatch {

    /*
     Reescreva o programa do exercício 23 (cálculo de IMC), utilize a Classe JOptionPane para
    entrada e saída de dados, faça o tratamento das exceções utilizando try-catch, ao final do
    cálculo, oferecer ao usuário a possibilidade de um novo cálculo.
     */
    
    public static void main(String[] args) {
        //Variáveis
        double altura;
        double peso;
        double imc;
        String escolha = "S";
        String nome;

        //Mensagem inicial
        JOptionPane.showMessageDialog(null, "BEM VINDO AO CALCULADOR DE IMC.\n  Vamos começar!");

        //Coletando informações por meio do laço de repetição DO-WHILE
        do{
            try{
                nome = JOptionPane.showInputDialog(null, "Insira seu nome:");
                altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a sua altura em m:"));
                peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o seu peso em kg:"));
                
            }catch(NumberFormatException e){
                 JOptionPane.showMessageDialog(null, "Você não inseriu os dados corretamente.");
                 continue;
                 
            }catch (NullPointerException e){ // encerra o looping caso o usuario aperte cancelar
                JOptionPane.showMessageDialog(null, "Você apertou cancel e o programa morreu");
                break;
            }
            //Calculo do IMC
            imc = peso / (altura * altura);
            
            //Estrutura condicional para chegar o IMC 
            if(imc < 18.5){
                JOptionPane.showMessageDialog(null,"Você está abaixo do peso ideal!!!!");
            }
            else if(imc <= 24.9){
                JOptionPane.showMessageDialog(null,"Parabéns você está com peso normal");
            }
            else if(imc <= 29.9){
                JOptionPane.showMessageDialog(null,"Voce esta acima do seu peso!! Imenso.");
            }
            else if(imc <= 34.9){
                JOptionPane.showMessageDialog(null,"OBESIDADE GRAU 1");
            }
            else if(imc <= 39.9){
                JOptionPane.showMessageDialog(null,"OBESIDADE GRAU 2");
            }
            else{
                JOptionPane.showMessageDialog(null,"OBESIDAE GRAU 3");
            }

            escolha = JOptionPane.showInputDialog(null, "Deseja realizar outro calculo?\n[S]Sim\n[N]Encerra o programa.");

        }while (escolha.equalsIgnoreCase("S"));

        //Mensagem final
        JOptionPane.showMessageDialog(null, "FIM\nObrigado por usar o programa.");


    }
    
}
