import java.util.Scanner;

public class 1070 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int counter = 1;
        int x = input.nextInt();

        while (counter <= 6) {

            if (x % 2 != 0) {
                
                System.out.println(x);          
                
                ++counter;

                ++x;

            }

            else if (x % 2 == 0)
                ++x;

        }

        input.close();
        
    }
}
