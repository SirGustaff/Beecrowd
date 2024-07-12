import java.util.Scanner;

public class 1116 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 0; i < n; i++) {

            float x = input.nextFloat();

            float y = input.nextFloat();

            float div = 0;

            if (y == 0)
                System.out.printf("divisao impossivel%n");

            else {

            div = (float) x / y;

            System.out.printf("%.1f%n", div);
            
            }

        }

        input.close();
    }
}
