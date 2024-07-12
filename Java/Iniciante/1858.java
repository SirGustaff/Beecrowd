import java.util.Scanner;

public class 1858 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);

        int n = input.nextInt();

        int smaller = 0, smallerPosition = 0;

        for (int i = 1; i <= n; i++) {

            int t = input.nextInt();

            if (i == 1) {

                smallerPosition = 1;
                smaller = t;

            }

            else if (smaller > t) {

                smallerPosition = i;
                smaller = t;

            }

        }

        System.out.println(smallerPosition);

        input.close();
    }
}
