import java.util.Scanner;

public class 1158 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        for (int i = 1; i <= N; i++) {

            int sum = 0;

            int x = input.nextInt();
            int y = input.nextInt();

            for (int j = 1; j <= y;) {

                if (x % 2 != 0) {
                    sum += x;
                    x++;
                    j++;
                }

                else
                    x++;
            }

            System.out.println(sum);
        }

        input.close();
    }
}
