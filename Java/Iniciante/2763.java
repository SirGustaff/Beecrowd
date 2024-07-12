import java.util.Scanner;

public class 2763 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String CPF[] = input.next().replaceAll("-", "\\.").split("\\.");

        for (String i : CPF)
            System.out.println(i);

        input.close();
        
    }
}
