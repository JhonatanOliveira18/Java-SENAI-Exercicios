package br.senai.logica;

import javax.swing.JOptionPane;

public class Exercicio33Hipotenusa {

    /*
 Desenvolva um programa que calcule a hipotenusa de um triângulo retângulo utilizando o
Teorema de Pitágoras. O programa deve solicitar ao usuário que informe os valores dos
catetos A e B e, em seguida, calcular a hipotenusa.
Os cálculos devem ser realizados utilizando os métodos da Classe Math.
 */

public static void main(String[] args) {
    //Variaveis
    double catetoA;
    double catetoB;
    double hipotenusa;

    //Mensagem inicial
    JOptionPane.showMessageDialog(null, "CALCULADOR DE HIPOTENUSA");

    //Coletando dados
    catetoA = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor do cateto A: "));
    catetoB = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor do cateto B: "));

    //Calculo
    hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));//Não foi mencionado nas aulas o Math.hypot

    //Exibindo resultado
    JOptionPane.showMessageDialog(null, String.format("O valor da hipotenusa: %.2f",hipotenusa));


}

    
}
