import java.util.Scanner;

public class 2143 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int t = input.nextInt();
        int n;

        while(t != 0) {

            for (int i = 0; i < t; i++) {
        
                n = input.nextInt();

                if (n < 3) {
                
                } else if (n % 2 == 0) {
                    System.out.println((n - 2) * 2 + 2);
                } else {
                    System.out.println((n - 1) * 2 + 1);

                }
            }

            t = input.nextInt();

        }
    }
}
