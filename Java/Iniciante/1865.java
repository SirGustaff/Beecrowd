import java.util.Scanner;

public class 1865 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int c = input.nextInt();

        for (int i = 0; i < c; i++) {

            String name = input.next();

            int n = input.nextInt();

            if (name.equalsIgnoreCase("Thor"))
                System.out.println("Y");

            else
                System.out.println("N");
            
        }

        input.close();
        
    }
}
