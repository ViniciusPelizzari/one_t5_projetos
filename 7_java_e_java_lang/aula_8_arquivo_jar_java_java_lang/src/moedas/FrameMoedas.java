package moedas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameMoedas {
    private static JFrame frame;
    private static JButton okButton;
    private static JLabel labelResult;

    public FrameMoedas(String title, JComboBox jcomBox, String txtButton){

        frame=new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,140);
        frame.setLayout(null);

        frame.add(jcomBox);

        okButton = new JButton(txtButton);
        okButton.setBounds(140, 20, 120, 30);
        frame.add(okButton);

        labelResult = new JLabel();
        labelResult.setBounds(20, 120, 360, 30);
        frame.add(labelResult);

        frame.setVisible(true);

        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                OpcaoMoedas opcaoMoedas = new OpcaoMoedas();
                opcaoMoedas.OpcaoMoedas();
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
}

