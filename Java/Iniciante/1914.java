import java.util.Scanner;

public class 1914 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);

        int n = input.nextInt();

        for (int i = 0; i < n; i++) {

            String player1 = input.next();
            String oddEven1 = input.next();

            String player2 = input.next();
            String oddEven2 = input.next();

            int number1 = input.nextInt();
            int number2 = input.nextInt();
            int sum = 0;

            if (oddEven1.equalsIgnoreCase("PAR")) {

                sum = number1 + number2;

                if (sum % 2 == 0)
                    System.out.println(player1);

                else
                    System.out.println(player2);

            }

            else {

                sum = number1 + number2;

                if (sum % 2 == 0)
                    System.out.println(player2);

                else
                    System.out.println(player1);

            }
            
        }

        input.close();

    }
}
