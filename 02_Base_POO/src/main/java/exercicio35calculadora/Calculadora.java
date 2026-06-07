package exercicio35calculadora;

import javax.swing.JOptionPane;

public class Calculadora {

    /**
     * Crie um programa que leia dois números inteiros fornecidos pelo usuário e
     * permita que ele escolha qual operação matemática deseja realizar entre
     * soma, subtração, multiplicação, divisão, potência e raiz quadrada. O
     * programa deve realizar a operação escolhida e exibir o resultado.
     */
    public static void main(String[] args) {

        

        //Mensagem Inicial
        JOptionPane.showMessageDialog(null, "Calculadora Simples usando fundamentos de POO");

        //Variáveis
        String escolha = "S";

        //Estrutura de repetição
        do {
            try {
                
                //Instanciando um novo objeto da classe Operadores
                Operadores oper = new Operadores();
                
                //Solicitando ao usuário que insira a operação desejada
                int operacao = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a operacao desejada:"
                        + "\n[1]Soma"
                        + "\n[2]Subtracao"
                        + "\n[3]Multiplicacao"
                        + "\n[4]Divisao"
                        + "\n[5]Raiz"
                        + "\n[6]Potencia"));

                //Estrutura condicional para verificar a operacao desejada
                switch (operacao) {
                    case 1 -> {
                        //Solicitando os números a serem calculados
                        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um valor: "));
                        int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um segundo valor: "));
                        JOptionPane.showMessageDialog(null, "Resultado da soma: " + oper.somar(n1, n2));
                    }
                    case 2 -> {
                        //Solicitando os números a serem calculados
                        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um valor: "));
                        int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um segundo valor: "));
                        JOptionPane.showMessageDialog(null, "Resultado da subtracao: " + oper.subtrair(n1, n2));
                    }
                    case 3 -> {
                        //Solicitando os números a serem calculados
                        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um valor: "));
                        int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um segundo valor: "));
                        JOptionPane.showMessageDialog(null, "Resultado da multiplicacao: " + oper.multiplicar(n1, n2));
                    }
                    case 4 -> {
                        //Solicitando os números a serem calculados
                        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um valor: "));
                        int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um segundo valor: "));
                        JOptionPane.showMessageDialog(null, "Resultado da divisão: " + oper.dividir(n1, n2));
                    }
                    case 5 -> {
                        //Solicitando os números a serem calculados
                        double n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um valor: "));
                        JOptionPane.showMessageDialog(null, String.format("Raiz quadrada do valor %.2f: %.2f", n1, oper.radiciacao(n1)));
                    }
                    case 6 -> {
                        double n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor da base: "));
                        double n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor do expoente: "));
                        double resultado = Math.pow(n1, 2);
                        JOptionPane.showMessageDialog(null, "Resultado da potenciação: " + resultado);
                    }
                    default -> {
                        JOptionPane.showMessageDialog(null, "ERRO: Operacao inexistente");
                    }
                }
                //Verificando se o usuario deseja repetir programa
                String verificaEscolha = JOptionPane.showInputDialog(null, "Deseja repetir o programa?"
                        + "\n[S]Sim"
                        + "\n[N]Não");
                if (verificaEscolha == null || !verificaEscolha.equalsIgnoreCase("S")) { //Evitando que um valor nulo seja atribuido a variavel escolha
                    escolha = "N";
                } else {
                    escolha = verificaEscolha;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "ERRO: Valor inserido incorretamente.");
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Operacao cancelada pelo usuario.");
            }

        } while (escolha.equalsIgnoreCase("S"));

        //Mensagem final
        JOptionPane.showMessageDialog(null, "FIM!");

    }

}
