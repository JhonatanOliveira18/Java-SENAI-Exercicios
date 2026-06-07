package exercicio40gestaofrota;

public class SistemaFrota {

    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTÃO DE FROTAS ===\n");

        // 1. HERANÇA e COMPOSIÇÃO
        // Ao criar o Caminhão, o Motor é criado automaticamente dentro dele (Composição).
        Caminhao scania = new Caminhao("Scania 113H", "360 cv", 16000);
        Caminhao ford = new Caminhao("Ford F-600", "161 cv", 6500);

        // 2. ASSOCIAÇÃO
        // Criamos o motorista separado (ele existe independente do caminhão).
        Motorista mot1 = new Motorista("Mônica");
        Motorista mot2 = new Motorista("Cebolinha");

        // Agora fazemos o vínculo. O Caminhão passa a "conhecer" o motorista.
        scania.setMotorista(mot1);

        scania.ligar();          // Usa o Motor (Composição)
        scania.exibirMotorista(); // Usa o Motorista (Associação)
        scania.enviarCoordenadasGPS(); // Usa a Interface

        System.out.println("\n--------------------------------");

        // 3. DEPENDÊNCIA
        // A bomba existe. O caminhão existe. Eles interagem apenas agora.
        BombaDeCombustivel bombaPosto = new BombaDeCombustivel();
        bombaPosto.abastecer(scania, 500); // Scania é passado temporariamente

        System.out.println("--------------------------------\n");

        // 4. AGREGAÇÃO
        // A Garagem agrupa os veículos.
        Garagem garagemCentral = new Garagem();

        System.out.println(">> Fim do expediente, guardando a frota...");
        garagemCentral.estacionar(scania);
        garagemCentral.estacionar(ford); // Ford sem motorista, sem problemas.

        System.out.println("");
        garagemCentral.listarFrota();
    }

}
