package classes;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaContador extends JFrame {
    private JSlider sliInicio;
    private JSlider sliFim;
    private JSlider sliPasso;
    private JButton btnCont;
    private JList lstCont;
    private JPanel mainPanel;
    private JLabel lblInicio;
    private JLabel lblFim;
    private JLabel lblPasso;

    public TelaContador() {
        setTitle("Contador");
        setContentPane(mainPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(320, 400);

        sliInicio.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int i = sliInicio.getValue();
                lblInicio.setText(Integer.toString(i));
            }
        });
        sliFim.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int f = sliFim.getValue();
                lblFim.setText(Integer.toString(f));
            }
        });
        sliPasso.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int p = sliPasso.getValue();
                lblPasso.setText(Integer.toString(p));
            }
        });

        btnCont.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = sliInicio.getValue();
                int f = sliFim.getValue();
                int p = sliPasso.getValue();

                DefaultListModel lista = new DefaultListModel();

                for (int c = i; c <= f; c += p) {
                    lista.addElement(c);
                }
                lstCont.setModel(lista);
            }
        });
    }

    public static void main(String[] args) {
        new TelaContador();
    }
}
