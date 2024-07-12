import java.util.Scanner;

public class 1149 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();

        int N = input.nextInt();

        int sum = 0;

        while (N <= 0)
            N = input.nextInt();

        for (int i = 0; i < N; i++)
            sum += A + i;

        System.out.println(sum);

        input.close();
    }
}
