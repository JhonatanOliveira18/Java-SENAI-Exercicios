package exercicio39javaquest;

public class ProgramadorJava extends Personagem{

    public ProgramadorJava(String nome){
        super(nome);
    }
    
    @Override
    public void atacar() {
        System.out.println("O ProgramadorJava " + getNome() + " desabilitou o sistema de defesa inimigo!");
    }
    
}
