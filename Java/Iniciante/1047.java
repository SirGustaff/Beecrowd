import java.util.Scanner;

public class 1047 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int initialHour, finalHour, initialMinute, finalMinute, total1, total2, time;

        initialHour = input.nextInt();
        initialMinute = input.nextInt();
        finalHour = input.nextInt();
        finalMinute = input.nextInt();

        total1 = (initialHour * 60) + initialMinute;

        total2 = (finalHour * 60) + finalMinute;

        if (total2 > total1) {
            time = total2 - total1;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", (time / 60), (time % 60));
        }

        else if (total1 > total2) {
            time = 1440 - (total1 - total2);
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", (time / 60), (time % 60));
        }

        else {
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", 24, 0);
        }

    input.close();

    }
}
