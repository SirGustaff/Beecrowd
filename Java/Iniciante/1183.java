import java.util.Scanner;

public class 1183 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Float[][] M = new Float[12][12];

        char operation = input.next().charAt(0);

        float sum = 0;

        for (int i = 0; i < M.length; i++)
            for (int j = 0; j < M.length; j++)
                M[i][j] = input.nextFloat();

        for(int i = 0; i < M.length; i++)
            for (int j = 11; j > i; j--)
                sum += M[i][j];

        if (operation == 'S')
            System.out.printf("%.1f%n", sum);
    
        else
            System.out.printf("%.1f%n", sum / 66);

        input.close();
        
    }

}
