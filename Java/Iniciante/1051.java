import java.util.Scanner;

public class 1051 {

    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    
    float tax1, tax2, tax3;

    float salary = input.nextFloat();

    if (salary <= 2000)
        System.out.printf("Isento%n");
    
    else {

        if (salary > 2000 && salary <= 3000) {

            tax1 = (salary - 2000) * 0.08f;

            System.out.printf("R$ %.2f%n", tax1);
        }

        else if (salary > 3000 && salary <= 4500) {

            tax1 = 1000 * 0.08f;

            tax2 = (salary - 3000) * 0.18f;

            System.out.printf("R$ %.2f%n", tax1 + tax2);
        }   

        else if (salary > 4500) {

            tax1 = 1000 * 0.08f;

            tax2 = 1500 * 0.18f;

            tax3 = (salary - 4500) * 0.28f;

            System.out.printf("R$ %.2f%n", tax1 + tax2 + tax3);

        }

    }

    input.close();

    } 
}
