import java.util.Scanner;

public class 1117 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        float grade;
        float media = 0;

        for (int i = 0; i < 2;) {

            grade = input.nextFloat();

            if (grade < 0 || grade > 10) 
                System.out.println("nota invalida");

                else {
                    media += grade;
                    i++;
                }
        }

        System.out.println("media = "+ media / 2);

        input.close();
    }
    
}
