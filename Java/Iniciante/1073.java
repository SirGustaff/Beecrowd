import java.util.Scanner;

public class 1073 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int squaredNumber;

        int counter = 1;

        int evenCounter = 1;

        while (counter <= n) {

            if (evenCounter % 2 == 0) {

                squaredNumber = evenCounter * evenCounter;

                System.out.printf("%d^2 = %d%n", evenCounter, squaredNumber);

                ++evenCounter;

            }

            else 
                ++evenCounter;

                

            ++counter;

        }

        input.close();
    }
}
