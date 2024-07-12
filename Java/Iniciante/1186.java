import java.util.Scanner;

public class 1186 {
 
    public static void main(String[] args) {
 
    Scanner input = new Scanner(System.in);

    String operation = input.nextLine();

    float soma = 0;
    float[][] M = new float [12][12];

    for (int i = 0; i < 12; i++)
        for (int j = 0; j < 12; j++)
        M [i][j] = input.nextFloat();

    for(int i = 1; i <= 11; i++)
        for(int j = 11; j>11-i; j--)
            soma += M[i][j];

    if(operation.equalsIgnoreCase("S") )
        System.out.printf("%.1f%n",soma);

    else if (operation.equalsIgnoreCase("M"))
        System.out.printf("%.1f%n",soma/66);


    input.close();

    }
}
