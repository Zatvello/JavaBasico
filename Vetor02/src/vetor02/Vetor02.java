package vetor02;

import java.time.Year;

public class Vetor02 {

    public static void main(String[] args) {
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int anoatual = 2020;

        if (anoatual % 4 == 0) { // Verificando se o ano é bissexto
            if (anoatual % 100 != 0) {
                tot[1] = 29;
            }
        }

        for (int c = 0; c < mes.length; c++) {
            System.out.println("O mês " + mes[c] + " tem " + tot[c] + " dias ao todo.");
        }
    }
}
