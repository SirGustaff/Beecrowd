import java.util.Scanner;

public class 1924 {
 
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        
        String[] cursos = new String[n];
        
        for (int i = 0; i < n; i++)
            cursos[i] = input.nextLine();
            
        System.out.println("Ciencia da Computacao");
        
        input.close();
 
    }
 
}
