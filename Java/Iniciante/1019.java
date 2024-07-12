import java.util.Scanner;

public class 1019 {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        int seconds = input.nextInt();

        int hours = seconds / 3600;

        int minutes = (seconds % 3600) / 60;

        seconds = (seconds % 3600) % 60;
        
    System.out.printf("%d:%d:%d%n", hours, minutes, seconds);

    input.close();

    }

}
