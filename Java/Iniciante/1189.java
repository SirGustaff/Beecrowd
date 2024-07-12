import java.util.Scanner;

public class 1189 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Double[][] M = new Double[12][12];

        char operation = input.next().charAt(0);

        double sum = 0;

        for (int i = 0; i < M.length; i++)
            for(int j = 0; j < M.length; j++)
                M[i][j] = input.nextDouble();

        for (int i = 1; i <= 10; i++)
            for (int j = 0; j < i && j < 12 - i - 1; j++)
                sum += M[i][j];

        if (operation == 'S')
            System.out.printf("%.1f%n", sum);

        else
            System.out.printf("%.1f%n", sum / 30);

        input.close();

    }

}
