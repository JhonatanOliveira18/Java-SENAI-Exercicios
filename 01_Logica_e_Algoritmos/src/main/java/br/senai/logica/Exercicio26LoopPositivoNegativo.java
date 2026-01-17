package br.senai.logica;

import javax.swing.JOptionPane;

public class Exercicio26LoopPositivoNegativo {

    /*
     Elabore um programa que leia um número inteiro e informe se ele é positivo ou
    negativo. O programa deve continuar lendo números enquanto o usuário não digitar o
    valor zero. Utilize um laço de repetição (como while ou do-while) para que o programa
    aceite múltiplos números até que o usuário decida parar digitando zero.
    
    Obs:A partir dessa aula foi introduzido o uso da classe da biblioteca Swing do Java.
    O JOptionPane permite que você crie facilmente caixas de diálogo.
     */
    
    public static void main(String[] args) {
        //Variável
        int num;
      
        //Mensagem de inicio
        JOptionPane.showMessageDialog(null,"SEJA BEM-VINDO AO PROGRAMA DE DIFERENCIACAO DE NUMEROS!!");
         
        //Entrada de dados dentro do laço de repetição
        do{
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor\n(Ao digitar 0 o programa é encerrado)"));//o uso do Integer.parseInt é para converter uma String em int
            if (num > 0){
                JOptionPane.showMessageDialog(null, "Este numero e positivo!");
                
            }else if (num < 0) {
                JOptionPane.showMessageDialog(null, "Este numero e negativo!");
            }
            else {
                JOptionPane.showMessageDialog(null, "Obrigado por usar o programa!");
                       
            }
        }while (num != 0);//garante que o loop continue enquanto o número digitado for diferente de zero.
        
        
    }
    
}
