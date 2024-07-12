import java.util.Scanner;

public class 1866 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);

        int c = input.nextInt();

        for (int i = 0; i < c; i++) {

            int n = input.nextInt();

            int soma = 0;

            for (int j = 0; j < n; j++) {

                if (j % 2 == 0)
                    soma += 1;

                else 
                    soma += -1;

            }

            System.out.println(soma);

        }

        input.close();

    }
}
