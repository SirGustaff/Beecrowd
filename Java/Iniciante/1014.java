import java.util.Scanner;

public class 1014 {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        int totaldistance = input.nextInt();

        double spentfuel = input.nextDouble();

        double averageconsumption = totaldistance / spentfuel;

        System.out.printf("%.3f km/l%n", averageconsumption);

        input.close();

    }
}
