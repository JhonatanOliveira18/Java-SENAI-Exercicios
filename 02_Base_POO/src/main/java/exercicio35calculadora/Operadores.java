package exercicio35calculadora;

import javax.swing.JOptionPane;

public class Operadores {
    
    //Atributos
    
    private int n1;
    private int n2;
    
    //Getters e Setters

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
    
    // ======= Método de cada Operação =========
    
    public int somar(int n1, int n2){
        int soma = n1 + n2;
        return soma;
    }
    
    public int subtrair(int n1, int n2){
        int subtracao = n1 - n2;
        return subtracao;
    }
    
    public int multiplicar(int n1, int n2){
        int multiplicacao = n1 * n2;
        return multiplicacao;
    }
    
    public int dividir(int n1, int n2) {
        if (n1 != 0 && n2 != 0) {//Evitando divisoes por 0
            return n1 / n2;
        } else {
           JOptionPane.showMessageDialog(null, "Não é possível a divisão por 0");
           return 0;
        }
        
    }
    
    public double potencia(double n1, double n2){
        return Math.pow(n1, n2);
    }
    
    public double radiciacao(double n1){
        return Math.sqrt(n1);
    }
    
    
    
}
