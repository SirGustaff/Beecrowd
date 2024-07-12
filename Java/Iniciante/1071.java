import java.io.IOException;
import java.util.Scanner;

public class 1071 {
 
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int x = input.nextInt();

        int y = input.nextInt();

        int somaImpar = 0;

        int numeroImpar = 0;

        if (x < y) {

            ++x;

            while (x < y) {

                if (x % 2 != 0) {

                numeroImpar = x;

                somaImpar = somaImpar + numeroImpar;            
            }

            ++x;   

        }
    }

        else if (y < x) {

            ++y;
        
        while (y < x) {

                if (y % 2 != 0) {

                numeroImpar = y;

                somaImpar = somaImpar + numeroImpar;
            
            }

            ++y;     
        }

    }  

        System.out.println(somaImpar);

        input.close();
 
    }
 
}
