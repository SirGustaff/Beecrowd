import java.util.Scanner;

public class 2126 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String n1 = "";
        String n2 = "";

        int numeroDoCaso = 1;
        int posicaoUltimaSequencia = 0;
        int quantidadeSubsequencias = 0;
        int ultimaPosicao = 0;

        while (input.hasNext()) {

            n1 = input.nextLine();
            n2 = input.nextLine();
            
            if(checarSeContem(n1, n2)) {

                posicaoUltimaSequencia = n2.lastIndexOf(n1) + 1;

                while (ultimaPosicao != -1) {

                    quantidadeSubsequencias++;

                    n2 = n2.substring(n2.indexOf(n1) + 1);

                    ultimaPosicao = n2.lastIndexOf(n1);

                }

                detalhes(numeroDoCaso, quantidadeSubsequencias, posicaoUltimaSequencia);
            } 
            
            else {
                detalhes(numeroDoCaso);
            }

            quantidadeSubsequencias = 0;
            ultimaPosicao = 0;
            numeroDoCaso++;
        }

        input.close();

    }

    public static boolean checarSeContem(String n1, String n2) {
        return n2.contains(n1);
    } 

    public static void detalhes(int numeroDoCaso) {
        System.out.printf("Caso #%d:%n", numeroDoCaso);
        System.out.println("Nao existe subsequencia");
        System.out.println();
    }

    public static void detalhes(int numeroDoCaso, int quantidadeSubsequencias, int posicaoUltimaSequencia) {
        System.out.printf("Caso #%d:%n", numeroDoCaso);
        System.out.printf("Qtd.Subsequencias: %d%n", quantidadeSubsequencias);
        System.out.printf("Pos: %d%n", posicaoUltimaSequencia);
        System.out.println();

    }

}
