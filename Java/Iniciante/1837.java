import java.util.Scanner;

public class 1837 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        int r, q;

        if (a >= 0) {

            r = a % b;

            q = a / b;

            System.out.print(q + " ");
            System.out.println(r);

        }

        else {

            if (b < 0) {

                r = a;

                b = b * (-1);

                for (q = 0; r < 0; q++, r += b);

            } 

            else {

                r = a;

                for (q = 0; r < 0; q--, r += b);

            }

            System.out.print(q + " ");
            System.out.println(r);
        
        }

        input.close();

    }
}
