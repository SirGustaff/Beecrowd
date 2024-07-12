import java.util.Scanner;

public class 1179 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        Integer[] even = new Integer[5];

        Integer[] odd = new Integer[5];

        int j = 0;

        int k = 0;

        for(int i = 0; i < 15; i++) {

            int number = input.nextInt();

            if (number % 2 == 0) {
                even[j] = number;
                j++;

            }

            else {   
                odd[k] = number;
                k++;
            }

            if (j > 4) {

                for(int counter = 0; counter < even.length; counter++)
                    System.out.printf("par[%d] = %d%n", counter, even[counter]);

                
            j = 0;
            
            }

            if (k > 4) {

                for(int counter = 0; counter < odd.length; counter++)
                    System.out.printf("impar[%d] = %d%n", counter, odd[counter]);

                
            k = 0;
            
            }
        }


        if (k < 5)
            for(int counter = 0; counter < k; counter++)
                System.out.printf("impar[%d] = %d%n", counter, odd[counter]);

        if (j < 5)
            for(int counter = 0; counter < j; counter++)
                System.out.printf("par[%d] = %d%n", counter, even[counter]);

        

        input.close();

    }
}
