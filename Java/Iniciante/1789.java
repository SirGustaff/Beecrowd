import java.util.Scanner;

public class 1789 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);

        while (input.hasNext()) {

            int fasttest = 0;

            int l = input.nextInt();

            Integer[] slugs = new Integer[l];

            for (int i = 0; i < slugs.length; i++) {

                slugs[i] = input.nextInt();

                if (slugs[i] > fasttest)
                    fasttest = slugs[i];
                
            }

            if (fasttest < 10)
                System.out.println("1");

            else if (fasttest >= 10 && fasttest < 20)
                System.out.println("2");

            else if (fasttest >= 20)
                System.out.println("3");

        }

        input.close();

    }
}
