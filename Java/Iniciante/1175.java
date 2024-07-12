import java.util.Scanner;

public class 1175 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Integer[] n = new Integer[20];

        for (int i = 0; i < n.length; i++) 
            n[i] = input.nextInt();

        for (int i = 0, j = 19; i <= 10 && j >= 10 ; i++, j--) {

            int x = 0, y = 0;

            x = n[i];

            y = n[j];

            n[i] = y;

            n[j] = x;

        }

        for (int i = 0; i < n.length; i++) 
            System.out.printf("N[%d] = %d%n", i, n[i]);

        input.close();
        

    }
}
