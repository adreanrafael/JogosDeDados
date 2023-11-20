public class JogoGeneral extends JogoDados {
    private int[] valoresJogadas = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    public JogoGeneral(int nDados, String nomeJogo, float saldo, Dado[] dados) {
        super(nDados, nomeJogo, saldo, dados);
        // TODO Auto-generated constructor stub
    }

    public boolean validarJogada(int num) { // metodo que verifica se uma jogada pontua ou nao(true ou false) para o conjunto de dados encapsulado
        if (num <= 6 && num > 0) {  // verifica as jogadas de 1 a 6
            for (int i = 0; i < super.getDados().length; i++) {    // percorre os elementos vetor de dados e se o numero da jogada aparecer uma vez ja retorna verdadeiro

                if (super.getDados()[i].getSideUp() == num) {
                    return true;
                }
            }
            return false; // retorna faso caso o valor entre 1 e 6 passado como parametro nao esteja no vetor de dados
        } else if (num == 7) {  //verifica se uma jogada de trinca(7) pontua ou nao 
            int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0; // variaveis auxiliares contadoras inicializadas em zero
            // cada variavel contadora armazena a ocorrencia de uma valor de face do dado no vetor de dados
            for (int i = 0; i < super.getDados().length; i++) {    // percorre o vetor de dados
                // verificar cada elemento do vetor de dados e atribuir +1 para sua respectiva variavel contadora

                switch (super.getDados()[i].getSideUp()) {
                    case 1 ->
                        n1++;
                    case 2 ->
                        n2++;
                    case 3 ->
                        n3++;
                    case 4 ->
                        n4++;
                    case 5 ->
                        n5++;
                    case 6 ->
                        n6++;
                    default -> {
                    }
                }
                // verificar se a ocorrencia é maior ou igual a 3 e retorna verdadeiro

                if (n1 >= 3 || n2 >= 3 || n3 >= 3 || n4 >= 3 || n5 >= 3 || n6 >= 3) {
                    return true;
                }
            }
            return false;

        } else if (num == 8) { //verifica se uma jogada de quadra(8) pontua ou nao 
            // variaveis auxiliares contadoras inicializadas em zero
            int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0;

            for (int i = 0; i < super.getDados().length; i++) {
                switch (super.getDados()[i].getSideUp()) {
                    case 1 ->
                        n1++;
                    case 2 ->
                        n2++;
                    case 3 ->
                        n3++;
                    case 4 ->
                        n4++;
                    case 5 ->
                        n5++;
                    case 6 ->
                        n6++;
                    default -> {
                    }
                }
                // verificar se a ocorrencia de algum valor de face é maior ou igual a 4 e retorna verdadeiro
                if (n1 >= 4 || n2 >= 4 || n3 >= 4 || n4 >= 4 || n5 >= 4 || n6 >= 4) {
                    return true;
                }
            }
            return false;
        } else if (num == 9) { //verifica se uma jogada de fullrand(9) pontua ou nao 
            // variaveis auxiliares contadoras inicializadas em zero
            int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0;

            for (int i = 0; i < super.getDados().length; i++) {
                switch (super.getDados()[i].getSideUp()) {
                    case 1 ->
                        n1++;
                    case 2 ->
                        n2++;
                    case 3 ->
                        n3++;
                    case 4 ->
                        n4++;
                    case 5 ->
                        n5++;
                    case 6 ->
                        n6++;
                    default -> {
                    }

                }// verificar se a ocorrencia de algum valor de face é maior ou igual a 3 e se outro valor é meior ou igual a 2 e retorna verdadeiro
                if ((n1 == 3 || n2 == 3 || n3 == 3 || n4 == 3 || n5 == 3 || n6 == 3) && (n1 == 2 || n2 == 2 || n3 == 2 || n4 == 2 || n5 == 2 || n6 == 2)) {
                    return true;
                }
            }
            return false;
        } else if (num == 10) { //verifica se uma jogada de sequencia maior(10) pontua ou nao 
            // variaveis auxiliares contadoras inicializadas em zero
            int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0;

            for (int i = 0; i < super.getDados().length; i++) {
                switch (super.getDados()[i].getSideUp()) {
                    case 1 ->
                        n1++;
                    case 2 ->
                        n2++;
                    case 3 ->
                        n3++;
                    case 4 ->
                        n4++;
                    case 5 ->
                        n5++;
                    case 6 ->
                        n6++;
                    default -> {
                    }
                }
                // verificar as ocorrencias 
                if (n1 == 0 && n2 == 1 && n3 == 1 && n4 == 1 && n5 == 1 && n6 == 1) {
                    return true;
                }
            }
            return false; // retornar falso caso nao as ocorrencias  
        } else if (num == 11) { //verifica se uma jogada de sequencia menor(11) pontua ou nao 
            // variaveis auxiliares contadoras inicializadas em zero
            int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0;

            for (int i = 0; i < super.getDados().length; i++) {
                switch (super.getDados()[i].getSideUp()) {
                    case 1 ->
                        n1++;
                    case 2 ->
                        n2++;
                    case 3 ->
                        n3++;
                    case 4 ->
                        n4++;
                    case 5 ->
                        n5++;
                    case 6 ->
                        n6++;
                    default -> {
                    }
                }
                // verificar as ocorrencias 
                if (n1 == 1 && n2 == 1 && n3 == 1 && n4 == 1 && n5 == 1 && n6 == 0) {
                    return true;
                }
            }
            return false;
        } else if (num == 12) {
            // variaveis auxiliares contadoras inicializadas em zero
            int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0;

            for (int i = 0; i < super.getDados().length; i++) {
                switch (super.getDados()[i].getSideUp()) {
                    case 1 ->
                        n1++;
                    case 2 ->
                        n2++;
                    case 3 ->
                        n3++;
                    case 4 ->
                        n4++;
                    case 5 ->
                        n5++;
                    case 6 ->
                        n6++;
                    default -> {
                    }
                }
                // verificar as ocorrencias 
                if (n1 == 5 || n2 == 5 || n3 == 5 || n4 == 5 || n5 == 5 || n6 == 5) {
                    return true;
                }
            }
            return false;
        } else {
            return num == 13; // se for uma jogada aleatoria(13) qualquer combinacao pontua 
        }
    }


}
