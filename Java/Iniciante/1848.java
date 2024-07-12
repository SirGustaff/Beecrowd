import java.util.Scanner;

public class 1848 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] binaryNumbers = {

            "---",
            "--*",
            "-*-",
            "-**",
            "*--",
            "*-*",
            "**-",
            "***"

        };

        int soma = 0;

        for (int i = 0; i < 3;) {
            
            String number = input.nextLine();

            if (number.equals("caw caw")) {

                System.out.println(soma);

                i++;

                soma = 0;

            }

            else {

                for (int j = 0; j < binaryNumbers.length; j++) {

                    if (number.equals(binaryNumbers[j])) {

                        soma += j;

                    }
                    
                }

            }

        }

        input.close();

    }

}
