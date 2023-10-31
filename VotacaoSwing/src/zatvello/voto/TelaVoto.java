package zatvello.voto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaVoto extends JFrame {
    private JPanel mainPanel;
    private JTextField txtAno;
    private JButton btnVoto;
    private JLabel lblR;
    private JLabel lblI;

    public TelaVoto() {
        setTitle("Votação");
        setContentPane(mainPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(250, 300);
        btnVoto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            int ano = Integer.parseInt(txtAno.getText());
            int idade = 2023 - ano;
            lblI.setText(Integer.toString(idade));
            if (idade < 16 ) {
                lblR.setText("Não Vota!");
            }
                else if ((idade >= 16 && idade <=18) || (idade > 70)) {
                    lblR.setText("Voto Opcional");
                } else {
                    lblR.setText("Voto Obrigatório");
                }
            }

        });
    }

    public static void main(String[] args) {
        new TelaVoto();
    }
}
