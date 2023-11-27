public class JogoAzar extends JogoDados{

    private float valoAposta;
    
    public JogoAzar(int nDados, String nomeJogo, float saldo, Dado[] dados, float vaposta) {
        super(nDados, nomeJogo, saldo, dados);
        valoAposta = vaposta;
    }

    public void executarRegraDoJogo(){
        
    }

}