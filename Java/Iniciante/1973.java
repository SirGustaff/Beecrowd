import java.util.Scanner;

public class 1973 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numberStars = input.nextInt();

        long[] stars = new long[numberStars];

        long stolenFlock = 0;

        long allFlock = 0;

        long visitedStar = 0;

        for (int i = 0; i < stars.length; i++) {
            stars[i] = input.nextLong();
            allFlock += stars[i];
        }

        for (int i = 0; (i < stars.length && i >= 0) && stars[i] != 0;) {

            stolenFlock++;

            if (visitedStar <= i)
                visitedStar++;

            if (stars[i] % 2 != 0) {
                stars[i] -= 1;
                i++;
            }
            
            else {
                stars[i] -= 1;
                i--;
            }
        }

        System.out.printf("%d %d%n", visitedStar, allFlock - stolenFlock);
    }
}
