package temperaturas;

import javax.swing.*;

public class Kelvin extends FormulaKelvin{

    private JComboBox<String> kelvin;
    private String valor;
    public String escolha;

    public Kelvin(){
        criarTemperatura();
        criarFrame();
    }

    public void criarTemperatura(){
        kelvin = new JComboBox<>(new String[]{"", "K to °F", "K to °C"});
        kelvin.setBounds(20, 20, 100, 30);
    }

    public void criarFrame(){
        FrameeTemperatura frameeTemperatura = new FrameeTemperatura("KELVIN", kelvin, "CONVERTER");
        frameeTemperatura.getOkButton().addActionListener(e -> {
            valor = frameeTemperatura.getTextFieldValue();
            Exe();
        });
    }

    public void Exe(){
        FormulaKelvin formulaKelvin = new FormulaKelvin();
        escolha = kelvin.getSelectedItem().toString();
        if(escolha.equals("K to °F")){
            System.out.println("Escolha: " + escolha);
            formulaKelvin.KelvinToFahrenheit(Double.parseDouble(valor));
            String formulaKelvinToFahrenheit = String.valueOf(formulaKelvin.getKelvinToFahrenheit());
            new ImprimirFrameTemperatura("K to °F", "Conversão de " + Double.parseDouble(valor) + "K para °F = " + formulaKelvinToFahrenheit + "°F");
        } else if (escolha.equals("K to °C")) {
            System.out.println("Escolha: " + escolha);
            formulaKelvin.KelvinToCelsius(Double.parseDouble(valor));
            String formulaKelvinToCelsius = String.valueOf(formulaKelvin.getKelvinToCelsius());
            new ImprimirFrameTemperatura("K to °C", "Conversão de " + Double.parseDouble(valor) + "K para °C = " + formulaKelvinToCelsius + "°C");
        }
    }
}
