import java.util.Scanner;

public class 1021 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double totalvalue = input.nextFloat();

        int notas100 = (int) (totalvalue / 100);

        totalvalue = totalvalue % 100;

        int notas50 = (int) (totalvalue / 50);

        totalvalue = totalvalue % 50;
        
        int notas20 = (int) (totalvalue / 20);

        totalvalue = totalvalue % 20;

        int notas10 = (int) (totalvalue / 10);

        totalvalue = totalvalue % 10;

        int notas5 = (int) (totalvalue / 5);

        totalvalue = totalvalue % 5;

        int notas2 = (int) (totalvalue / 2);

        totalvalue = totalvalue % 2;



        int moeda1 = (int) (totalvalue / 1);

        totalvalue = totalvalue % 1;

        int moeda50 = (int) (totalvalue / 0.50);

        totalvalue = (totalvalue % 0.50f);

        int moeda25 = (int) (totalvalue / 0.25);

        totalvalue = (totalvalue % 0.25f);

        int moeda10 = (int) (totalvalue / 0.10);

        totalvalue = (totalvalue % 0.10f);

        int moeda05 = (int) (totalvalue / 0.05);

        totalvalue = (totalvalue % 0.05f);

        int moeda01 = (int) Math.round(totalvalue / 0.01);


        System.out.println("NOTAS:");

        System.out.printf("%d nota(s) de R$ 100.00%n", notas100);

        System.out.printf("%d nota(s) de R$ 50.00%n", notas50);

        System.out.printf("%d nota(s) de R$ 20.00%n", notas20);

        System.out.printf("%d nota(s) de R$ 10.00%n", notas10);

        System.out.printf("%d nota(s) de R$ 5.00%n", notas5);

        System.out.printf("%d nota(s) de R$ 2.00%n", notas2);

        System.out.println("MOEDAS:");

        System.out.printf("%d moeda(s) de R$ 1.00%n", moeda1);

        System.out.printf("%d moeda(s) de R$ 0.50%n", moeda50);

        System.out.printf("%d moeda(s) de R$ 0.25%n", moeda25);

        System.out.printf("%d moeda(s) de R$ 0.10%n", moeda10);

        System.out.printf("%d moeda(s) de R$ 0.05%n", moeda05);

        System.out.printf("%d moeda(s) de R$ 0.01%n", moeda01);
        
        input.close();

    }
    
}
