package exerciciorepita;

import javax.swing.JOptionPane;

public class ExercicioRepita {

    public static void main(String[] args) {

        int n;
        int totV = 0;
        int totVPar = 0;
        int totVImpar = 0;
        int tot100 = 0;
        int somaV = 0;
        float media;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um valor\n" + "(0 interrompe)"));
            JOptionPane.showMessageDialog(null, "Você digitou o valor " + n);

            if (n != 0) {
                totV++;
                somaV += n;

                if (n % 2 == 0) {
                    totVPar++;

                } else {
                    totVImpar++;
                }

                if (n > 100) {
                    tot100++;
                }
            }

        } while (n != 0);
        media = (float) somaV/totV;
        JOptionPane.showMessageDialog(null, "Resultado: \n" + "-------------------------------\n" + "Total de Valores: " + totV + "\nTotal de Pares: " + totVPar + "\nTotal de Ímpares: " + totVImpar + "\nAcima de 100: " + tot100 + "\nMédia dos Valores: " + media + JOptionPane.WARNING_MESSAGE);
    }
}
