import java.util.Scanner;

public class 1182 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float[][] M = new float[12][12];

        float sum = 0;
        
        int L = input.nextInt();

        char T = input.next().charAt(0);

        for (int i = 0; i < M.length; i++)

            for (int j = 0; j < M.length; j++) {

                M[i][j] = input.nextFloat();

                if (j == L)

                    sum += M[i][j];


        }

        if (T == 'S')
            System.out.printf("%.1f%n", sum);

        else
            System.out.printf("%.1f%n", sum / 12);


        input.close();
        

    }

}
