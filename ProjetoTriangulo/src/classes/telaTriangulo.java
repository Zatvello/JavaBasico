package classes;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class telaTriangulo extends JFrame {
    private JPanel mainPanel;
    private JSlider sliA;
    private JSlider sliB;
    private JSlider sliC;
    private JButton btnVerificar;
    private JLabel lblA;
    private JLabel lblB;
    private JLabel lblC;
    private JPanel panResposta;
    private JLabel lblStatus;
    private JLabel lblTipo;

    public telaTriangulo() {
        setTitle("Tipos de Triângulo");
        setContentPane(mainPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(700, 500);
        panResposta.setVisible(false);
        btnVerificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = sliA.getValue();
                int b = sliB.getValue();
                int c = sliC.getValue();

                if ((a < b + c) && (b < a + c) && (c < a + b)) { // Para se formar um triângulo, cada lado precisa ser menor que a soma dos outros dois lados
                    lblStatus.setText("Formam um triângulo");
                    if ((a == b) && (b == c)) { // 3 lados iguais
                        lblTipo.setText("Equilátero");

                    } else if ((a != b) && (b != c) && (a != c)) // 3 lados diferentes
                    {
                        lblTipo.setText("Escaleno");
                    } else { // Pelo menos 2 lados com a mesma medida (congruentes)
                        lblTipo.setText("Isósceles");
                    }
                }
                else {
                    lblStatus.setText("Não formam um triângulo");
                    lblTipo.setText("-");
                }

                panResposta.setVisible(true);
            }
        });
        sliA.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblA.setText(Integer.toString(sliA.getValue()));

            }
        });
        sliB.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblB.setText(Integer.toString(sliB.getValue()));
            }
        });
        sliC.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblC.setText(Integer.toString(sliC.getValue()));
            }
        });
    }

    public static void main(String[] args) {
        new telaTriangulo();
    }
}
