package zatvello;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class IdiomaSistemaSwing {

    private JButton btnIdioma;
    private JLabel lblIdioma;
    private JPanel MainPanel;

    public IdiomaSistemaSwing() {
        btnIdioma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Locale idioma = Locale.getDefault();
                lblIdioma.setText(idioma.toString());
                JOptionPane.showMessageDialog(null, idioma.toString());

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Idioma");
        frame.setContentPane(new IdiomaSistemaSwing().MainPanel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setSize(440, 295);
    }
}
