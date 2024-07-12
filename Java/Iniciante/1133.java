import java.util.Scanner;

public class 1133 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();

        if (x < y) {

            do {

                x++;

                if (x % 5 == 2 || x % 5 == 3)
                    System.out.println(x);

            } while (x < y);

        } 

        else {

             do {
                
                y++;
                
                if (y % 5 == 2 || y % 5 == 3)

                    System.out.println(y);

            } while (y < x);

        }

        input.close();
        
    }
}
