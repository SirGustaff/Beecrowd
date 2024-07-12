public class 1156 {

    public static void main(String[] args) {

        float sum = 1;

        for (float i = 3, j = 2; i <= 39; i += 2, j *= 2)
            sum += i/j;

        System.out.printf("%.2f%n", sum);
            
    }
}
