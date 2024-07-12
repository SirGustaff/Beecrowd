import java.util.Scanner;

public class 1020 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int ageindays = input.nextInt();

        int years = ageindays / 365;

        int months = (ageindays % 365) / 30;

        int days = (ageindays % 365) % 30;

        System.out.printf("%d ano(s)%n", years);

        System.out.printf("%d mes(es)%n", months);

        System.out.printf("%d dia(s)%n", days);

        input.close();
    
   }

    
}
