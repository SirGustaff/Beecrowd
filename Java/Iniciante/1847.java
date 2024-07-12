import java.util.Scanner;

public class 1847 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        int b = input.nextInt();

        int c = input.nextInt();

        if (b < a && c >= b )
                System.out.println(":)");

        else if (b > a && c > b && (c - b) >= (b - a))
                System.out.println(":)");

        else if (b < a && c < b && (b - c) < (a - b))
                System.out.println(":)"); 

        else if (b == a && c > b)
            System.out.println(":)"); 

        else    
            System.out.println(":("); 
            
        input.close();

    }
}
