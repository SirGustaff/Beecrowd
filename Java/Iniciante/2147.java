import java.io.IOException;
import java.util.Scanner;

public class 2147 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);

        int c = input.nextInt();

        for(int i = 0; i < c; i++) {

            String palavra = input.next();

            float tempoGasto = palavra.length() * 0.01f;
            
            System.out.printf("%.2f%n", tempoGasto);

        }
 
    }
 
}
