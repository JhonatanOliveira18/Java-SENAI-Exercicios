package exercicio39javaquest;

public class Guerreiro extends Personagem {

    public Guerreiro(String nome){
        super(nome);
    }
    
    @Override
    public void atacar() {
        System.out.println("O Guerreiro " + getNome() + " desferiu um golpe poderoso com sua Espada!");
    }
    
    
}
