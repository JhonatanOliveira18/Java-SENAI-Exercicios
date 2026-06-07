package exercicio40gestaofrota;

public class Moto extends Veiculo {

    private int cilindradas;
    
    public Moto(String modelo, String potenciaMotor, int cilindradas) {
        super(modelo, potenciaMotor);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
    
    @Override
    public void ligar() {
        System.out.println("BRUM BRUM BRUUUUM!");
    }

    @Override
    public void enviarCoordenadasGPS() {
        System.out.println("Localização imprecisa devido velocidade");
    }
    
}
