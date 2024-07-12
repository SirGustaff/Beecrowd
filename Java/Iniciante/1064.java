import java.util.Scanner;


public class 1064 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        float numbers;
        float numbersSum = 0;
        float media;
        int counterPositive= 0;
        int counter = 1;
       


        while (counter <= 6) {

            numbers = input.nextFloat();

            if (numbers > 0) {

                ++counterPositive;
                
                numbersSum = numbersSum + numbers;

            }

            ++counter;
            
        }

        media = numbersSum / counterPositive;

        System.out.printf("%d valores positivos%n", counterPositive);
        System.out.printf("%.1f%n", media);

        input.close();
    }

}
