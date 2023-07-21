package temperaturas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Temperaturas {
    private static JComboBox<String> escolhaTemperatura;
    private static JButton okButton;
    public String escolhaT = escolhaTemperatura.getSelectedItem().toString();

    public static void main(String[] args){
        Exe();
    }

    public static void Exe(){
        escolhaTemperatura = new JComboBox<>(new String[]{"", "Celsius (°C)", "Fahrenheit (°F)", "Kelvin (K)"});
        escolhaTemperatura.setBounds(20, 20, 100, 30);
        new FrameTemperatura("TEMPERATURAS", escolhaTemperatura, "SELECIONAR");

        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                OpcaoTemperatura opcaoTemperatura = new OpcaoTemperatura();
                opcaoTemperatura.Temperaturas();
            }
        });
    }
}