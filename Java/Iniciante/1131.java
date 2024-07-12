import java.util.Scanner;

public class 1131 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int golsG, golsI, vitoriaG = 0, vitoriaI = 0, empate = 0, grenais = 0, novoGrenal;

        do {

            golsI = input.nextInt();
            golsG = input.nextInt();

            if (golsG > golsI)
                vitoriaG++;
            
            else if (golsI > golsG)
                vitoriaI++;

            else
                empate++;

            grenais++;

            System.out.println("Novo grenal (1-sim 2-nao)");

            novoGrenal = input.nextInt();

        } while (novoGrenal == 1);

        System.out.println(grenais + " grenais");
        System.out.println("Inter:" + vitoriaI);
        System.out.println("Gremio:" + vitoriaG);
        System.out.println("Empates:" + empate);
        
        if (vitoriaG > vitoriaI) 
            System.out.println("Gremio venceu mais");

        else if (vitoriaI > vitoriaG)
            System.out.println("Inter venceu mais");

        else 
            System.out.println("Nao houve vencedor");    


        input.close();
    }
}
