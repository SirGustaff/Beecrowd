import java.util.Scanner;

public class 2060 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int quantidadeDeNumerosDaLista = input.nextInt();

        int[] listaDeNumeros = new int[quantidadeDeNumerosDaLista];

        for (int i = 0; i < listaDeNumeros.length; i++) {
            listaDeNumeros[i] = input.nextInt();
        }

        checarMultiplicidade(listaDeNumeros);

        input.close();
    }

    public static void checarMultiplicidade(int[] listaDeNumeros) {

        int[] listaMultiplicidade = new int[4];

        for (int i = 0; i < listaDeNumeros.length; i++) {

            if(listaDeNumeros[i] % 2 == 0)
                listaMultiplicidade[0] += 1;

            if(listaDeNumeros[i] % 3 == 0)
                listaMultiplicidade[1] += 1;

            if(listaDeNumeros[i] % 4 == 0)
                listaMultiplicidade[2] += 1;

            if(listaDeNumeros[i] % 5 == 0)
                listaMultiplicidade[3] += 1;

        }

        for (int i = 0; i < listaMultiplicidade.length; i++) {
            System.out.printf("%d Multiplo(s) de %d%n", listaMultiplicidade[i], i + 2);
        }
    }
}
