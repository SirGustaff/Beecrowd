import java.util.Scanner;

public class 1134 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int fuelType, ethanol = 0, gasoline = 0, diesel = 0;

        do {

            fuelType = input.nextInt();

            switch (fuelType) {

                case 1:
                    ethanol++;

                    break;
            
                case 2:
                    gasoline++;

                    break;

                case 3:
                    diesel++;

                default:
                    break;
                
            } 

        } while (fuelType != 4);

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + ethanol);
        System.out.println("Gasolina: " + gasoline);
        System.out.println("Diesel: " + diesel);

        input.close();
    }
}
