import java.util.Scanner;

public class 2059 {
    public static void main(String[] args) {

        final String JOGADOR_UM_GANHOU = "Jogador 1 ganha!";

        final String JOGADOR_DOIS_GANHOU = "Jogador 2 ganha!";

        final int NAO = 0;

        final int SIM = 1;

        Scanner input = new Scanner(System.in);

        int escolhaParOuImparJogadorUm = input.nextInt();

        int escolhaNumeroJogadorUm = input.nextInt();

        int escolhaNumeroJogadorDois = input.nextInt();

        int jogadorUmRoubou = input.nextInt();

        int jogadorDoisAcusouRoubo = input.nextInt();

        if (jogadorUmRoubou == SIM && jogadorDoisAcusouRoubo == SIM) 
            System.out.println(JOGADOR_DOIS_GANHOU);
        
        else if (jogadorUmRoubou == SIM && jogadorDoisAcusouRoubo == NAO) 
            System.out.println(JOGADOR_UM_GANHOU);
        
        else if (jogadorUmRoubou == NAO && jogadorDoisAcusouRoubo == SIM) 
            System.out.println(JOGADOR_UM_GANHOU);
        
        else if (escolhaParOuImparJogadorUm == 1 && (escolhaNumeroJogadorUm + escolhaNumeroJogadorDois) % 2 == 0)
            System.out.println(JOGADOR_UM_GANHOU);

        else if (escolhaParOuImparJogadorUm == 0 && (escolhaNumeroJogadorUm + escolhaNumeroJogadorDois) % 2 == 1)
            System.out.println(JOGADOR_UM_GANHOU);
        
        else
            System.out.println(JOGADOR_DOIS_GANHOU);

        input.close();

    }
}
