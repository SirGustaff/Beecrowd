import java.util.Scanner;

public class 1101 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int M = input.nextInt();

        int N = input.nextInt();

        while (M > 0 && N > 0) {

            int sum = 0;

            if (M >= N) {

                for (; M >= N; ++N) {
            
                System.out.print(N + " ");

                sum += N;

                }
            }

            else if (N >= M) {

                for(; N >= M; ++M) {

                    System.out.print(M + " ");

                    sum +=M;

                }
            }

            System.out.println("Sum="+sum);

            M = input.nextInt();

            N = input.nextInt();
        
        }       

        input.close();

    }
}
