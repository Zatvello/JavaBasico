package contador;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaContador extends JFrame {
    private JPanel mainPanel;
    private JLabel lblContagem;
    private JButton btnContar;

    public TelaContador() {
        setTitle("Contador");
        setContentPane(mainPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(270, 100);
        btnContar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int cc = 0;
                String contagem = "";
                while (cc <= 10) {
                    contagem += cc + " ";
                    //contagem = contagem + cc + " ";
                    cc++;
                    lblContagem.setText(contagem);
                }
            }
        });
    }

    public static void main(String[] args) {
        new TelaContador();
    }
}
