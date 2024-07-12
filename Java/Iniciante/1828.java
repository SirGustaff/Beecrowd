import java.util.Scanner;

public class 1828 {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        int t = input.nextInt();

        for (int i = 1; i <= t; i++) {

            String j1 = input.next();
            String j2 = input.next();

            if (j1.equals(j2))
                System.out.printf("Caso #%d: De novo!%n", i);

            else if 
            (
                j1.equals("tesoura") && j2.equals("papel") || 
                j1.equals("papel") && j2.equals("pedra") || 
                j1.equals("pedra") && j2.equals("lagarto") || 
                j1.equals("lagarto") && j2.equals("Spock") || 
                j1.equals("Spock") && j2.equals("tesoura") || 
                j1.equals("tesoura") && j2.equals("lagarto") || 
                j1.equals("lagarto") && j2.equals("papel") ||
                j1.equals("papel") && j2.equals("Spock") ||
                j1.equals("Spock") && j2.equals("pedra") ||
                j1.equals("pedra") && j2.equals("tesoura")
            )

            System.out.printf("Caso #%d: Bazinga!%n", i);

            else
                System.out.printf("Caso #%d: Raj trapaceou!%n", i);

        }

        input.close();
        
    }
}
