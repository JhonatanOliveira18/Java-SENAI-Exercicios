
package br.senai.logica;

/**
 Crie um programa em Java que defina 2 constantes, uma para o comprimento e
outra para a largura de um retângulo. Utilize essas constantes para calcular e exibir no
terminal as seguintes informações:
1. Área do retângulo (comprimento × largura)
2. Perímetro do retângulo (soma dos 4 lados)
 */

public class Exercicio03CalculoRetangulo {

    public static void main(String[] args) {
        // Declarando constantes
        final int COMPRIMENTO = 400;
        final int LARGURA = 100;   
        
       
        int area = COMPRIMENTO * LARGURA;
        int perimetro = 2 * (COMPRIMENTO + LARGURA);
        
        //Exibindo resultado
        System.out.println("Calculo de area: " + area);
        System.out.println("Calculo do perimetro: " + perimetro);
    }
    
}
