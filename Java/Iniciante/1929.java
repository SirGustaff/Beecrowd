import java.util.Scanner;

public class 1929 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        if (Math.abs(b - c) < a && a < b + c) 
            System.out.println("S");

        else if (Math.abs(a - d) < b && b < a + d)
            System.out.println("S");

        else if (Math.abs(a - d) < c && c < a + d)
            System.out.println("S");

        else if (Math.abs(b - d) < c && c < b + d)
            System.out.println("S");

        else 
            System.out.println("N");

        input.close();

    }
}
