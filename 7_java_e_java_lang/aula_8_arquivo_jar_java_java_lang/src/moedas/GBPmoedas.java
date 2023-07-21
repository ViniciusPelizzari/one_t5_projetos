package moedas;

import javax.swing.*;

public class GBPmoedas extends moedas.GBP {

    private JComboBox<String> moedasConversaoGBP;
    private String quantia;
    public String escolhaGBP;

    public GBPmoedas() {
        criarMoedasConversaoGBP();
        criarFrame();
    }

    public void criarMoedasConversaoGBP() {
        moedasConversaoGBP = new JComboBox<>(new String[]{"", "GBP to BRL", "GBP to USD", "GBP to CHF", "GBP to EUR", "GBP to AUD", "GBP to CAD"});
        moedasConversaoGBP.setBounds(20, 20, 100, 30);
    }

    public void criarFrame() {
        FrameeMoedas frameeMoedas = new FrameeMoedas("LIBRA ESTERLINA", moedasConversaoGBP, "CONVERTER");
        frameeMoedas.getOkButton().addActionListener(e -> {
            quantia = frameeMoedas.getTextFieldValue();
            Exe();
        });
    }

    public void Exe() {
        GBP gbp = new GBP();
        escolhaGBP = moedasConversaoGBP.getSelectedItem().toString();
        System.out.println("Moeda selecionada: " + escolhaGBP);
        System.out.println("GBPmoedas: " + quantia);
        if (escolhaGBP.equals("GBP to BRL")) {
            gbp.converterMoeda("GBP", getBRL(), Double.parseDouble(quantia), "BRL");
            gbp.setValorC(String.valueOf(gbp.getValorConvertido()));
            new ImprimirFrameMoeda("VALOR", "VALOR CONVERTIDO DE " + Double.parseDouble(quantia) + " GBP é: " + gbp.getValorC() + " BRL");
        } else if (escolhaGBP.equals("GBP to USD")) {
            gbp.converterMoeda("GBP", getUSD(), Double.parseDouble(quantia), "USD");
            gbp.setValorC(String.valueOf(gbp.getValorConvertido()));
            new ImprimirFrameMoeda("VALOR", "VALOR CONVERTIDO DE " + Double.parseDouble(quantia) + " GBP é: " + gbp.getValorC() + " USD");
        } else if (escolhaGBP.equals("GBP to CHF")) {
            gbp.converterMoeda("GBP", getCHF(), Double.parseDouble(quantia), "CHF");
            gbp.setValorC(String.valueOf(gbp.getValorConvertido()));
            new ImprimirFrameMoeda("VALOR", "VALOR CONVERTIDO DE " + Double.parseDouble(quantia) + " GBP é: " + gbp.getValorC() + " CHF");
        } else if (escolhaGBP.equals("GBP to EUR")) {
            gbp.converterMoeda("GBP", getEUR(), Double.parseDouble(quantia), "EUR");
            gbp.setValorC(String.valueOf(gbp.getValorConvertido()));
            new ImprimirFrameMoeda("VALOR", "VALOR CONVERTIDO DE " + Double.parseDouble(quantia) + " GBP é: " + gbp.getValorC() + " EUR");
        } else if (escolhaGBP.equals("GBP to AUD")) {
            gbp.converterMoeda("GBP", getAUD(), Double.parseDouble(quantia), "AUD");
            gbp.setValorC(String.valueOf(gbp.getValorConvertido()));
            new ImprimirFrameMoeda("VALOR", "VALOR CONVERTIDO DE " + Double.parseDouble(quantia) + " GBP é: " + gbp.getValorC() + " AUD");
        } else if (escolhaGBP.equals("GBP to CAD")) {
            gbp.converterMoeda("GBP", getCAD(), Double.parseDouble(quantia), "CAD");
            gbp.setValorC(String.valueOf(gbp.getValorConvertido()));
            new ImprimirFrameMoeda("VALOR", "VALOR CONVERTIDO DE " + Double.parseDouble(quantia) + " GBP é: " + gbp.getValorC() + " CAD");
        }
    }
}
