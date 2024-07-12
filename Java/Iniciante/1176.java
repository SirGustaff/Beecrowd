import java.util.Scanner;

public class 1176 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double fibonacci[] = new double[61];

        double num1 = 0, num2 = 1, next;

        for (int i = 0; i < fibonacci.length; i++) {

            fibonacci[i] = num1;

            next = num1 + num2;

            num1 = num2;

            num2 = next;

        }

        for (int t = input.nextInt(), i = 0; i < t; i++) {

            int n = input.nextInt();

            System.out.printf("Fib(%d) = %.0f%n", n, fibonacci[n]);

        }
        
        input.close();

    }
}

