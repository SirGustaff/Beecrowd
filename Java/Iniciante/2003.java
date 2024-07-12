import java.util.Scanner;

public class 2003 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        while (input.hasNextLine()) {
            
            String H = input.nextLine();

            int total = 60;

            total += Integer.parseInt(H.substring(0, 1)) * 60;

            total += Integer.parseInt(H.substring(2, 4));

            if (total > 480) 
                System.out.printf("Atraso maximo: %d%n", total - 480);

            else
                System.out.printf("Atraso maximo: 0%n");

        }

        input.close();
    }
}
