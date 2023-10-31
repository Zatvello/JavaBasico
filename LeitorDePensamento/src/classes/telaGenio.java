package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class telaGenio extends JFrame{
    private JPanel mainPanel;
    private JButton btnPalpite;
    private JSpinner txtVal;
    private JLabel lblFrase;


    public telaGenio() {
        setTitle("Leitor de Pensamento");
        setContentPane(mainPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(800, 530);
        lblFrase.setText("<html>Estou pensando em um número entre <strong>1 e 5</strong>.<p>Tente adivinhar</html>");
        btnPalpite.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int val = Integer.parseInt(txtVal.getValue().toString());
                //double rand = Math.random();
                int randomN = (int) (1 + Math.random() * (6-1));
                String resp;
                String r1 = "<html><strong>ACERTOU!</strong></html>";
                String r2 = "<html><strong>ERROU!</strong> Pensei em <strong>";
                resp = (val == randomN)?r1:r2 + randomN;
                lblFrase.setText(resp);

                lblFrase.setFont(new Font("Arial Black", Font.PLAIN, 15));

            }
        });
    }

    public static void main(String[] args) {
        new telaGenio();
    }
}
