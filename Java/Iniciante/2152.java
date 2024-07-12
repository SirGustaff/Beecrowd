import java.util.Scanner;

public class 2152 {
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int qtdTestes = input.nextInt();

        for(int i = 0; i < qtdTestes; i++) {

            int h = input.nextInt();
            int m = input.nextInt();
            int o = input.nextInt();

            System.out.printf("%02d:%02d - %s%n", h, m, o == 1? "A porta abriu!" : "A porta fechou!");

        }
    
    }
}
