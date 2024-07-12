import java.util.Scanner;

public class 3053 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int mov = input.nextInt();

        char moeda = input.next().charAt(0);

        for (int i = 0; i < mov; i++) {

            int movType = input.nextInt();

            if (moeda == 'A') {

                switch (movType) {

                    case 1:
                        moeda = 'B';
        
                        break;

                    case 3:
                        moeda = 'C';

                        break;
                }

            }

            else if (moeda == 'B') {
                
                switch (movType) {
                    case 1:
                        moeda = 'A';
                        
                        break;

                    case 2:
                        moeda = 'C';

                        break;
            
                }
            }

            else {

                switch (movType) {
                    case 2:
                        moeda = 'B';
                        
                        break;

                    case 3:
                        moeda = 'A';

                        break;
                        
                }

            }
        }

        System.out.println(moeda);

        input.close();

    }
}
