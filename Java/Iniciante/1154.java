import java.util.Scanner;

public class 1154 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int age = input.nextInt();

        float total = 0, quantity = 0;

        while (age >= 0) {

            total += age;

            quantity++;

            age = input.nextInt();

        }

        System.out.printf("%.2f%n", total / quantity);

        input.close();
    }
}
