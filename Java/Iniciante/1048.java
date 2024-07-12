import java.util.Scanner;

public class 1048 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float salary, newSalary, adjustment;
        int percentage;
    

        salary = input.nextFloat();

        if (salary >= 0 && salary <= 400 ) {
            adjustment = (salary/100) * 15;
            newSalary = salary + adjustment;
            percentage = 15;
        }
        
        else if (salary > 400 && salary <= 800) {
            adjustment = (salary/100) * 12;
            newSalary = salary + adjustment;
            percentage = 12;
        }

        else if (salary > 800 && salary <= 1200) {
            adjustment = (salary/100) * 10;
            newSalary = salary + adjustment;
            percentage = 10;
        }

        else if (salary > 1200 && salary <= 2000) {
            adjustment = (salary/100) * 7;
            newSalary = salary + adjustment;
            percentage = 7;
        }

        else {
            adjustment = (salary/100) * 4;
            newSalary = salary + adjustment;
            percentage = 4;
        }

            System.out.printf("Novo salario: %.2f%n", newSalary);
            System.out.printf("Reajuste ganho: %.2f%n", adjustment);
            System.out.println("Em percentual: " + percentage + " %");

        input.close();
        
    }
   
}
