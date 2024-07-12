import java.util.Scanner;

public class 1013 {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt(); 
        int b = input.nextInt();
        int c = input.nextInt();
        
    
        int MaiorAB = ( a + b + Math.abs( a - b )) / 2;

        int MaiorABC = ( MaiorAB + c + Math.abs( MaiorAB - c )) / 2;

        System.out.println(MaiorABC + " eh o maior");

        input.close();

    }
    
}
