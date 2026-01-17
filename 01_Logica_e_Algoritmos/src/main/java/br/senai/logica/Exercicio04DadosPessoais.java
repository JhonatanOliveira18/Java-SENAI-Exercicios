package br.senai.logica;

/**
 Crie um programa em Java que declare variáveis para armazenar as informações de
nome, dia, mês e ano de nascimento de uma pessoa. Em seguida, o programa deve
exibir uma mensagem no terminal com os dados concatenados,
 */
public class Exercicio04DadosPessoais {

    public static void main(String[] args) {
        //Variáveis
        String nome = "Jhonatan";
        int diaNascimento = 24;
        String mesNascimento = "Maio";
        int anoNascimento = 2004;
        
        //Mensagem de exibição
        System.out.println("Nome: " + nome + "\n" + "Nascimento: Dia " + diaNascimento + " Mes: " + mesNascimento + " Ano: " + anoNascimento);
    }
    
}
