package telaEquacao;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class telaEquacao extends JFrame {
    private JPanel mainPanel;
    private JSpinner txtA;
    private JSpinner txtB;
    private JSpinner txtC;
    private JButton btnCalc;
    private JLabel lblB;
    private JLabel lblA;
    private JLabel lblC;
    private JPanel panResultado;
    private JLabel lblDelta;
    private JLabel lblRaiz;

    public telaEquacao() {
        setTitle("Equação Segundo Grau");
        setContentPane(mainPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(500, 300);
        panResultado.setVisible(false);
        btnCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(txtA.getValue().toString());
                int b = Integer.parseInt(txtB.getValue().toString());
                int c = Integer.parseInt(txtC.getValue().toString());

                double delta;
                delta = (Math.pow(b,2)) -4* a*c;
                lblDelta.setText(String.format("%.1f", delta));

                if (delta >= 0) {
                    lblRaiz.setText("Existem raízes Reais");
                }
                else {
                    lblRaiz.setText("Não existem raízes Reais");
                }

                panResultado.setVisible(true);
            }
        });

        txtA.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblA.setText(txtA.getValue().toString());
            }
        });
        txtB.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblB.setText(txtB.getValue().toString());
            }
        });
        txtC.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblC.setText(txtC.getValue().toString());
            }
        });
    }

    public static void main(String[] args) {
        new telaEquacao();
    }
}
