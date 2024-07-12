import java.util.Scanner;

public class 2031 {

    // Tipos de jogadas:
    static final String ATAQUE_AEREO = "ataque";
    static final String PEDRA = "pedra";
    static final String PAPEL = "papel";

    // Possíveis resultados:
    static final String JOGADOR_UM_VENCEU = "Jogador 1 venceu";
    static final String JOGADOR_DOIS_VENCEU = "Jogador 2 venceu";
    static final String AMBOS_VENCERAM = "Ambos venceram";
    static final String SEM_GANHADOR = "Sem ganhador";
    static final String ANIQUILACAO_MUTUA = "Aniquilacao mutua";

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String sinalJogadorUm = "";

        String sinalJogadorDois = "";

        int numeroDeCasosDeTeste = input.nextInt();

        for (int i = 0; i < numeroDeCasosDeTeste; i++) {

            sinalJogadorUm = input.next();

            sinalJogadorDois = input.next();

            System.out.println(checarVencedor(sinalJogadorUm, sinalJogadorDois));

        }   

    }

    static String checarVencedor(String sinalJogadorUm, String sinalJogadorDois) {

        String vencedor = "";

        if (sinalJogadorUm.equals(ATAQUE_AEREO) && sinalJogadorDois.equals(PEDRA))
            vencedor = JOGADOR_UM_VENCEU;

        else if(sinalJogadorUm.equals(PEDRA) && sinalJogadorDois.equals(ATAQUE_AEREO))
            vencedor = JOGADOR_DOIS_VENCEU;

        else if(sinalJogadorUm.equals(PEDRA) && sinalJogadorDois.equals(PAPEL))
            vencedor = JOGADOR_UM_VENCEU;

        else if(sinalJogadorUm.equals(PAPEL) && sinalJogadorDois.equals(PEDRA))
            vencedor = JOGADOR_DOIS_VENCEU;

        else if(sinalJogadorUm.equals(ATAQUE_AEREO) && sinalJogadorDois.equals(PAPEL))
            vencedor = JOGADOR_UM_VENCEU;

        else if(sinalJogadorUm.equals(PAPEL) && sinalJogadorDois.equals(ATAQUE_AEREO))
            vencedor = JOGADOR_DOIS_VENCEU;

        else if(sinalJogadorUm.equals(PAPEL) && sinalJogadorDois.equals(PAPEL))
            vencedor = AMBOS_VENCERAM;

        else if(sinalJogadorUm.equals(PEDRA) && sinalJogadorDois.equals(PEDRA))
            vencedor = SEM_GANHADOR;
        
        else
            vencedor = ANIQUILACAO_MUTUA;
            
        return vencedor;
    }

}
