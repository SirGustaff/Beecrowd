import java.util.Scanner;

public class 1541 {
 
    public static void main(String[] args) {
 
    Scanner input = new Scanner(System.in);

    double a = 1; 
    double b; 
    double c; 
    double size;

    while (a != 0) {

    a = input.nextInt();

    if (a == 0)
        break;

    b = input.nextInt();

    if (b == 0)
        break;

    c = input.nextInt();

    if (c == 0)
        break;

    if (c == 100){
        size = Math.sqrt(a * b);
        size = Math.floor(size);
    }

    else {
        size = (a * b * 100)/c;
        size = Math.sqrt(size);
        size = Math.floor(size);
    }

    System.out.printf("%.0f%n", size);

    } 

    input.close();

    }
 
}
