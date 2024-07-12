import java.util.Scanner;

public class 1079 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        for (int i = 0; i < N; i++) {

            float value1 = 0;
            float value2 = 0;
            float value3 = 0;

            value1 = input.nextFloat() * 2;
            value2 = input.nextFloat() * 3;
            value3 = input.nextFloat() * 5;

            float media = (value1 + value2 + value3) / 10;

            System.out.printf("%.1f%n", media);   

        }

        input.close();

    }

    
}
