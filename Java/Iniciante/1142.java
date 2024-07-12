import java.util.Scanner;

public class 1142 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        int x = 1;

        for (int i = 0; i < N; i++) {

            System.out.print(x + " ");

            x++;

            System.out.print(x + " ");

            x++;

            System.out.print(x + " ");

            System.out.print("PUM\n");

            x += 2;

        }

        input.close();
    }
}
