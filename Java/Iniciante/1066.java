import java.util.Scanner;

public class 1066 {

    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);

    int numbers, countEven, countOdd, countPostive, countNegative, countNumbers;

    countEven = 0;
    countOdd = 0;
    countPostive = 0;
    countNegative = 0;

    numbers = 0;

    countNumbers = 1;

    while (countNumbers <= 5) {

        numbers = input.nextInt();

        if (numbers % 2 == 0)
            ++countEven;

        else 
            ++countOdd;
        
        if (numbers > 0)
            ++countPostive;
        
        else if (numbers < 0) 
            ++countNegative;

        ++countNumbers;
    }

    System.out.println(countEven + " valor(es) par(es)");
    System.out.println(countOdd + " valor(es) impar(es)");
    System.out.println(countPostive + " valor(es) positivo(s)");
    System.out.println(countNegative + " valor(es) negativo(s)");

    input.close();

    }

}
