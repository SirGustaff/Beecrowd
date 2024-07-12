import java.util.Scanner;


public class 1017 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Double hours = input.nextDouble();
        
        double averagespeed = input.nextDouble();

        double fuelneeded = (hours * averagespeed) / 12;

        System.out.printf("%.3f%n", fuelneeded);

        input.close();
        
        
    }

    
}
