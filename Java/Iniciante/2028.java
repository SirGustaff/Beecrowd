import java.util.Scanner;

public class 2028 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int caseNumber = 1;

        int num, quantityNum;

        while (input.hasNext()) {

            num = input.nextInt();

            quantityNum = 1;

            String seq = "0 ";

            for (int i = 0; i < num + 1; i++) {

                for (int j = 0; j < i; j++) {

                    seq += i + " ";

                    quantityNum++;
                        
                }

            }

            System.out.printf("Caso %d: %d numero%s%n", caseNumber, quantityNum, (quantityNum == 1? "" : "s"));

            System.out.printf("%s%n%n", seq);

            caseNumber++;
        }

        input.close();

    }
}
