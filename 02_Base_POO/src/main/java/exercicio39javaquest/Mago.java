package exercicio39javaquest;

public class Mago extends Personagem {

    public Mago(String nome){
        super(nome);
    }
    
    @Override
    public void atacar() {
        System.out.println("O Mago " + getNome() + " lançou uma Bola de Fogo suprema!");
    }
    
}
