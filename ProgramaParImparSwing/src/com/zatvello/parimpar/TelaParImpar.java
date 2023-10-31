package com.zatvello.parimpar;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaParImpar extends JFrame{
    private JPanel mainPanel;
    private JTextField txtValor;
    private JButton btnVerificar;
    private JLabel lblResultado;

    public TelaParImpar() {
        setTitle("Verificador de Par ou Ímpar");
        setContentPane(mainPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(500, 300);
        btnVerificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int v = Integer.parseInt(txtValor.getText());
                if (v % 2 == 0) {
                    lblResultado.setText("Número Par");
                } else {
                    lblResultado.setText("Número Ímpar");
                }
            }
        });
    }

    public static void main(String[] args) {
        new TelaParImpar();
    }
}
