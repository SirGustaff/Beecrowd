import java.util.Scanner;

public class 1042 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a > b && a > c) {
            System.out.println(Math.min(b, c));
            System.out.println(Math.max(b, c));
            System.out.println(a);
        }

        if (b > a && b > c) {
            System.out.println(Math.min(a, c));
            System.out.println(Math.max(a, c));
            System.out.println(b);
        }

        if (c > a && c > b) {
            System.out.println(Math.min(a, b));
            System.out.println(Math.max(a, b));
            System.out.println(c);
        }

        System.out.println();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    input.close();

    }
}
