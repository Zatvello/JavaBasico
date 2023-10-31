package classes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class telaCalc extends JFrame{
    private JPanel MainPanel;
    private JSpinner txtNum;
    private JButton btnCalc;
    private JLabel lblRes;
    private JLabel lblCubo;
    private JLabel lblRQuad;
    private JLabel lblRCub;
    private JLabel lblAbs;
    private JPanel panCalc;

    public telaCalc() {
        setTitle("Super Calculadora");
        setContentPane(MainPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(500, 530);
        panCalc.setVisible(false);
        btnCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Resto da divisão por 2
                int num = Integer.parseInt(txtNum.getValue().toString());
                int res = num % 2;
                lblRes.setText(Integer.toString(res));

                // Elevado ao Cubo
                double c = Math.pow(num, 3);
                lblCubo.setText(Double.toString(c));
                panCalc.setVisible(true);

                // Raiz Quadrada
                double r = Math.sqrt(num);
                lblRQuad.setText(String.format("%.2f", r));

                // Raiz Cúbica
                double rcub = Math.cbrt(num);
                lblRCub.setText(String.format("%.2f", rcub));

                // Valor Absoluto
                int abs = Math.abs(num);
                lblAbs.setText(Integer.toString(abs));
            }
        });
    }

    public static void main(String[] args) {
        new telaCalc();
    }
}
