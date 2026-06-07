package exercicio40gestaofrota;

import java.util.ArrayList;
import java.util.List;

public class Motorista {

    // CLASSE INDEPENDENTE (Para Associação)
    private String nome;

    public Motorista(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

// CLASSE AGREGADORA (Para Agregação)
class Garagem {

    // AGREGAÇÃO: Uma lista de Veículos.
    // A Garagem "tem" veículos, mas os veículos existem mesmo se a garagem for demolida.
    private List<Veiculo> frota;

    public Garagem() {
        this.frota = new ArrayList<>();
    }

    public void estacionar(Veiculo v) {
        this.frota.add(v);
        System.out.println("Veículo " + v.getModelo() + " estacionado na garagem.");
    }

    public void listarFrota() {
        System.out.println("--- Relatório da Garagem ---");
        for (Veiculo v : frota) {
            System.out.println("- " + v.getModelo());
        }

    }
}
