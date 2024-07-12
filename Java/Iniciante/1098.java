
public class 1098 {

    public static void main(String[] args) {

        for (double I = 0, J = 1; I < 2.1; I = I + 0.2, J = J + 0.2) {

            if (I == 0 || I == 1 || (I <= 2.1 && I >= 1.9)) {

                System.out.printf("I=%.0f J=%.0f%n", I, J);
                System.out.printf("I=%.0f J=%.0f%n", I, J + 1);
                System.out.printf("I=%.0f J=%.0f%n", I, J + 2);

            }

            else {

                System.out.printf("I=%.1f J=%.1f%n", I, J);
                System.out.printf("I=%.1f J=%.1f%n", I, J + 1);
                System.out.printf("I=%.1f J=%.1f%n", I, J + 2);

            }
        }       
    }
}
