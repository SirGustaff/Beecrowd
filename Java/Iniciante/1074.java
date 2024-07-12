import java.util.Scanner;

public class 1074 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        int counter = 0;

        do {

            int readValue = 0;

            readValue = input.nextInt();

            if (readValue == 0)
                System.out.println("NULL");

            else {

                if (readValue % 2 == 0 && readValue > 0) 
                    System.out.println("EVEN POSITIVE");
                
                else if (readValue % 2 == 0 && readValue < 0)
                    System.out.println("EVEN NEGATIVE");

                else if (readValue % 2 != 0 && readValue > 0)
                    System.out.println("ODD POSITIVE");

                else
                    System.out.println("ODD NEGATIVE");
                
            }

            ++counter;

        } while (counter < N);

        input.close();
    }
}
