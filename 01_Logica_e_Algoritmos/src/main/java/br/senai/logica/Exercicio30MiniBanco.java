package br.senai.logica;

import javax.swing.JOptionPane;

public class Exercicio30MiniBanco {

    /**
     Crie um minissistema bancário, com opções para saque, depósito, saldo e empréstimos,
    utilize try-catch e estruturas de repetição. A entrada e saída de dados pode ser implementada
    com a Classe Scanner ou JOptionPane.

    Regras de negócio:
    Permitir o saque somente se o valor for abaixo do saldo.

    Bloquear operações em que o usuário insira valores negativos.
    O valor para o empréstimo não deve ultrapassar o saldo², taxa de juros livre.
    Bloquear empréstimos caso a conta possua débitos em aberto.
     */
    
    public static void main(String[] args) {
       
        //Variáveis
        double saldo = 0;
        String escolha = "S";
        int operacao;

        do{
            try{
                //Tela inicial
                operacao = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor escolha a operação desejada:\n[1]Consultar saldo\n[2]Realizar deposito\n[3]Realizar saque\n[4]Emprestimo"));

                switch (operacao){
                    case 1 -> {
                        JOptionPane.showMessageDialog(null, "SALDO:\n" + saldo);
                    }
                    case 2 -> {
                        double deposito = Double.parseDouble(JOptionPane.showInputDialog(null, "DEPOSITO\nInsira o valor do deposito:"));
                        if(deposito > 0){
                            saldo += deposito;
                            JOptionPane.showMessageDialog(null, "SALDO ATUAL:\n" + saldo);   
                        }else {
                            JOptionPane.showMessageDialog(null, "ERRO: o valor precisa ser maior que zero.");
                        }    
                    }    
                    case 3 -> {
                            double saque = Double.parseDouble(JOptionPane.showInputDialog(null, "SAQUE:\nSaldo Disponivel para saque:" + saldo));
                            
                            if (saque <= 0){
                                JOptionPane.showMessageDialog(null, "ERRO: o valor precisa ser maior que zero e menor ou igual ao saldo disponível");
                                
                            }
                            else if (saldo >= saque){
                                saldo -= saque;
                                JOptionPane.showMessageDialog(null, "SALDO ATUAL:\n" + saldo);
                              
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "Saldo insuficiente.\nRealize um deposito para prosseguir.");
                                
                            }  
                        
                    }
                    case 4 -> {
                        if(saldo <= 0){ //Bloquear empréstimos caso a conta possua débitos em aberto.
                            JOptionPane.showMessageDialog(null, "Você possui débitos em aberto ou não possui saldo o suficiente");
                        }else{
                            double limiteEmprestimo = saldo * saldo; //O valor para o empréstimo não deve ultrapassar o saldo², taxa de juros livre.
                            double emprestimo = Double.parseDouble(JOptionPane.showInputDialog(null, "EMPRESTIMO:\nValor disponível de até:\n"+limiteEmprestimo
                            + "\nInsira o valor que deseja solicitar de empréstimo: "));
                            if(emprestimo > 0 && emprestimo <= limiteEmprestimo){
                                saldo += emprestimo;
                                JOptionPane.showMessageDialog(null, "Empréstimo de R$ " + emprestimo + " APROVADO.\nNovo saldo: R$ " + saldo);
                            }else {
                                JOptionPane.showMessageDialog(null, "ERRO: o valor precisa ser maior que zero e menor que o limite indicado.");
                            }
                        }
                        
                    }
                    default -> {
                    JOptionPane.showMessageDialog(null, "ERRO: Opção inválida. Escolha entre 1 e 4.");
                    }   
                }    
            
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"ERRO\nDado inserido incorretamente");        
     
            }catch(NullPointerException e2){
                JOptionPane.showMessageDialog(null,"ERRO\nPrograma interrompido. Valor nulo inserido.");
            }
            
            escolha = JOptionPane.showInputDialog(null, "Deseja realizar outra operação?\n[S]Sim\n[N]Não");

        }while (escolha.equalsIgnoreCase("S"));
        
        JOptionPane.showMessageDialog(null,"BANCO SENAI AGRADECE A PREFERÊNCIA");
    }
    
}
