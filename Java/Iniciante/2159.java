import java.util.Scanner;

public class 2159 {
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        double p = n / Math.log(n);

        double m = 1.25506 * (n / Math.log(n));
 
        System.out.printf("%.1f %.1f%n", p, m);
 
    }
 
}
