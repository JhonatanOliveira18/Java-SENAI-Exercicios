package exercicio40gestaofrota;

public class Carro extends Veiculo {

    private String tipoCambio;

    public Carro(String modelo, String potenciaMotor, String tipoCambio) {
        super(modelo, potenciaMotor);
        this.tipoCambio = tipoCambio;
    }

    public String getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(String tipoCambio) {
        this.tipoCambio = tipoCambio;
    }
    
    
   
    @Override
    public void ligar() {
       
        System.out.println("O Ar-Condicionado também ligou.");
        
    }

    @Override
    public void enviarCoordenadasGPS() {
        System.out.println("GPS usando 4G.");
    }
    
}
