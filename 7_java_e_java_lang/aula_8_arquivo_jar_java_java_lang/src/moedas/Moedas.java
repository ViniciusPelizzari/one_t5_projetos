package moedas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Moedas {
    private static JComboBox<String> escolhaMoeda;
    private static JButton okButton;
    public String escolhaM = escolhaMoeda.getSelectedItem().toString();

    public static void main(String[] args) {
        Exe();
    }

    public static void Exe(){
        escolhaMoeda = new JComboBox<>(new String[]{"", "BRL", "EUR", "USD", "GBP", "AUD", "CHF", "CAD"});
        escolhaMoeda.setBounds(20, 20, 100, 30);
        new FrameMoedas("MOEDAS", escolhaMoeda, "SELECIONAR");

        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                OpcaoMoedas opcaoMoedas = new OpcaoMoedas();
                opcaoMoedas.OpcaoMoedas();
            }
        });
    }
}

