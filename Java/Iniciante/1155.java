public class 1155 {

    public static void main(String[] args) {

        float divider = 1, sum = 0;

        while (divider <= 100) {

            sum += 1/divider;

            divider++;

        }

        System.out.printf("%.2f%n", sum);
        
    }
}
