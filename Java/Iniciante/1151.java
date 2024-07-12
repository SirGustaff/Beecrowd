import java.util.Scanner;

public class 1151 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        int num1 = 0, num2 = 1, next;

        for (int i = 1; i <= N; i++) {

            if (i == N)
                System.out.printf("%d%n", num1);

            else {
                System.out.printf("%d ", num1);
                next = num1 + num2;
                num1 = num2;
                num2 = next;
            }
        }

        input.close();
    }
}
