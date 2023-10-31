package classes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

public class TelaVetor extends JFrame {
    private JSpinner txtnum;
    private JButton btnAdd;
    private JButton btnRemove;
    private JButton btnOrdem;
    private JList lstVetor;
    private JPanel mainPanel;
    private JLabel lblSelecionado;

    int vetor[] = new int[5];
    DefaultListModel lista = new DefaultListModel();
    int selecionado = 0;

    public TelaVetor() {
        setTitle("Vetor");
        setContentPane(mainPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(420, 400);

        for (int c = 0; c < vetor.length; c++) {
            lista.addElement(vetor[c]);
        }

        lstVetor.setModel(lista);
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vetor[selecionado] = Integer.parseInt(txtnum.getValue().toString());
                lista.removeAllElements();
                for (int c = 0; c < vetor.length; c++) {
                    lista.addElement(vetor[c]);
                }
            }
        });
        lstVetor.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selecionado = lstVetor.getSelectedIndex();
                lblSelecionado.setText("[" + selecionado + "]");
            }
        });
        btnRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vetor[selecionado] = 0;
                lista.removeAllElements();
                for (int c = 0; c < vetor.length; c++) {
                    lista.addElement(vetor[c]);
                }

            }
        });
        btnOrdem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Arrays.sort(vetor);
                lista.removeAllElements();
                for (int c = 0; c < vetor.length; c++) {
                    lista.addElement(vetor[c]);
                }
            }
        });
    }

    public static void main(String[] args) {
        new TelaVetor();
    }
}
