import java.util.Scanner;

public class 1038 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int code = input.nextInt();
        int quantity = input.nextInt();

        double value;

        switch (code) {

            case 1:

                value = 4.00 * quantity;

                System.out.printf("Total: R$ %.2f%n", value);
                
                break;
            
            case 2:

                value = 4.50 * quantity;

                System.out.printf("Total: R$ %.2f%n", value);

                break;
            
            case 3:

                value = 5.00 * quantity;

                System.out.printf("Total: R$ %.2f%n", value);

                break;

            case 4:

                value = 2.00 * quantity;

                System.out.printf("Total: R$ %.2f%n", value);

                break;

            case 5:

                value = .50 * quantity;

                System.out.printf("Total: R$ %.2f%n", value);

                break;
            
        } 

        input.close();
       
    }
}
