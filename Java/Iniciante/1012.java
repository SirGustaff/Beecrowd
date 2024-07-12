import java.util.Scanner;

public class 1012 {
    
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        Double A = input.nextDouble();
        Double B = input.nextDouble();
        Double C = input.nextDouble();

        Double TriangleArea = (A * C) / 2;

        Double CircleArea = 3.14159 * Math.pow(C, 2);

        Double TrapezeArea = (( A + B ) * C) / 2;

        Double SquareArea = Math.pow(B, 2);

        Double RetangleArea = A * B;

        System.out.printf("TRIANGULO: %.3f%n", TriangleArea);
        System.out.printf("CIRCULO: %.3f%n", CircleArea);
        System.out.printf("TRAPEZIO: %.3f%n", TrapezeArea);
        System.out.printf("QUADRADO: %.3f%n", SquareArea);
        System.out.printf("RETANGULO: %.3f%n", RetangleArea);

        input.close();

    }
}
