import java.util.Scanner;

public class 1120 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        byte d = input.nextByte();
        String n = input.next();

        while (d != 0 && n != "0") {

            System.out.printf("%s%n", digitError(n, d));

            d = input.nextByte();
            n = input.next();

        }
    }

    public static String digitError(String n, byte d) {

        n = n.replaceAll(Byte.toString(d), "");

        while(n.startsWith("0")) {
            n = n.replaceFirst("0", "");
        }

        if(n.isEmpty())
            n = "0";

        return n;
    }
}
