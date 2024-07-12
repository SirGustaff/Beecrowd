import java.util.Scanner;

public class 1080 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int bigger = 0;
        int position = 0;
        int biggestPosition = 1;

        for (int i = 0; i < 100; i++) {

            position++;

            int N = input.nextInt();

            if (N > bigger) {
                bigger = N; 
                biggestPosition =  position;
            }

        }

        System.out.println(bigger);
        System.out.println(biggestPosition);

        input.close();
        
    }
    
}
