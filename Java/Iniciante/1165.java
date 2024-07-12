import java.util.Scanner;

public class 1165 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 0; i < n; i++) {

            int x = input.nextInt();

            int div = 0;

            for (int j = 1; j <= x; j++) {

                if (x % j == 0)
                    div++;

            }

            if (div > 2)    
                System.out.println(x + " nao eh primo");

            else
                System.out.println(x + " eh primo");
                
        }

        input.close();
        
    }
}
