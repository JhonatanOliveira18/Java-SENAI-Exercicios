package br.senai.logica;

/**
 * EXERCÍCIO 01: CÁLCULO DE CORRENTE ELÉTRICA (A = P/V)
 * * Objetivo: Calcular a corrente (A) necessária para cada um dos três chuveiros, 
 * baseando-se na potência (W) e tensão (V) fornecidas (A = P / V). O resultado 
 * define o valor em amperes dos disjuntores de proteção.
 * * Dados:
 * - Chuveiro 01: 8500 W / 220 V
 * - Chuveiro 02: 5000 W / 220 V
 * - Chuveiro 03: 7500 W / 220 V
 */

public class Exercicio01CalculoCorrente {

    public static void main(String[] args) {
        System.out.println("Rede eletrica de chuveiros");
        
        //Declarando variaveis
        /* P é a potência em watts (W), V é a tensão em volts (V),  A é a corrente em amperes (A)*/
        
        //Fórmula para o cálculo
        //P = V × A
        
        //Declarando a potencia de cada chuveiro
        double chuveiro1P = 8500;
        double chuveiro2P = 5000;
        double chuveiro3P = 7500;
        
        //Declarando a voltagem
        double v = 220;
        
        // Cálculo dos amperes
        double a1 = chuveiro1P / v;
        double a2 = chuveiro2P / v;
        double a3 = chuveiro3P / v;
        
        //Exibindo resultados
        System.out.println("Para um chuveiro de 8500 watts, disjuntor de " + a1 + " amperes");
        System.out.println("Para um chuveiro de 5000 watts, disjuntor de " + a2 + " amperes");
        System.out.println("Para um chuveiro de 7500 watts, disjuntor de " + a3 + " amperes");
    }
}
