import java.util.Scanner;

public class 1132 {
        public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int x = input.nextInt(), y = input.nextInt(), soma = 0;


        if (x < y) {

            do {

                if (x % 13 != 0)
                    soma += x;

                    x++;

            } while (x <= y);

        }

        else if (y < x) {

            do {

                if (y % 13 != 0)
                    soma += y;
                
                y++;

            } while (y <= x);

        }
        
        System.out.println(soma);

        input.close();
              
    }
}
