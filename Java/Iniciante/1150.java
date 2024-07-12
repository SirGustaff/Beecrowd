import java.util.Scanner;

public class 1150 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);


        int X = input.nextInt();

        int Z = input.nextInt();

        int sum = 0;

        while (Z <= X) 
            Z = input.nextInt();

        for (int i = X; i <= Z; i += X + 1) {
            sum++;
        }

        System.out.println(sum);

        input.close();
    }
}
