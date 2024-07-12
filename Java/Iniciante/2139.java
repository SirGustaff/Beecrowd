import java.util.Scanner;

public class 2139 {

    static int[] mesesDoAno = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 25};

    public static void main(String[] args) {

        int mesAtual = 0;
        int diaAtual = 0;
        int diasParaNatal = 0;

        Scanner input = new Scanner(System.in);

        while(input.hasNext()) {

            mesAtual = input.nextInt() - 1;
            diaAtual = input.nextInt();

            diasParaNatal = checharQuantoTempoFaltaNatal(mesAtual, diaAtual);

            if(diasParaNatal == 0) 
                System.out.println("E natal!");

            else if(diasParaNatal < 0) 
                System.out.println("Ja passou!");

            else if(diasParaNatal == 1)
                System.out.println("E vespera de natal!");
            
            else 
                System.out.printf("Faltam %d dias para o natal!%n", diasParaNatal);
        }

        input.close();

    }

    public static int checharQuantoTempoFaltaNatal(int mesAtual, int diaAtual) {

        int diasParaFimDoMes = mesesDoAno[mesAtual] - diaAtual;

        int diasParaNatal = diasParaFimDoMes;

        for (int i = mesAtual + 1; i < mesesDoAno.length; i++) {

            diasParaNatal += mesesDoAno[i];
            
        }

        return diasParaNatal;
    }
}
