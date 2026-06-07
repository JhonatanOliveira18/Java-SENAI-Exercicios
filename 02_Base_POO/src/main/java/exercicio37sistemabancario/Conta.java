package exercicio37sistemabancario;

public class Conta {

    private double saldo = 0;
    private double saldoDevedor;
    private String titular;
    private int numero;

    public Conta(double saldo, String titular, int numero) {
        this.saldo = saldo;
        this.titular = titular;
        this.numero = numero;
    }

    public Conta() {
    }

    public Conta(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldoDevedor() {
        return saldoDevedor;
    }

    public void setSaldoDevedor(double saldoDevedor) {
        this.saldoDevedor = saldoDevedor;
    }

    public void saque(double valorSaque) {

        if (valorSaque <= 0) {
            System.out.println("Insira um valor maior que 0");
            
        }

        else if (valorSaque > saldo) {
            System.out.println("O valor de saque não pode ser maior que o saldo");
            
            
        }
        else{
            saldo -= valorSaque;
        }

        
    }

    public void solicitarEmprestimo(double valorEmprestimo) {

        if (saldoDevedor > 0) {
            System.out.println("Você precisa quitar seu empréstimo anterior");
            return;
        }

        if (valorEmprestimo <= 0) {
            System.out.println("Insira um valor maior que 0");
        }

        double valorAcrescimo = valorEmprestimo * 0.12;

        saldoDevedor = valorEmprestimo + valorAcrescimo;

        System.out.println("Empréstimo Aprovado");
    }

    public void quitarEmprestimo(double valor) {

        if (valor <= 0) {
            System.out.println("Valor inválido.");
            return;
        }

        if (valor > saldoDevedor) {
            System.out.println("Valor maior que a dívida.");
            return;
        }

        saldoDevedor -= valor;
    }

    public void depositar(double valor) {

        if (valor <= 0) {
            System.out.println("Insira um valor maior que 0");
            return;
        }

        saldo += valor;
    }

}
