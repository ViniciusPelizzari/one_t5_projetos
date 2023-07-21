package moedas;

/*import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;


public class Framee {
    private static JFrame frame;
    private static JButton okButton;
    private static JLabel labelResult;
    private static String quantiaParaConversao;
    public static String valor;

    public Framee(String title, JComboBox jcomBox, String txtButton/*, double valorConvertido){*/

        /*frame=new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(260, 200);
        frame.setLayout(null);

        frame.add(jcomBox);

        okButton = new JButton(txtButton);
        okButton.setBounds(140, 20, 80, 30);
        frame.add(okButton);

        JTextField textFieldValue = new JTextField();
        textFieldValue.setBounds(20, 70, 200, 30);
        frame.add(textFieldValue);

        labelResult = new JLabel();
        labelResult.setBounds(20, 120, 360, 30);
        frame.add(labelResult);

        frame.setVisible(true);

        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setValor(textFieldValue.getText());
                if (!getValor().isEmpty()) {
                    setQuantiaParaConversao(getValor());
                    labelResult.setText("Valor get: " + getQuantiaParaConversao());
                    System.out.println("Valor getFramee: " + getValor());
                    new ImprimirFrame("Teste", getValor());
                } else {
                    new ImprimirFrame("AVISO", "Valor null");
                }
            }
        });

        frame.setVisible(true);
    }

    public JButton getOkButton() {
        return okButton;
    }

    public static String getQuantiaParaConversao() {
        return quantiaParaConversao;
    }

    public static void setQuantiaParaConversao(String quantiaParaConversao) {
        Framee.quantiaParaConversao = quantiaParaConversao;
    }

    public static String getValor() {
        return valor;
    }

    public static void setValor(String valor) {
        Framee.valor = valor;
    }
}*/
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameeMoedas {
    private static JFrame frame;
    private static JButton okButton;
    private static JLabel labelResult;
    private static String quantiaParaConversao;
    private static JTextField textFieldValue;

    public FrameeMoedas(String title, JComboBox jcomBox, String txtButton) {
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
                setQuantiaParaConversao(inputValue);
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }

    public JButton getOkButton() {
        return okButton;
    }

    public static String getQuantiaParaConversao() {
        return quantiaParaConversao;
    }

    public static void setQuantiaParaConversao(String quantiaParaConversao) {
        FrameeMoedas.quantiaParaConversao = quantiaParaConversao;
    }

    public static String getTextFieldValue() {
        return textFieldValue.getText();
    }
}

