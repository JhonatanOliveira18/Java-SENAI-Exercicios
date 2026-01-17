package br.senai.logica;

import javax.swing.JOptionPane;

public class Exercicio31MiniCalculadoraMath {

    /*
     Crie uma minicalculadora onde o usuário escolhe uma operação entre soma, subtração,
    multiplicação e divisão, inclua também as operações matemáticas utilizando métodos da
    Classe Math.
    */
    
    public static void main(String[] args) {

   //Variáveis
   double num1 = 0;
   double num2 = 0;
   String escolha = "S";

   //Mensagem de inicio
   JOptionPane.showMessageDialog(null,"CALCULADORA COM MATH!");

   //Estrutura de repetição
   do{
       try{
           //Solicitando os números a serem calculados
           num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira um valor: "));
           num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira um segundo valor: "));


           //Solicitando ao usuário que insira a operação desejada
           int operacao = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a operacao desejada:"
                   + "\n[1]Soma"
                   + "\n[2]Subtracao"
                   + "\n[3]Multiplicacao"
                   + "\n[4]Divisao"
                   + "\n[5]Raiz"
                   + "\n[6]Potencia"));

           //Estrutura condicional para verificar a operacao desejada
           switch(operacao){
               case 1 ->{
                   double resultado = num1 + num2;
                   JOptionPane.showMessageDialog(null, String.format("Resultado da soma: %.2f",resultado));
               }
               case 2 ->{
                   double resultado = num1 - num2;
                   JOptionPane.showMessageDialog(null, String.format("Resultado da subtracao: %.2f",resultado));
               }
               case 3 ->{
                   double resultado = num1 * num2;
                   JOptionPane.showMessageDialog(null, String.format("Resultado da multiplicacao: %.2f",resultado));
               }
               case 4 ->{
                   if(num1 != 0 && num2 != 0){//Evitando divisoes por 0
                      double resultado = num1 / num2;
                      JOptionPane.showMessageDialog(null, String.format("Resultado da divisao: %.2f",resultado));
                   }else {
                      JOptionPane.showMessageDialog(null, "Insira um valor diferente de zero!");
                   }
               }
               case 5 ->{
                   double resultado = Math.sqrt(num1);
                   double resultado2 = Math.sqrt(num2);
                   JOptionPane.showMessageDialog(null, String.format("Raiz quadrada do valor %.2f: %.2f"
                                                                 + "\nRaiz quadrada do valor %.2f: %.2f" ,num1,resultado,num2,resultado2));
               }
               case 6 ->{
                   double resultado = Math.pow(num1, num2);
                   JOptionPane.showMessageDialog(null, "Potencia: "+resultado);
               }
               default ->{
                   JOptionPane.showMessageDialog(null, "ERRO: Operacao inexistente");
               }
           }
           //Verificando se o usuario deseja repetir programa
            String verificaEscolha = JOptionPane.showInputDialog(null, "Deseja repetir o programa?"
                    + "\n[S]Sim"
                    + "\n[N]Não");
            if(verificaEscolha == null || !verificaEscolha.equals("S")){ //Evitando que um valor nulo seja atribuido a variavel escolha
                escolha = "N";
            }else{
                escolha = verificaEscolha;
            }
       }
       catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "ERRO: Valor inserido incorretamente.");
       }
        catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Operacao cancelada pelo usuario.");
       }

   }while(escolha.equalsIgnoreCase("S"));

   //Mensagem final
   JOptionPane.showMessageDialog(null,"FIM!");


}
    
}
