import java.util.Scanner;

public class 1075 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        int counter = 0;

        int numbers = 0;

        do {

            if (numbers % N == 2) {
                System.out.println(numbers);
                ++numbers;
            }

            else 
                ++numbers;

            ++counter;

        } while (counter < 10000);

        
        input.close();
    }
}
