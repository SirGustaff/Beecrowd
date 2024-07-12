import java.util.Scanner;

public class 1072 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int x = 0;

        int counter = 1;

        int counterIn = 0;

        int counterOut = 0;

        while (counter <= n) {

            x = input.nextInt();

            if (x >= 10 && x <= 20) 
                ++counterIn;

            else 
                ++counterOut;

        ++counter;

        }   

        System.out.println(counterIn + " in");
        System.out.println(counterOut + " out");

        input.close();

    }
}
