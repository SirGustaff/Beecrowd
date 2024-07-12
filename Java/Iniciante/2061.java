import java.util.Scanner;

public class 2061 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int numeroInicialDeAbas = input.nextInt();
        int numeroDeAcoesDePericles = input.nextInt();

        int numeroFinalDeAbas = numeroInicialDeAbas;

        String acao = "";

        for (int i = 0; i <= numeroDeAcoesDePericles; i++) {

            acao = input.nextLine();

            if (acao.equals("clicou")) {
                numeroFinalDeAbas -= 1;
            }

            else if(acao.equals("fechou"))
                numeroFinalDeAbas += 1;
            
        }

        System.out.println(numeroFinalDeAbas);
    }
}
