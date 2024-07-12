import java.util.Scanner;

public class 1435 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            int n = input.nextInt();

            if (n == 0) break;

            Integer[][] m = new Integer[n][n];

            for (int i = 0; i < m.length; i++) {

                for (int j = 0; j < m.length; j++) {

                    int x = 1;

                    if (i == 0 || j == 0 || j + 1 - n == 0 || i + 1 - n == 0)
                        m[i][j] = x;


                }
                
            }

            for (int i = 0; i < m.length; i++) {
                
                for (int j = 0; j < m.length; j++) {
                    
                    if (j == n - 1)
                        System.out.printf("%3d%n", m[i][j]);

                    else
                        System.out.printf("%3d", m[i][j]);

                }
            }

        }

        input.close();
        
    }
}
