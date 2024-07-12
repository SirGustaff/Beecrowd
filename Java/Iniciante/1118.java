import java.util.Scanner;

public class 1118 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double media = 0;
        double grade = 0;

        for (int i = 0; i < 1;) {

                for (int j = 0; j < 2; ) {

                grade = input.nextDouble();
                
                if (grade > 10 || grade < 0)
                    System.out.println("nota invalida");

                else {
                    media += grade;
                    j++;
                }
       
            }

            System.out.printf("media = %.2f%n", media / 2);

            media = 0;

            System.out.println("novo calculo (1-sim 2-nao)");

            int newCalc = input.nextInt();

            for (; newCalc != 1 && newCalc != 2;) {

                System.out.println("novo calculo (1-sim 2-nao)");
                newCalc = input.nextInt();
            
            }        
            
            if (newCalc == 2)
                i++;

            else if (newCalc == 1)
                continue;
                
        }

        input.close();

    }
}
