import java.util.Scanner;

public class 1332 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numTest = input.nextInt();

        for (int i = 0; i < numTest; i++) {

            String num = input.next();

            if (num.length() == 3) {

                if (num.startsWith("o") || num.endsWith("e"))
                    System.out.println("1");

                else 
                    System.out.println("2");

            }

            else
                System.out.println("3");
            
        }
        
        input.close();        

    }
}
