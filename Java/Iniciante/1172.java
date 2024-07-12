import java.util.Scanner;

public class 1172 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        Integer[] X = new Integer[10];

        for (int i = 0; i < X.length; i++) {

            int j = input.nextInt();

            if (j <= 0)
                j = 1;

            X[i] = j;

            System.out.printf("X[%d] = %d%n", i , X[i]);

        }

        input.close();

    }
}
