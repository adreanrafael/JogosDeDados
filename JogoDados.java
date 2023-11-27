public abstract class JogoDados {
    
    private int nDados;
    private String nomeJogo;
    private float saldo;
    private Dado[] dados;

    public JogoDados(int nDados, String nomeJogo, float saldo, Dado[] dados) {
        this.nDados = nDados;
        this.nomeJogo = nomeJogo;
        this.saldo = saldo;
        this.dados = dados;
    }

    public int getnDados() {
        return nDados;
    }

    public void setnDados(int nDados) {
        this.nDados = nDados;
    }

    public String getNomeJogo() {
        return nomeJogo;
    }

    public void setNomeJogo(String nomeJogo) {
        this.nomeJogo = nomeJogo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Dado[] getDados(){
        return dados;
    }

    public void rolarDados() {  // metodo que rola os cinco dados
        for (var i = 0; i < dados.length; i++) {
            dados[i].roll();    // atribui um valor pseudo randomico como face voutada para cima de cada dado
        }

        for (int i = 0; i < dados.length; i++) {    //esse trecho ordena o vetor que contem os valores das faces voltadas para cima pelo metodo bolha
            for (int j = 0; j < i; j++) {
                if (dados[j].getSideUp() > dados[i].getSideUp()) {

                    int aux = dados[j].getSideUp();
                    dados[j].setSideUp(dados[i].getSideUp());
                    dados[i].setSideUp(aux);
                }
            }
        }
    }

    
}
