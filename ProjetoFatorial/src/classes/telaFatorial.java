package classes;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class telaFatorial extends JFrame {
    private JSpinner txtN;
    private JLabel lblFat;
    private JPanel mainPanel;
    private JLabel lblF;
    private JLabel lblC;
    private JLabel lblRF;
    private JLabel lblCalc;
    private JLabel lblRCalc;

    public telaFatorial() {
        setTitle("Fatorial");
        setContentPane(mainPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(1020, 500);
        txtN.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int n = Integer.parseInt(txtN.getValue().toString());
                int f = 1;
                int c = n;
                String calc = "";
                String calcR = "";

                while (c >= 1) { // É possível otimizar, substituindo por > 1 ao invés de >= 1.
                    System.out.print(f + "*" + c);
                    f = f * c;  // 1*3 = 3 -> c-- = 2 -> 3*2 = 6. f = 6 -> c-- = 1 -> 6 * 1 = f = 6
                                // 1(f)*4(c) = (f)4 -> c-- = 3. 4*3 = (f)12 -> c-- = 2. 12*2 = (f)=24 -> c-- = 1. (f)24 * 1(c) = (f)24. c-- = 0.
                                // 1(f)*5(c) = (f)5 -> c-- = 4. (f)5*4(c) = 20(f). c-- = 3. 20(f)*3(c) = 60(f). c-- = 2(c). 60(f)*2(c) = 120(f). c-- = 1(c). 120(f)*1(c) == 120(f). c-- = 0(c).
                    System.out.println(" = " + f);
                    c--;

                    if (c >= 1) {
                        if (f >= n) { // Condição para exibir apenas o fatorial de 2 pra cima
                            calcR = calcR + " = " + "("+ f + ")" ;
                            lblRCalc.setText(calcR); // Exibe o resultado de cada valor multiplicado
                        }
                        calc = calc + " x " + c; // Mostra os valores que serão multiplicados
                    }
                }
                lblCalc.setText(n + calc);
                lblFat.setText(" = " + f);

            }
        });
    }

    public static void main(String[] args) {

        new telaFatorial();
    }
}
