import java.util.Scanner;

public class 2146 {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        while(input.hasNext()) {
            int senha = input.nextInt();
            System.out.println(senha - 1);
        }
       
    }
}
