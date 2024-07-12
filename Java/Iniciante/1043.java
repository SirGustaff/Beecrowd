import java.util.Scanner;

public class 1043 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float A = input.nextFloat();
        float B = input.nextFloat();
        float C = input.nextFloat();

        float perimeter = A + B + C;

        float area = ((A + B) * C) / 2;

    if ( (A > Math.abs(C - B)) && (A < B + C) )
        System.out.printf("Perimetro = %.1f%n", perimeter);

    else if  ( (B > Math.abs(A - C)) && (B < A + C) )
        System.out.printf("Perimetro = %.1f%n", perimeter);
    
    else if  ( (C > Math.abs(A - B)) && (C < A + B) )
        System.out.printf("Perimetro = %.1f%n", perimeter);

    else 
        System.out.printf("Area = %.1f%n", area);
        
    input.close();

    }

}
