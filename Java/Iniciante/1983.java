import java.util.Scanner;

public class 1983 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int theChosen = input.nextInt();

        float highestGrade = 0;

        Integer[] studentNumber = new Integer[theChosen];

        Float[] studentGrade = new Float[theChosen];

        for (int i = 0; i < studentNumber.length; i++) {

            studentNumber[i] = input.nextInt();

            studentGrade[i] = input.nextFloat();
            
        }

        theChosen = 0;

        for (int i = 0; i < studentGrade.length; i++) {

            if (studentGrade[i] > highestGrade) {

                highestGrade = studentGrade[i];

                theChosen = studentNumber[i];

            }

        }

        if (highestGrade >= 8) System.out.println(theChosen);

        else System.out.println("Minimum note not reached");

        input.close();
        
    }
}
