package exercicio39javaquest;

public abstract class Personagem {
    
    private String nome;
    private int nivel;
    
    public Personagem(String nome){
        this.nome = nome;
    }

    public Personagem(){}
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    public void exibirFicha(){
        System.out.println("Herói: " + nome + " Nível " + nivel);
    }
    
    public abstract void atacar();
}
