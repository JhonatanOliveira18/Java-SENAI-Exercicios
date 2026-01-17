package br.senai.logica;

import javax.swing.JOptionPane;

public class Exercicio28ReescritaLoops {

    /**
     Escolha 3 programas criados em exercícios anteriores, em cada um deles insira
    uma estrutura de repetição diferente, altere as entradas e saídas de dados substituindo a
    Classe Scanner para a Classe JOptionPane.
    Exemplos:
    Exercício xx – for
    Exercício xx – while
    Exercício xx – do-while
    */
    
    public static void main(String[] args) {
        //============================== EXERCICIO 05 - USANDO FOR ===================================
        //Variáveis
        double nota = 0;
        double media;

        //Mensagem inicial
        JOptionPane.showMessageDialog(null, "BEM VINDO AO CALCULADOR DE MEDIA!\nEXERCICIO 05 usando FOR.");


        //Estrutura de repetição FOR para coletar 4 notas
        for(int i = 0; i < 4; i++){
            nota += Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a nota número "+ (i + 1) + ":"));
        }
        //Calculo da média
        media = nota / 4;

        //Exibindo média
        JOptionPane.showMessageDialog(null, "Sua média é: " + media);

        //Mensagem final
        JOptionPane.showMessageDialog(null, "FIM EXERCICIO 05");

        //=====================================================================================================================
        //============================== EXERCICIO 06 - USANDO DO-WHILE ===================================

        /*Crie um programa em Java que declare variáveis para armazenar as seguintes
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

        //Inicio

        //Variáveis
        String codigo;
        String nome;
        double valorCusto;
        String escolha = "S";

        //Mensagem de inicio
        JOptionPane.showMessageDialog(null,"PROGRAMA DE INFORMAÇÕES DE UM PRODUTO\nEXERCICIO 06");

        do{
            //Coletando informações de um produto
            codigo     = JOptionPane.showInputDialog(null, "Insira o código do produto:");
            nome       = JOptionPane.showInputDialog(null, "Insira o nome do produto:");
            valorCusto = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor de custo do produto:"));

            //Calculo de valor de venda do produto com acréscimo de 15% sobre o valor de custo
            double valorVenda = valorCusto * 1.15;

            //Exibindo dados do produto informado
            String exibirDados = "======Resumo de informações do: " + nome + "=======\n"
                             + "Código: ["+codigo+"]\n"
                             + "Valor de Custo: ["+valorCusto+"]\n"
                             +  "Valor de Venda: ["+valorVenda+"]";

            //Exibindo dados do produto informado
            JOptionPane.showMessageDialog(null, exibirDados);

            //Estrutura para questionar se o titular deseja repetir o programa
            escolha = JOptionPane.showInputDialog(null, "Deseja adicionar outro produto?"
                    + "\n[S]Sim"
                    + "\n[N]Não");

        }while(escolha.equalsIgnoreCase("s"));

        JOptionPane.showMessageDialog(null, "FIM DO EXERCICIO 06");
        //=============================================================================================================================
        //========================= EXERCICIO 10 - USANDO WHILE =============================
        
        /*
         Crie um programa em Java que solicite ao usuário a entrada de 5 números. Após a
        entrada de todos os números, o programa deve calcular e exibir a média desses valores.
        */
        
        //Inicio
        
        //Variáveis
        int qntNumeros = 0;//Irá armazenar a quantidade de números que o titular deseja somar a fim de ver a média
        double numeros = 0; //Irá armazenar e ir somando os números inseridos
        int i = 0;
        
        //Mensagem de inicio
        JOptionPane.showMessageDialog(null, "BEM VINDO AO CALCULADOR DE MÉDIA\nEXERCICIO 10");
        
        //Coletando dados
        qntNumeros = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade de números que você pretende calcular a média:"));
        
        while(i < qntNumeros){
            //Coletando os números
            numeros += Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o " +(i + 1)+ " número a ser incluído no cálculo de média:" ));
            i++; //Incrementando o contador 
        }  
        //Calculo da média
        double mediaNumeros = (double)numeros / qntNumeros;
        
        JOptionPane.showMessageDialog(null,"Sua média é: " + mediaNumeros);
    }
    
}
