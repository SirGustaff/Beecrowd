import java.util.Scanner;

public class 1959 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int l = input.nextInt();

        long p = l * n;

        System.out.printf("%d%n", p);

        input.close();

    }
}
