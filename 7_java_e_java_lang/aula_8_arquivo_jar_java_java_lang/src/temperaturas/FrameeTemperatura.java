package temperaturas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameeTemperatura {
    private static JFrame frame;
    private static JButton okButton;
    private static JLabel labelResult;
    private static String valorParaConversao;
    private static JTextField textFieldValue;

    public FrameeTemperatura(String title, JComboBox jcomBox, String txtButton) {
        frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(null);

        frame.add(jcomBox);

        okButton = new JButton(txtButton);
        okButton.setBounds(140, 20, 120, 30);
        frame.add(okButton);

        textFieldValue = new JTextField();
        textFieldValue.setBounds(20, 70, 240, 30);
        frame.add(textFieldValue);

        labelResult = new JLabel();
        labelResult.setBounds(20, 120, 360, 30);
        frame.add(labelResult);

        frame.setVisible(true);

        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String inputValue = textFieldValue.getText();
                setValorParaConversao(inputValue);
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }

    public JButton getOkButton() {
        return okButton;
    }

    public static String getValorParaConversao() {
        return valorParaConversao;
    }

    public static void setValorParaConversao(String valorParaConversao) {
        FrameeTemperatura.valorParaConversao = valorParaConversao;
    }

    public static String getTextFieldValue() {
        return textFieldValue.getText();
    }
}

