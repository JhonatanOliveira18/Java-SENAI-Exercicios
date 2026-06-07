package exercicio36conversormoedas;

public class ConversorMoedas {
    
    //======= ATRIBUTOS ========
    
    public Double cotacaoDolar = 5.28; //Valor do dolar no momento em que o programa foi criado
    public Double cotacaoEuro = 6.12;  //Valor do euro no momento em que o programa foi criado
    
    // ====== MÉTODOS PARA CONVERSÃO ========
    
    // 1. Converte reais em doláres
    //Método que espera um retorno e solicita um parâmetro ao usuário, no caso o valor em reais a ser convertido
    public double converterDolar(double real){
        return real / cotacaoDolar;
    }
    
    // 2. Converte euros em doláres
    //Método que espera um retorno e solicita um parâmetro ao usuário, no caso o valor em reais a ser convertido
    public double converterEuro(double real){
        return real / cotacaoEuro;
    }
    
    
}
