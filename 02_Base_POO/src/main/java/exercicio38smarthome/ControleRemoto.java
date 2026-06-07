package exercicio38smarthome;

public class ControleRemoto {
    
    public static void main(String[] args) {
        
        LampadaInteligente li = new LampadaInteligente();
        SmartTv st = new SmartTv();
        CaixaDeSom cs = new CaixaDeSom();
        
        li.ligar();
        st.ligar();
        cs.ligar();
        
    }
}
