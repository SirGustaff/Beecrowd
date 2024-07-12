import java.util.Scanner;

public class 1114 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       int password;

       do {

        password = input.nextInt();

        if (password != 2002)
            System.out.println("Senha Invalida");

       } while (password != 2002);

       System.out.println("Acesso Permitido");

       input.close();

    }
}
