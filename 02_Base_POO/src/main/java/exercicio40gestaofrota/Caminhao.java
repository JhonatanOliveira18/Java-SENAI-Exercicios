package exercicio40gestaofrota;

public class Caminhao extends Veiculo {

    // HERANÇA: Caminhão É UM Veículo
    private double capacidadeCarga;

    public Caminhao(String modelo, String potenciaMotor, double capacidadeCarga) {
        // SUPER: Chama o construtor da classe pai (Veiculo) para criar o Motor e definir modelo
        super(modelo, potenciaMotor);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void ligar() {
        // Acessando o objeto 'motor' que foi herdado
        System.out.println("Caminhão " + this.modelo + " ligado! Motor "
                + this.motor.getPotencia() + " roncando.");
    }

    @Override
    public void enviarCoordenadasGPS() {
        System.out.println("GPS: Caminhão localizado na Rodovia BR-101.");
    }

    // Exibe quem está dirigindo (Associação)
    public void exibirMotorista() {
        if (this.motorista != null) {
            System.out.println("Motorista atual: " + this.motorista.getNome());
        } else {
            System.out.println("Caminhão está sem motorista no momento.");
        }
    }

}
