import java.util.Scanner;

public class 1564 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        while(input.hasNextInt()) {

            int n = input.nextInt();

            if (n == 0)
                System.out.println("vai ter copa!");

            else    
                System.out.println("vai ter duas!");
        }

        input.close();

    }
}
