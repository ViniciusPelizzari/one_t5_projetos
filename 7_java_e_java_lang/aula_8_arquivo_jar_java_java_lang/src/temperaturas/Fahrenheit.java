package temperaturas;

import javax.swing.*;

public class Fahrenheit {

    private JComboBox<String> fahrenheit;
    private String valor;
    public String escolha;

    public Fahrenheit(){
        criarTemperatura();
        criarFrame();
    }

    public void criarTemperatura(){
        fahrenheit = new JComboBox<>(new String[]{"", "ºF to °C", "ºF to K"});
        fahrenheit.setBounds(20, 20, 100, 30);
    }

    public void criarFrame(){
        FrameeTemperatura frameeTemperatura = new FrameeTemperatura("FAHRENHEIT", fahrenheit, "CONVERTER");
        frameeTemperatura.getOkButton().addActionListener(e -> {
            valor = frameeTemperatura.getTextFieldValue();
            Exe();
        });
    }

    public void Exe(){
        FormulaFahrenheit formulaFahrenheit = new FormulaFahrenheit();
        escolha = fahrenheit.getSelectedItem().toString();
        if(escolha.equals("ºF to °C")){
            System.out.println("Escolha: " + escolha);
            formulaFahrenheit.FahrenheitToCelsius(Double.parseDouble(valor));
            String formulaFahrenheitToCelsius = String.valueOf(formulaFahrenheit.getFahrenheitToCelsius());
            new ImprimirFrameTemperatura("ºF to °C", "Conversão de " + Double.parseDouble(valor) + "°F para °C = " + formulaFahrenheitToCelsius + "°C");
        } else if (escolha.equals("ºF to K")) {
            System.out.println("Escolha: " + escolha);
            formulaFahrenheit.FahrenheitToKelvin(Double.parseDouble(valor));
            String formulaFahrenheitToKelvin = String.valueOf(formulaFahrenheit.getFahrenheitToKelvin());
            new ImprimirFrameTemperatura("ºF to K", "Conversão de " + Double.parseDouble(valor) + "°F para K = " + formulaFahrenheitToKelvin + "K");
        }
    }
}
