import java.util.Scanner;

public class 1177 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int t = input.nextInt(), x = 0;

        Integer[] n = new Integer[1000];

        for (int i = 0; i < n.length; i++) {

            if (x < t) {

                n[i] = x;

                x++;
                
            }

            else if (x == t) {

                x = 0;

                n[i] = x;

                x++;

            }

        }

        for (int i = 0; i < n.length; i++) 
            System.out.printf("N[%d] = %d%n", i, n[i]);

        input.close();

    }
}
