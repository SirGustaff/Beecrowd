import java.util.Scanner;

public class 1018 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int quantity = input.nextInt();

        int notas100 = quantity / 100;

        int notas50 = (quantity % 100) / 50;

        int notas20 = ((quantity % 100) % 50) / 20;

        int notas10 = (((quantity % 100) % 50) % 20) / 10;

        int notas5 = ((((quantity % 100) % 50) % 20) % 10) / 5;

        int notas2 = (((((quantity % 100) % 50) % 20) % 10) % 5) / 2;

        int notas1 = ((((((quantity % 100) % 50) % 20) % 10) % 5) % 2) / 1;

        System.out.printf("%d%n", quantity);

        System.out.printf("%d nota(s) de R$ 100,00%n", notas100);

        System.out.printf("%d nota(s) de R$ 50,00%n", notas50);

        System.out.printf("%d nota(s) de R$ 20,00%n", notas20);

        System.out.printf("%d nota(s) de R$ 10,00%n", notas10);

        System.out.printf("%d nota(s) de R$ 5,00%n", notas5);

        System.out.printf("%d nota(s) de R$ 2,00%n", notas2);

        System.out.printf("%d nota(s) de R$ 1,00%n", notas1);

        input.close();
        
    }
}
