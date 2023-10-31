package com.zatvello.operadores;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaValores extends JFrame{
    private JTextField txtNum;
    private JTextField txtDen;
    private JButton btnDividir;
    private JLabel lblDiv;
    private JLabel lblRes;
    private JPanel MainPanel;

    public TelaValores() {
        setTitle("Tela Valores");
        setContentPane(MainPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(500, 500);
        btnDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            int n = Integer.parseInt(txtNum.getText());
            int d = Integer.parseInt(txtDen.getText());
            float div = (float) n/d;
            //float resto = (float) n%d; // Resto da Divisão
            float res = (float) Math.sqrt(n); // Raiz Quadrada

            lblDiv.setText(Float.toString(div));
            lblRes.setText(Float.toString(res));
            }
        });
    }

    public static void main(String[] args) {
        new TelaValores();
    }
}
