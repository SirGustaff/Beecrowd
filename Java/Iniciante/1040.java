import java.util.Scanner;

public class 1040 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float N1, N2, N3, N4, media, N5;
        
        N1 = input.nextFloat();
        N2 = input.nextFloat();
        N3 = input.nextFloat();
        N4 = input.nextFloat();

        media = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10;

        System.out.printf("Media: %.1f%n" , media);

        if (media >= 7.0)
            System.out.printf("Aluno aprovado.%n");
        
        else if (media < 5.0)
            System.out.printf("Aluno reprovado.%n");

        else {
            System.out.printf("Aluno em exame.%n");
            N5 = input.nextFloat();
            System.out.printf("Nota do exame: %.1f%n", N5);
            media = (media + N5) / 2;

            if (media >= 5)
                System.out.printf("Aluno aprovado.%n");
            
            else
                System.out.printf("Aluno reprovado.%n");
            
            System.out.printf("Media final: %.1f%n", media);
            
        }
    
    input.close();
        
    }
}
