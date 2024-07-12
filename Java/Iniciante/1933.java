import java.util.Scanner;

public class 1933 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = 0;

        if (a == b)
            c = a;

        else 
            c = Math.max(a, b);

        System.out.println(c);

        input.close();

    }
}
