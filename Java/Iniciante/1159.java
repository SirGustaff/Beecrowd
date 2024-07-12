import java.util.Scanner;

public class 1159 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x = input.nextInt();

        while (x != 0) {

            int sum = 0;

            for (int even = 0; even < 5;) {

                if (x % 2 == 0) {
                    sum += x;
                    even++;
                    x++;
                }

                else
                    x++;

            }

            System.out.println(sum);

            x = input.nextInt();

        }

        input.close();
        
    }
}
