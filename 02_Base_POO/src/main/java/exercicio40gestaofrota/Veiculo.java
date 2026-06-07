package exercicio40gestaofrota;

public abstract class Veiculo implements Rastreavel {

    // CLASSE ABSTRATA: Serve de modelo, não pode ser instanciada sozinha.
    // IMPLEMENTS: Assina o contrato da interface.
    protected String modelo;

    // COMPOSIÇÃO: O Motor é criado E existe apenas dentro do Veículo.
    // É uma relação de "Vida e Morte". Sem veículo, esse motor conceitualmente não tem uso.
    protected Motor motor;

    // ASSOCIAÇÃO: O Motorista existe fora daqui, mas é vinculado neste atributo.
    // É uma relação mais fraca que a Composição.
    protected Motorista motorista;

    public Veiculo(String modelo, String potenciaMotor) {
        this.modelo = modelo;

        // AQUI ACONTECE A COMPOSIÇÃO:
        // O veículo é responsável por criar o seu próprio motor.
        this.motor = new Motor(potenciaMotor);
    }

    // Método para criar o vínculo de ASSOCIAÇÃO com o motorista
    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    // Método abstrato: As filhas (Caminhão, Carro) SÃO OBRIGADAS a implementar.
    public abstract void ligar();

    public String getModelo() {
        return modelo;
    }

}
