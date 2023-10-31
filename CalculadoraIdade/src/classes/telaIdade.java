package classes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Year;

public class telaIdade extends JFrame {
    private JSpinner txtAN;
    private JPanel MainPanel;
    private JButton btnCalc;
    private JLabel lblIdade;
    private JLabel lblAno;

    public telaIdade() {
        setTitle("Calculadora Idade");
        setContentPane(MainPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(1050, 300);

        int anoAtual = Year.now().getValue();
        lblAno.setText(Integer.toString(anoAtual));

        btnCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int an = Integer.parseInt(txtAN.getValue().toString());
                int calcIdade = anoAtual - an;
                lblIdade.setText(Integer.toString(calcIdade));
            }
        });
    }

    public static void main(String[] args) {
        new telaIdade();
    }
}
