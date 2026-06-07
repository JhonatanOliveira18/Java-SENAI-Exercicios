package exercicio36conversormoedas;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Main {

    /**
     * Desenvolva um programa que permita ao usuário converter valores entre
     * diferentes moedas, como Real (BRL), Dólar Americano (USD) e Euro (EUR). O
     * programa deve solicitar ao usuário a moeda de origem, a moeda de destino
     * e o valor a ser convertido. O programa deve exibir o valor convertido com
     * a devida formatação monetária, utilizando a classe DecimalFormat para
     * garantir a apresentação adequada dos valores. Lembre-se de tratar
     * possíveis erros, como entradas inválidas.
     */
    
    public static void main(String[] args) {
        
        //Mensagem inicial
        JOptionPane.showMessageDialog(null, "BEM VINDO AO CONVERSOR DE MOEDAS !");
        
        //Instanciando um novo objeto da classe ConversorMoedas
        ConversorMoedas conversor = new ConversorMoedas();
        
        //Instanciando o DecimalFormat
        DecimalFormat df = new DecimalFormat("R$ #,##0.00");
        
        //Coletando o valor em reais que o usuário deseja converter
        double valorReais = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor em reais que deseja converter em doláres e em euros: "));
        
        //Chamando métodos de conversão
        double dolarConvertido = conversor.converterDolar(valorReais);
        double euroConvertido = conversor.converterEuro(valorReais);
        
        //Exibindo resultado
        String resultado = "Valor em reais: " + df.format(valorReais) 
                + "\nValor convetido em dólar: " + df.format(dolarConvertido)
                + "\nValor convertido em euro: " + df. format(euroConvertido);
        
        JOptionPane.showMessageDialog(null, "\t==== RESUMO ====\n" + resultado);
    }

}
