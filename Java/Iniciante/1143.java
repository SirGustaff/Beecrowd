import java.util.Scanner;

public class 1143 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        int x = 1;

        for (int i = 0; i < N; i++) {

            System.out.printf("%d ", x);

            System.out.printf("%d ", x * x);

            System.out.printf("%d%n", x * x * x);

            x++;

        }

        input.close();
    }
}
