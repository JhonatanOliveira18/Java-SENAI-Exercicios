package br.senai.logica;

/**
 Crie um programa em Java que declare variáveis para armazenar as seguintes
informações sobre um produto: código, nome e valor de custo. Em seguida, o programa
deve calcular o valor de venda do produto, aplicando um acréscimo de 15% sobre o
valor de custo. Por fim, o programa deve exibir no terminal as informações do produto,
incluindo o valor de venda calculado.
A saída no terminal deve ser algo semelhante a:
Código: [código]
Nome: [nome do produto]
Valor de Custo: [valor de custo]
Valor de Venda: [valor de venda]
 */

public class Exercicio06CalculoVenda {

    public static void main(String[] args) {
        //Variáveis
        String codigo = "45645656d";
        String nome = "Jaime";
        double valorCusto = 50;
        double valorVenda = valorCusto * 1.15;
        
        //Exibindo informações
        System.out.println("Codigo: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Valor Custo: " + valorCusto);
        System.out.println("Valor Venda: " + valorVenda);
    }
    
}
