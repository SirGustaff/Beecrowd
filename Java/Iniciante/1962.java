import java.util.Scanner;

public class 1962 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 0; i < n; i++) {

            int t = input.nextInt();

            if (t < 2015) {

                t = Math.abs(t - 2015);

                System.out.println(t + " D.C.");

            }

            else {

                t = Math.abs(t - 2014);

                System.out.println(t + " A.C.");

            }
        }

        input.close();
        
    }
}
