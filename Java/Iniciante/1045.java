import java.util.Scanner;

public class 1045 {

    public static void main(String[] args) {
        
    

    Scanner input = new Scanner(System.in);

    float A, B, C, Empty, A2, BC;

   

    Empty = 0;

    A = input.nextFloat();
    B = input.nextFloat();
    C = input.nextFloat();

    if (B > A) {
        Empty = A;
        A = B;
        B = Empty;
    }

    if (C > A) {
        Empty = A;
        A = C;
        C = Empty;
    }

    A2 = (float) Math.pow(A, 2);

    BC = (float) Math.pow(B, 2) + (float) Math.pow(C, 2);

    if (A >= B + C) 
        System.out.println("NAO FORMA TRIANGULO");
    
        else {
                    
                if (A2 > BC)
                    System.out.println("TRIANGULO OBTUSANGULO");

                else if (A2 < BC)
                    System.out.println("TRIANGULO ACUTANGULO");

                else
                    System.out.println("TRIANGULO RETANGULO");

                
                if (A == B && A == C)
                    System.out.println("TRIANGULO EQUILATERO");
    
                else if (A == B || A == C || B == C)
                    System.out.println("TRIANGULO ISOSCELES");
        }

        input.close();

    }  
}
