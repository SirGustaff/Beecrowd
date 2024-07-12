import java.util.Scanner;

public class 1864 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String quote = "LIFE IS NOT A PROBLEM TO BE SOLVED";

        int n = input.nextInt();

        System.out.println(quote.substring(0, n));

        input.close();

    }
}
