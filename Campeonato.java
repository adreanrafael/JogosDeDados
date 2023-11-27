import java.util.Scanner;

public class Campeonato{

    private final int MAXJO = 10;
    private Jogador[] jogadores;
    private int sideJog;
    //private int jogada;

    public Campeonato(Jogador[] jogadores, int sideJog, int jogada) {
        this.jogadores = jogadores;
        this.sideJog = sideJog;
        //this.jogada = jogada;
    }

    public void incluirJogador() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome do jogador: ");
        String nome = teclado.nextLine();
        char tipo;

        do {
            System.out.println("Digite o tipo de jogador [H: humano ou M: Maquina]: ");
            tipo = teclado.nextLine().charAt(0);
            if (tipo != 'h' && tipo != 'H' && tipo != 'm' && tipo != 'M') {
                System.out.println("Tipo de jogador INVALIDO!");
            }
        } while (tipo != 'h' && tipo != 'H' && tipo != 'm' && tipo != 'M');

        if (sideJog < MAXJO && tipo == 'h') {
            jogadores[sideJog] = new Humano(nome, null, "kdhfhyd", "kshvbkh", "sufhufh", "dhgugy");
            this.sideJog++;
        }
    }

    public void excluirJogador() {
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < sideJog; i++) {
            System.out.println(jogadores[i].getNome());
        }

        System.out.println("Digite o nome do jogador que voce deseja exclir: ");
        String nome = teclado.nextLine();

        if (sideJog == 1) {
            if (jogadores[0].getNome().equals(nome)) {
                jogadores[sideJog - 1] = null;
                sideJog = 0;
            } else {
                System.out.println("Jogador nao encontrado, verifique se digitou o nome corretamente!");
            }
        } else {
            int pos = -1;
            for (int i = 0; i < sideJog; i++) {
                if (jogadores[i].getNome().equals(nome)) {
                    pos = i;
                }
            }
            if (pos != -1) {
                for (int j = pos; j < sideJog - 1; j++) {
                    jogadores[j] = jogadores[j + 1];
                }
                this.sideJog--;
            } else if (pos == -1) {
                System.out.println("Jogador nao encontrado, verifique se digitou corretamente!");
            }

        }
    }

    /*public void iniciarCampeonato() {

        if (sideJog > 0) {
            for (int i = 0; i < sideJog; i++) {
                jogadores[i].ZerarJogadas();
            }
        }
        if (sideJog == 0) {
            System.out.println("ERRO! Precisa de pelo menos um jogador para executar uma rodada!");
        } else {
            for (int k = 0; k < 13; k++) {
                for (int j = 0; j < sideJog; j++) {
                    if (jogadores[j].getTipoJogador() == 'h' || jogadores[j].getTipoJogador() == 'H') {
                        Scanner teclado = new Scanner(System.in);

                        System.out.println("Rolando dados para: " + jogadores[j].getNome() + "(" + jogadores[j].getTipoJogador() + ")");

                    } else {
                        System.out.println("Rolando dados para: " + jogadores[j].getNome());
                        System.out.printf("Valores obtidos: ");
                        jogadores[j].JogarDados();

                        for (int i = 0; i < jogadores[j].getJogo().getDados().length; i++) {

                            if (i < (jogadores[j].getJogo().getDados().length - 1)) {
                                System.out.printf("%d-", jogadores[j].getJogo().getDados()[i].getSideUp());
                            } else {
                                System.out.printf("%d ", jogadores[j].getJogo().getDados()[i].getSideUp());
                            }
                        }

                        System.out.println();
                        System.out.println("Para qual jogada voce quer marcar: [1 - 13] " + jogadores[j].getNome() + "?");
                        jogadores[j].mostrarJogadasExecutadas();
                        //jogada = teclado.nextInt();

                        jogadores[j].escolherJogada(jogada);
                    }
                }

            }
        }
    }*/
}