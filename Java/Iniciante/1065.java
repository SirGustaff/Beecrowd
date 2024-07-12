import java.util.Scanner;

public class 1065 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numbers;

        int counter = 1;

        int countEven = 0;

        while (counter <= 5) {

            numbers = input.nextInt();

            if (numbers % 2 == 0) 
                ++countEven;

            ++counter;
        }

        System.out.println(countEven + " valores pares");

        input.close();
        
    }
}
