import java.util.Scanner;

public class 1178 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Double[] n = new Double[100];

        double x = input.nextDouble();

        for (int i = 0; i < n.length; i++) {

            n[i] = x;

            x = x / 2;

        }

        for (int i = 0; i < n.length; i++)
            System.out.printf("N[%d] = %.4f%n", i, n[i]);

        input.close();

    }
}
