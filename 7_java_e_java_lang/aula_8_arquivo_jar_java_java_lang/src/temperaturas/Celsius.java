package temperaturas;

import javax.swing.*;

public class Celsius {

    private JComboBox<String> celsius;
    private String valor;
    public String escolha;

    public Celsius(){
        criarTemperatura();
        criarFrame();
    }

    public void criarTemperatura(){
        celsius = new JComboBox<>(new String[]{"", "°C to ºF", "°C to K"});
        celsius.setBounds(20, 20, 100, 30);
    }

    public void criarFrame(){
        FrameeTemperatura frameeTemperatura = new FrameeTemperatura("CELSIUS", celsius, "CONVERTER");
        frameeTemperatura.getOkButton().addActionListener(e -> {
            valor = frameeTemperatura.getTextFieldValue();
            Exe();
        });
    }

    public void Exe(){
        FormulaCelsius formulaCelsius = new FormulaCelsius();
        escolha = celsius.getSelectedItem().toString();
        if(escolha.equals("°C to ºF")){
            System.out.println("Escolha: " + escolha);
            formulaCelsius.CelsiusToFahrenheit(Double.parseDouble(valor));
            String formulaCelsiusFahrenheit = String.valueOf(formulaCelsius.getCelsiusToFahrenheit());
            new ImprimirFrameTemperatura("°C to ºF", "Conversão de " + Double.parseDouble(valor) + "°C para ºF = " + formulaCelsiusFahrenheit + "ºF");
        } else if (escolha.equals("°C to K")) {
            System.out.println("Escolha: " + escolha);
            formulaCelsius.CelsiusToKelvin(Double.parseDouble(valor));
            String formulaCelsiusKelvin = String.valueOf(formulaCelsius.getCelsiusToKelvin());
            new ImprimirFrameTemperatura("°C to K", "Conversão de " + Double.parseDouble(valor) + "°C para K = " + formulaCelsiusKelvin + "K");
        }
    }
}
