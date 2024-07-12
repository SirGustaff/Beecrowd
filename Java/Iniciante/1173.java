import java.util.Scanner;

public class 1173 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int v = input.nextInt();

        for (int i = 0; i < 10; i++, v *= 2) {

            Integer[] values = new Integer[10];

            values[i] = v;

            System.out.printf("N[%d] = %d%n", i, v);

        }

        input.close();

    }

}
