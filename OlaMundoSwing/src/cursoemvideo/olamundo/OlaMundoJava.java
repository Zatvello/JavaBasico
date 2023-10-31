package cursoemvideo.olamundo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OlaMundoJava {
    private JButton btnClick;
    private JLabel lblMensagem;

    public OlaMundoJava() {
        btnClick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Olá, Mundo!");
                btnClick.setText("Olá, Mundo!");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new OlaMundoJava().btnClick) ;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);     // Centralizar o Frame no centro da tela \\

    }

}
