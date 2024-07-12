import java.util.Scanner;

public class 2057 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int horaDeSaida = input.nextInt();
        int tempoDeViagem = input.nextInt();
        int fusoHorarioRelacaoOrigem = input.nextInt();

        System.out.println(calcularHoraChegada(horaDeSaida, tempoDeViagem, fusoHorarioRelacaoOrigem));


        input.close();
    }

    public static int calcularHoraChegada(int horaDeSaida, int tempoDeViagem, int fusoHorarioRelacaoOrigem) {

        final int QUANTIDADE_HORAS_DIA = 24;

        int horaDeChegada = 0;

        horaDeChegada = horaDeSaida + tempoDeViagem + fusoHorarioRelacaoOrigem;

        if(horaDeChegada > QUANTIDADE_HORAS_DIA)
            horaDeChegada -= QUANTIDADE_HORAS_DIA;

        else if(horaDeChegada < 0)
            horaDeChegada += QUANTIDADE_HORAS_DIA;

        else if(horaDeChegada == QUANTIDADE_HORAS_DIA)
            horaDeChegada = 0;
        
        return horaDeChegada;                  
    }
}
