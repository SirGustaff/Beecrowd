import java.util.Scanner;

public class 1963 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();

        double b = input.nextDouble();

        double percent = ((b * 100) / a) - 100;

        System.out.printf("%.2f%%%n", percent);

        input.close();

    }
}
