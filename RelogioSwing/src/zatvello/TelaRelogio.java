package zatvello;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class TelaRelogio {
    private JPanel MainPanel;
    private JButton btnHora;
    private JLabel lblHora;

    public TelaRelogio() {
        btnHora.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date relogio = new Date();
                lblHora.setText(relogio.toString());
                JOptionPane.showMessageDialog(null, relogio.toString());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setTitle("Relógio");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setContentPane(new TelaRelogio().MainPanel);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setSize(435, 200);
    }
}
