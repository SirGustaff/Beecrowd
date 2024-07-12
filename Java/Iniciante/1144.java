import java.util.Scanner;

public class 1144 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        int x = 1;

        for (; x <= N ; x++) {

            System.out.printf("%d %d %d%n", x, x*x, x*x*x);

            System.out.printf("%d %d %d%n", x, (x*x) + 1, (x*x*x) + 1);
            
        }

        input.close();
    }
}
