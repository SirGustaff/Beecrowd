import java.util.Scanner;

public class 1164 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 0; i < n; i++) {

            int sum = 0;

            int x = input.nextInt();

            for (int j = 1; j < x; j++) {

                if (x % j == 0)
                    sum += j;
                    
            }

            if (sum == x)
                System.out.println(x + " eh perfeito");

            else 
                System.out.println(x + " nao eh perfeito");
        
        }

        input.close();

    }
}
