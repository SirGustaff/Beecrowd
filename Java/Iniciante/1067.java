import java.util.Scanner;

public class 1067 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int oddUntil, numbers;

        numbers = 0;

        oddUntil = input.nextInt();

        if (oddUntil <= 1000 && oddUntil >= 1 ) do {

            ++numbers;
            
            if (numbers % 2 != 0) 
                System.out.println(numbers);
            

        } while (numbers < oddUntil);

        input.close();
        
    }
}
