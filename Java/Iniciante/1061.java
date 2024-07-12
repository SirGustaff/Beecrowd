import java.util.Scanner;

public class 1061 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] dayI = input.nextLine().split(" ");
        
        String[] hi = input.nextLine().replaceAll(" ", "").split(":");

        String[] dayF = input.nextLine().split(" ");

        String[] hf = input.nextLine().replaceAll(" ", "").split(":");

        int timeT = (Integer.parseInt(dayF[1]) * 86400 + Integer.parseInt(hf[0]) * 3600 + Integer.parseInt(hf[1]) * 60 + Integer.parseInt(hf[2])) - (Integer.parseInt(dayI[1]) * 86400 + Integer.parseInt(hi[0]) * 3600 + Integer.parseInt(hi[1]) * 60 + Integer.parseInt(hi[2]));
        
        System.out.printf("%d dia(s)%n", timeT / 86400);

        System.out.printf("%d hora(s)%n", (timeT % 86400) / 3600);

        System.out.printf("%d minuto(s)%n", ((timeT % 86400) % 3600) / 60);

        System.out.printf("%d segundo(s)%n", ((timeT % 86400) % 3600) % 60);


        input.close();

    }
}
