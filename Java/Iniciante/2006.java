import java.util.Scanner;

public class 2006 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        int answer;

        int rightAnswers = 0;

        for (int i = 0; i < 5; i++) {

            answer = input.nextInt();

            if (answer == t)
                rightAnswers++;
        }

        System.out.println(rightAnswers);

        input.close();
    }
}
