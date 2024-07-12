import java.util.Scanner;

public class 1145 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x = input.nextInt(), y = input.nextInt(), numbers = 1;


        for(; numbers <= y; numbers++ ) {

                for (int rows = 1; rows < x && numbers < y; rows++) {

                    System.out.printf("%d ", numbers);

                    numbers++;

                }
                
                System.out.printf("%d", numbers);

                System.out.println();

        }
      
        input.close();
        
    }
}
