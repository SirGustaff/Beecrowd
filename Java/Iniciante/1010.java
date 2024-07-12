import java.util.Scanner;

public class 1010 {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        int code1 = input.nextInt();
        int qtd1 = input.nextInt();
        double price1 = input.nextDouble();

        int code2 = input.nextInt();
        int qtd2 = input.nextInt();
        double price2 = input.nextDouble();

        double finalvalue = (qtd1 * price1) + (qtd2 * price2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", finalvalue);

        input.close();
        
    }

}
