import java.util.Scanner;

public class 1099 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt(), x , y;

        for (int i = 0; i < N; i++) {

            int oddSum = 0;

            x = input.nextInt();

            y = input.nextInt();


            if (x > y) {

                for (y = y + 1; x > y; y++) {

                    if (y % 2 != 0) {

                    oddSum += y;

                    }

               
                }   

                System.out.println(oddSum);

                oddSum = 0;
            }
           
            else {

                for (x = x + 1; y > x; x++) {

                    if (x % 2 != 0) {

                        oddSum += x;
                    }
        
                }

                System.out.println(oddSum);
            
            }
        
        }


        input.close();
    }   

}
