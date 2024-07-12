import java.util.Scanner;

public class 1036 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();

        double delta = Math.pow(B, 2) - 4 * A * C;

        double deltaroot = Math.sqrt(delta);

        double root1 = (-B + deltaroot) / (2 * A);

        double root2 = (-B - deltaroot) / (2 * A);

        if (delta < 0 || A == 0)
            System.out.println("Impossivel calcular");

        else 
            System.out.printf("R1 = %.5f%nR2 = %.5f%n", root1, root2);

            
        input.close();
        
    }

    
}
