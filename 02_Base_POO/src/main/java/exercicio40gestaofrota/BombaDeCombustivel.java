package exercicio40gestaofrota;

public class BombaDeCombustivel {
    // DEPENDÊNCIA: Observe que o Veículo entra como PARÂMETRO.
    // A Bomba não "tem" um veículo. Ela só interage com ele por alguns segundos.
    public void abastecer(Veiculo v, double litros) {
        System.out.println("Abastecendo " + v.getModelo() + " com " + litros + " litros de Diesel.");
        // A bomba usa o veículo e depois esquece dele.
    }
}
