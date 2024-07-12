import java.util.Scanner;

public class 1024 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        input.nextLine();

        for (int i = 0; i < n; i++) {
            String phrase = input.nextLine();

            convert(phrase);

        }
    }

    public static void convert(String phrase) {

        char[] convert = new char[phrase.length()];

        String converted = "";

        int div = phrase.trim().length();

            for (int j = 0, aux = convert.length - 1; j < convert.length; j++, aux--) {

                convert[j] = phrase.charAt(aux);

                if(Character.isAlphabetic(convert[j]))
                    convert[j] += 3;

                if(div / 2 <= j)
                    convert[j] -= 1;

                converted += convert[j];
            }

            System.out.println(converted);

        return;
    }
}
