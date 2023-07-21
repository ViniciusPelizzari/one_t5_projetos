package moedas;

import javax.swing.*;

public class CADmoedas extends CAD{

    private JComboBox<String> moedasConversaoCAD;
    private String quantia;
    public String escolhaCAD;

    public CADmoedas() {
        criarMoedasConversaoCAD();
        criarFrame();
    }

    public void criarMoedasConversaoCAD(){
        moedasConversaoCAD = new JComboBox<>(new String[]{"", "CAD to BRL", "CAD to USD", "CAD to GBP", "CAD to AUD", "CAD to EUR", "CAD to CHF"});
        moedasConversaoCAD.setBounds(20, 20, 100, 30);
        //new Framee("DÓLAR CANADENSE", moedasConversaoCAD, "OK");
    }

    public void criarFrame() {
        FrameeMoedas frameeMoedas = new FrameeMoedas("DÓLAR CANADENSE", moedasConversaoCAD, "CONVERTER");
        frameeMoedas.getOkButton().addActionListener(e -> {
            quantia = frameeMoedas.getTextFieldValue();
            Exe();
        });
    }

    public void Exe() {
        CAD cad = new CAD();
        escolhaCAD = moedasConversaoCAD.getSelectedItem().toString();
        System.out.println("Moeda selecionada: " + escolhaCAD);
        System.out.println("CADmoedas: " + quantia);
        if (escolhaCAD.equals("CAD to BRL")) {
            cad.converterMoeda("CAD", getBRL(), Double.parseDouble(quantia), "BRL");
            cad.setValorC(String.valueOf(cad.getValorConvertido()));
            new ImprimirFrameMoeda("VALOR", "VALOR CONVERTIDO DE " + Double.parseDouble(quantia) + " CAD é: " + cad.getValorC() + " BRL");
        } else if (escolhaCAD.equals("CAD to USD")) {
            cad.converterMoeda("CAD", getUSD(), Double.parseDouble(quantia), "USD");
            cad.setValorC(String.valueOf(cad.getValorConvertido()));
            new ImprimirFrameMoeda("VALOR", "VALOR CONVERTIDO DE " + Double.parseDouble(quantia) + " CAD é: " + cad.getValorC() + " USD");
        } else if (escolhaCAD.equals("CAD to GBP")) {
            cad.converterMoeda("CAD", getCHF(), Double.parseDouble(quantia), "GBP");
            cad.setValorC(String.valueOf(cad.getValorConvertido()));
            new ImprimirFrameMoeda("VALOR", "VALOR CONVERTIDO DE " + Double.parseDouble(quantia) + " CAD é: " + cad.getValorC() + " GBP");
        } else if (escolhaCAD.equals("CAD to AUD")) {
            cad.converterMoeda("CAD", getEUR(), Double.parseDouble(quantia), "AUD");
            cad.setValorC(String.valueOf(cad.getValorConvertido()));
            new ImprimirFrameMoeda("VALOR", "VALOR CONVERTIDO DE " + Double.parseDouble(quantia) + " CAD é: " + cad.getValorC() + " AUD");
        } else if (escolhaCAD.equals("CAD to EUR")) {
            cad.converterMoeda("CAD", getAUD(), Double.parseDouble(quantia), "EUR");
            cad.setValorC(String.valueOf(cad.getValorConvertido()));
            new ImprimirFrameMoeda("VALOR", "VALOR CONVERTIDO DE " + Double.parseDouble(quantia) + " CAD é: " + cad.getValorC() + " EUR");
        } else if (escolhaCAD.equals("CAD to CHF")) {
            cad.converterMoeda("CAD", getCAD(), Double.parseDouble(quantia), "CHF");
            cad.setValorC(String.valueOf(cad.getValorConvertido()));
            new ImprimirFrameMoeda("VALOR", "VALOR CONVERTIDO DE " + Double.parseDouble(quantia) + " CAD é: " + cad.getValorC() + " CHF");
        }
    }
}
