import java.util.Scanner;

public class 2029 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        while (input.hasNext()) {

            float v = input.nextFloat();

            float d = input.nextFloat();

            System.out.printf("ALTURA = %.2f%n", v / (3.14 * (Math.pow(d / 2, 2))));

            System.out.printf("AREA = %.2f%n", 3.14 * Math.pow(d / 2, 2));

        }

        input.close();

    }
}
