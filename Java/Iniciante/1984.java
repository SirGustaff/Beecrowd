import java.util.Scanner;

public class 1984 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        Long number = input.nextLong();

        String convertedNumber = number.toString();

        for (int i = -1; i >= -convertedNumber.length(); i--) {

            System.out.print(convertedNumber.charAt(convertedNumber.length() + i));

        }

        System.out.println();

        input.close();

    }
}
