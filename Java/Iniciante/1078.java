import java.util.Scanner;

public class 1078 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();    

        int multiplyBy = 1;

        int product;

        int counter = 0;

        do {

            product = 0;
            product = N * multiplyBy;

             System.out.printf("%d x %d = %d%n", multiplyBy, N, product);

            ++multiplyBy;
            ++counter;

        } while (counter < 10);

        input.close();
    }
}
