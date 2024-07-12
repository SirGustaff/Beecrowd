import java.util.Scanner;

public class 1180 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int smaller, position;

        Integer[] x = new Integer[n];

        x[0] = input.nextInt();

        smaller = x[0];
        
        position = 0;

        for (int i = 1; i < x.length; i++) {

            x[i] = input.nextInt();

            if (smaller > x[i] ) {

                smaller = x[i];
                position = i;

            }

        }

        System.out.println("Menor valor: " + smaller);
        System.out.println("Posicao: " + position);

        input.close();

    }
}
