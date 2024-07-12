import java.util.Scanner;

public class 1930 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int t1 = input.nextInt() - 1;
        int t2 = input.nextInt() - 1;
        int t3 = input.nextInt() - 1;
        int t4 = input.nextInt();

        System.out.printf("%d%n", t1 + t2 + t3 + t4);

        input.close();
        
    }
}
