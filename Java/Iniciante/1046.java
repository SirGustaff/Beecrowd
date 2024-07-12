import java.util.Scanner;

public class 1046 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int hour1, hour2, time;

        time = 0;
        hour1 = input.nextInt();
        hour2 = input.nextInt();

        if (hour1 >= hour2) {
            time = 24 - (hour1 - hour2);
            System.out.printf("O JOGO DUROU %d HORA(S)%n", time);
        }

        else if (hour2 >= hour1) {
            time = hour2 - hour1;
            System.out.printf("O JOGO DUROU %d HORA(S)%n", time);
        }

        input.close();
        
    }
}
