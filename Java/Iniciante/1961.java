import java.util.Scanner;

public class 1961 {
 
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);

        int jumpHeight = input.nextInt();

        int numPipes = input.nextInt();

        int currentPipe = input.nextInt();

        for (int i = 0; i < numPipes - 1; i++) {

            int nextPipe = input.nextInt();

            if (Math.abs(currentPipe - nextPipe) <= jumpHeight) 
            
                currentPipe = nextPipe;

            else {

                System.out.println("GAME OVER");

                System.exit(0);

            }
            
        }

        System.out.println("YOU WIN");

        input.close();
        
    }

}
