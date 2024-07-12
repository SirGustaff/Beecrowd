import java.util.Scanner;

public class 1985 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int quantityP = input.nextInt();

        float total = 0f;

        for (int i = 0; i < quantityP; i++) {

            int productNum = input.nextInt();

            int buyedNum = input.nextInt();

            switch (productNum) {
                case 1001:
                    total += buyedNum * 1.5f;
                    break;
                case 1002:
                    total += buyedNum * 2.5f;
                    break;
                case 1003:
                    total += buyedNum * 3.5f;
                    break;
                case 1004:
                    total += buyedNum * 4.5f;
                    break;
                case 1005:
                    total += buyedNum * 5.5f;
                    break;
                default:
                    break;
            }
        }

        System.out.printf("%.2f%n", total);

        input.close();
    }
}
