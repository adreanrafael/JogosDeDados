public abstract class Jogador {

    private String nome;
    private JogoDados[] jogoD;

    public Jogador(String nome, JogoDados[] jogoD) {
        this.nome = nome;
        this.jogoD = jogoD;
    }  
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public JogoDados[] getJogoD() {
        return jogoD;
    }

    public void setJogoD(JogoDados[] jogoD) {
        this.jogoD = jogoD;
    }

    public void JogarDados() {
        for(int i=0; i<jogoD.length; i++){
            this.jogoD[i].rolarDados();
        }  
    }
}
