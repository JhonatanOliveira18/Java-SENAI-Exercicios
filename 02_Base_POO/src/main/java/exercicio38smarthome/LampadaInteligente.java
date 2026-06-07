package exercicio38smarthome;

public class LampadaInteligente implements DispositivoEletronico {

    @Override
    public void ligar() {
        System.out.println("Lâmpada conectada! Ajustando brilho para 100% e cor branca.");
    }
}
