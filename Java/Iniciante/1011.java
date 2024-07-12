import java.util.Scanner;

public class 1011 {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        double raio;

        raio = input.nextDouble();

        double volume = (4.0/3) * 3.14159 * Math.pow(raio, 3); // o java considera a divisão de dois números inteiros como inteira

        System.out.printf("VOLUME = %.3f%n", volume);

        input.close();
    }

}
