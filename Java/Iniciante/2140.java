import java.util.Scanner;

public class 2140 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] notasDisponiveis = {2, 5, 10, 20, 50, 100};

        int n = 1;
        int m = 1;
        int troco = 0;

        while(true) {

            boolean possivel = false;

            n = input.nextInt();
            m = input.nextInt();

            if(n == 0 && m == 0)
                break;

            troco = m - n;

            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    if(troco - notasDisponiveis[j] == notasDisponiveis[i]) {
                        possivel = true;
                    }
                }
            }

            System.out.println(possivel? "possible" : "impossible");
        }
    }
}
