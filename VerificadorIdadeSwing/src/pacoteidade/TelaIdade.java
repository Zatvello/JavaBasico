package pacoteidade;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Year;

public class TelaIdade extends JFrame{
    private JPanel mainPanel;
    private JTextField txtAno;
    private JButton btnCalc;
    private JLabel lblIdade;
    private JLabel lblSituacao;

    public TelaIdade() {
        setTitle("Verificador de Idade");
        setContentPane(mainPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(500, 430);

        int anoAtual = Year.now().getValue();

        btnCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ano = Integer.parseInt(txtAno.getText());
                int idade = anoAtual - ano;
                String r;
                r = ((idade >= 16 && idade < 18) || (idade > 70))?"É OPCIONAL":"NÃO É OPCIONAL";
                lblIdade.setText(Integer.toString(idade));
                lblSituacao.setText(r);

            }
        });
    }

    public static void main(String[] args) {
        new TelaIdade();
    }
}
