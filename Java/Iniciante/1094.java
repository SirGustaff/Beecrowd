import java.util.Scanner;

public class 1094 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int qtd, total = 0, totalC = 0, totalR = 0, totalS = 0;
        String type;

        for (int i = 0; i < N; i++) {

            qtd = input.nextInt();
            type = input.next();

            if (type.equals("C")) 
                totalC += qtd;

            else if (type.equals("R")) 
                totalR += qtd;

            else if (type.equals("S"))
                totalS += qtd;
        }

        total = totalC + totalR + totalS;

        System.out.printf("Total: %d cobaias%n", total);

        System.out.printf("Total de coelhos: %d%n", totalC);

        System.out.printf("Total de ratos: %d%n", totalR);

        System.out.printf("Total de sapos: %d%n", totalS);

        System.out.printf("Percentual de coelhos: %.2f %%%n", (float) (totalC * 100) / total);

        System.out.printf("Percentual de ratos: %.2f %%%n", (float) (totalR * 100) / total);

        System.out.printf("Percentual de sapos: %.2f %%%n", (float) (totalS * 100) / total);

        input.close();
    }
}
