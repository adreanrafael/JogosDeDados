import java.util.Scanner;

public class UsaCampeonato {

    public static void main(String[] args) {
        Campeonato camp = new Campeonato(null, 0, 0);
        char op;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("  \n..:: Menu interativo ::..");
            System.out.println("(a) Incluir jogador. ");
            System.out.println("(b) Remover jogador (pelo nome). ");
            System.out.println("(c) Executar rodada(s) de aposta(s)  ");
            System.out.println("(d) Imprimir saldo(s)");
            System.out.println("(e) Gravar os dados do campeonato em arquivo. ");
            System.out.println("(f) Ler os dados do campeonato em arquivo. ");
            System.out.println("(g) Sair da aplicacao. ");
            System.out.print("\nEntre com a opcao do menu: ");

            op = teclado.next().charAt(0);

            switch (op) {
                case 'a':
                    camp.incluirJogador();
                    break;
                case 'b':
                    
                    break;
                case 'c':
                    
                    break;
                case 'd':
                    
                    break;
                case 'e':
                    
                    break;
                case 'f':
                    
                    break;
                default:
                    if (op == 'g') {
                        System.out.println("Jogo Encerrado!");
                    } else {
                        System.out.println("Opcao invalida. Tente novamente");
                    }
            }
        } while (op != 'g');
    }
}

// comentar codigos

