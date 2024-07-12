import java.util.Scanner;

public class 1188 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Double[][] M = new Double[12][12];

        char operation = input.next().charAt(0);

        double sum = 0;

        for (int i = 0; i < M.length; i++)
            for (int j = 0; j < M.length; j++)
                M[i][j] = input.nextDouble();

        for (int i = 7; i < 12; i++)
            for (int j = i - 1; j > 11 - i; j--)
                sum += M[i][j];

        if (operation == 'S')
            System.out.printf("%.1f%n", sum);
    
        else
            System.out.printf("%.1f%n", sum / 30);

        input.close();
        
    }

}
