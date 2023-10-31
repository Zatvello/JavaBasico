package com.zatvello.soma;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaSoma extends JFrame{
    private JTextField txtN1;
    private JTextField txtN2;
    private JPanel MainPanel;
    private JButton btnSoma;
    private JLabel lblResultado;

    public TelaSoma() {
        setTitle("Soma");
        setContentPane(MainPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(500, 100);
        btnSoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n1 = Integer.parseInt(txtN1.getText());
                int n2 = Integer.parseInt(txtN2.getText());
                int soma = n1 + n2;
                lblResultado.setText(Integer.toString(soma));

            }
        });
    }

    public static void main(String[] args) {
        new TelaSoma();
    }
}
