import java.util.Scanner;

public class 1146 {

    public static void main(String[] args) {

        int X;
        
        Scanner input = new Scanner(System.in);

        while ((X = input.nextInt()) != 0) {

            for (int i = 1; i <= X; i++) {

                if (i < X) 
                    System.out.print(i + " ");

                else 
                    System.out.print(i + "\n");

            }

        }

        input.close();

    }
}

/* Durante a realização desse exercício por várias vezes o beecrowd me retornou a mensagem "limite de tempo excedido", caso aconteça com você tente várias vezes e alguma hora ele vai aceitar */
