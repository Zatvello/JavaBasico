package zatvello;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResolucaoTelaSwing extends JFrame{
    private JPanel MainPanel;
    private JButton btnResolucao;
    private JLabel lblResolucao;

    public ResolucaoTelaSwing() {
        setTitle("Resolução");
        setContentPane(MainPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(430, 300);
        btnResolucao.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Toolkit tela = Toolkit.getDefaultToolkit();
                Dimension resolucao = tela.getScreenSize();
                lblResolucao.setText(resolucao.width + "x" + resolucao.height);
                JOptionPane.showMessageDialog(null, resolucao.width + "x" + resolucao.height);

            }
        });
    }

    public static void main(String[] args) {
        new ResolucaoTelaSwing();
    }
}
