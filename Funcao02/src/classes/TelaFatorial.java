package classes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaFatorial extends JFrame {
    private JPanel mainPanel;
    private JSpinner txtNum;
    private JButton btnCalc;
    private JLabel lblFormula;
    private JLabel lblResultado;
    private JLabel lblCalcR;

    public TelaFatorial() {
        setTitle("Fatorial POO");
        setContentPane(mainPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(420, 400);
        lblFormula.setVisible(false);
        lblResultado.setVisible(false);
        lblCalcR.setVisible(false);

        btnCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Fatorial f = new Fatorial();
                int num = Integer.parseInt(txtNum.getValue().toString());

                f.setValor(num);
                lblFormula.setText(f.getFormula());
                lblResultado.setText(Integer.toString(f.getFatorial()));
                lblCalcR.setText(f.getCalcR());

                lblFormula.setVisible(true);
                lblResultado.setVisible(true);
                lblCalcR.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        new TelaFatorial();
    }
}
