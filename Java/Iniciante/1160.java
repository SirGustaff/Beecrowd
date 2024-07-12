import java.util.Scanner;

public class 1160 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        for (int i = 0; i < t; i++) {

            int pa = input.nextInt();
            int pb = input.nextInt();

            double ca = input.nextDouble();
            double cb = input.nextDouble();

            int years = 0;
            
            while (pb >= pa) {

                pa += (pa * ca) / 100 ;

                pb += (pb * cb) / 100;

                years++;

                if (years > 100)
                    break;

                } 

            if (years > 100)
                System.out.println("Mais de 1 seculo.");

            else    
                System.out.println(years + " anos.");

        }

        input.close();

    }
}
