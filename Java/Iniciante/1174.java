import java.util.Scanner;

public class 1174 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Float array[] = new Float[100];

        for (int i = 0; i < 100; i++) {

            float x = input.nextFloat();

            array[i] = x;

        }

        for (int i = 0; i < 100; i++) {

            if (array[i] <= 10) {

                System.out.printf("A[%d] = %.1f%n", i, array[i]);

            }

        }

        input.close();
        
    }
}
