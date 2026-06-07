package exercicio39javaquest;

public class JogoRPG {

    public static void main(String[] args) {
        
        Guerreiro g = new Guerreiro("Jhonatan");
        Mago m = new Mago("Lucas");
        ProgramadorJava pj = new ProgramadorJava("Pietro");
        
        g.exibirFicha();
        g.atacar();
        
        m.exibirFicha();
        m.atacar();
        
        pj.exibirFicha();
        pj.atacar();
    }
    
}
