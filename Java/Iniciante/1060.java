import java.util.Scanner;

public class 1060 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        float numbers;

        int counter = 1;

        int counterPositive = 0;

        numbers = 0f;

        while (counter <= 6) {

            numbers = input.nextFloat();

            if (numbers > 0)
                ++counterPositive;

            ++counter;

        }

        System.out.println(counterPositive + " valores positivos");
     
        input.close();
    }
}
