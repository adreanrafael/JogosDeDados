public class JogoGeneral extends JogoDados {
    private int[] valoresJogadas;
    private int somaDados;

    public JogoGeneral(int nDados, String nomeJogo, float saldo, Dado[] dados, int[] vjogadas) {
        super(nDados, nomeJogo, saldo, dados);
        valoresJogadas = vjogadas;
        somaDados = 0;
    }

    public int[] getValoresJogadas() {
        return valoresJogadas;
    }

    public void setValoresJogadas(int[] valoresJogadas) {
        this.valoresJogadas = valoresJogadas;
    }

    public int setSomaDados() {    // metodo que retorna a soma dos valores das faces voltadas para cima dos cinco dados 
        somaDados = 0;  // zerar a cada jogada
        for (int i = 0; i < super.getDados().length; i++) {
            somaDados += super.getDados()[i].getSideUp();
        }
        return somaDados;
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

    public void pontuarJogada(int j) { // metodo que recebe uma variavel inteira como parametro e atribui uma pontuacao no vetor jogadas para respectiva jogada
        if (j >= 1 && j <= 6) { // pontua jogadas de 1 a 6 no vetor de jogadas
            if (validarJogada(j) == true) { // verificar se a jodada e valida
                int cont = 0; // variavael contaroa auxiliar para armazenar ocorrencia

                for (int i = 0; i < super.getDados().length; i++) {
                    if (super.getDados()[i].getSideUp() == j) {
                        cont++;     // contar occorrencia do valor ecolhido
                    }
                }
                if (valoresJogadas[j - 1] == -1) {     // verificar se a jogada ainda nao foi realizada
                    valoresJogadas[j - 1] = cont * j;  // caso nao foi realizada ainda, atribuir a pontuacao
                } else {
                    System.out.println("Jogada ja realizada!"); // caso ja foi realizada imprime uma menssagem e nao atribuir pontuacao alguma
                }
            } else { // caso jogada nao valida 
                if (valoresJogadas[j - 1] == -1) {     //verificar se a jogada ja foi realizada
                    valoresJogadas[j - 1] = 0;         // caso nao foi realizada atribuir pontuacao zero
                } else {
                    System.out.println("Jogada ja realizada!");  // caso ja foi realizada imprimir uma menssagem e nao pontua
                }
            }

        } else if (j == 7) {    // pontua jogada de trinca(7) no vetor de jogadas
            if (validarJogada(j) == true) { // verificar se a jodada e valida
                if (valoresJogadas[j - 1] == -1) {     // verificar se a jogada ainda nao foi realizada
                    valoresJogadas[j - 1] = this.setSomaDados();  // caso nao foi realizada ainda, atribuir a respectiva pontuacao
                } else { // caso ja foi realizada imprime uma menssagem e nao atribui pontuacao alguma
                    System.out.println("Jogada já realizada!");
                }
            } else { // caso jogada nao valida 
                if (valoresJogadas[j - 1] == -1) {  // verificar se a jogada ainda nao foi realizada
                    valoresJogadas[j - 1] = 0;     // atribuir pontuacao zero
                } else {    // caso jogada ja realizada, imprimir mensagem e nao pontuar
                    System.out.println("Jogada já realizada!");
                }
            }

            // repete o mesmo procedimento do caso acima para as outras jogadas
        } else if (j == 8) {
            if (validarJogada(j) == true) {
                if (valoresJogadas[j - 1] == -1) {
                    valoresJogadas[j - 1] = this.setSomaDados();
                } else {
                    System.out.println("Jogada já realizada!");
                }
            } else {
                if (valoresJogadas[j - 1] == -1) {
                    valoresJogadas[j - 1] = 0;
                } else {
                    System.out.println("Jogada já realizada!");
                }
            }
        } else if (j == 9) {
            if (validarJogada(j) == true) {
                if (valoresJogadas[j - 1] == -1) {
                    valoresJogadas[j - 1] = 25;
                } else {
                    System.out.println("Jogada já realizada!");
                }
            } else {
                if (valoresJogadas[j - 1] == -1) {
                    valoresJogadas[j - 1] = 0;
                } else {
                    System.out.println("Jogada já realizada!");
                }
            }
        } else if (j == 10) {
            if (validarJogada(j) == true) {
                if (valoresJogadas[j - 1] == -1) {
                    valoresJogadas[j - 1] = 30;
                } else {
                    System.out.println("Jogada já realizada!");
                }
            } else {
                if (valoresJogadas[j - 1] == -1) {
                    valoresJogadas[j - 1] = 0;
                } else {
                    System.out.println("Jogada já realizada!");
                }
            }
        } else if (j == 11) {
            if (validarJogada(j) == true) {
                if (valoresJogadas[j - 1] == -1) {
                    valoresJogadas[j - 1] = 40;
                } else {
                    System.out.println("Jogada já realizada!");
                }
            } else {
                if (valoresJogadas[j - 1] == -1) {
                    valoresJogadas[j - 1] = 0;
                } else {
                    System.out.println("Jogada já realizada!");
                }
            }
        } else if (j == 12) {
            if (validarJogada(j) == true) {
                if (valoresJogadas[j - 1] == -1) {
                    valoresJogadas[j - 1] = 50;
                } else {
                    System.out.println("Jogada já realizada!");
                }
            } else {
                if (valoresJogadas[j - 1] == -1) {
                    valoresJogadas[j - 1] = 0;
                } else {
                    System.out.println("Jogada já realizada!");
                }
            }
        } else if (j == 13) {
            if (validarJogada(j) == true) {
                if (valoresJogadas[j - 1] == -1) {
                    valoresJogadas[j - 1] = this.setSomaDados();
                } else {
                    System.out.println("Jogada já realizada!");
                }
            } else {
                if (valoresJogadas[j - 1] == -1) {
                    valoresJogadas[j - 1] = 0;
                } else {
                    System.out.println("Jogada já realizada!");
                }
            }
        }
    }

}
