package moedas;

import javax.swing.*;

public class EURmoedas extends EUR{

    private JComboBox<String> moedasConversaoEUR;
    private String quantia;
    public String escolhaEUR;

    public EURmoedas() {
        criarMoedasConversaoUSD();
        criarFrame();
    }

    public void criarMoedasConversaoUSD() {
        moedasConversaoEUR = new JComboBox<>(new String[]{"", "EUR to BRL", "EUR to USD", "EUR to GBP", "EUR to CHF", "EUR to AUD", "EUR to CAD"});
        moedasConversaoEUR.setBounds(20, 20, 100, 30);
    }

    public void criarFrame() {
        FrameeMoedas frameeMoedas = new FrameeMoedas("EURO", moedasConversaoEUR, "CONVERTER");
        frameeMoedas.getOkButton().addActionListener(e -> {
            quantia = frameeMoedas.getTextFieldValue();
            Exe();
        });
    }

    public void Exe() {
        EUR eur = new EUR();
        escolhaEUR = moedasConversaoEUR.getSelectedItem().toString();
        System.out.println("Moeda selecionada: " + escolhaEUR);
        System.out.println("EURmoedas: " + quantia);
        if (escolhaEUR.equals("EUR to BRL")) {
            eur.converterMoeda("EUR", getBRL(), Double.parseDouble(quantia), "BRL");
            eur.setValorC(String.valueOf(eur.getValorConvertido()));
            new ImprimirFrameMoeda("VALOR", "VALOR CONVERTIDO DE " + Double.parseDouble(quantia) + " EUR é: " + eur.getValorC() + " BRL");
        } else if (escolhaEUR.equals("EUR to USD")) {
            eur.converterMoeda("EUR", getUSD(), Double.parseDouble(quantia), "USD");
            eur.setValorC(String.valueOf(eur.getValorConvertido()));
            new ImprimirFrameMoeda("VALOR", "VALOR CONVERTIDO DE " + Double.parseDouble(quantia) + " EUR é: " + eur.getValorC() + " USD");
        } else if (escolhaEUR.equals("EUR to GBP")) {
            eur.converterMoeda("EUR", getGBP(), Double.parseDouble(quantia), "GBP");
            eur.setValorC(String.valueOf(eur.getValorConvertido()));
            new ImprimirFrameMoeda("VALOR", "VALOR CONVERTIDO DE " + Double.parseDouble(quantia) + " EUR é: " + eur.getValorC() + " GBP");
        } else if (escolhaEUR.equals("EUR to CHF")) {
            eur.converterMoeda("EUR", getCHF(), Double.parseDouble(quantia), "CHF");
            eur.setValorC(String.valueOf(eur.getValorConvertido()));
            new ImprimirFrameMoeda("VALOR", "VALOR CONVERTIDO DE " + Double.parseDouble(quantia) + " EUR é: " + eur.getValorC() + " CHF");
        } else if (escolhaEUR.equals("EUR to AUD")) {
            eur.converterMoeda("EUR", getAUD(), Double.parseDouble(quantia), "AUD");
            eur.setValorC(String.valueOf(eur.getValorConvertido()));
            new ImprimirFrameMoeda("VALOR", "VALOR CONVERTIDO DE " + Double.parseDouble(quantia) + " EUR é: " + eur.getValorC() + " AUD");
        } else if (escolhaEUR.equals("EUR to CAD")) {
            eur.converterMoeda("EUR", getCAD(), Double.parseDouble(quantia), "CAD");
            eur.setValorC(String.valueOf(eur.getValorConvertido()));
            new ImprimirFrameMoeda("VALOR", "VALOR CONVERTIDO DE " + Double.parseDouble(quantia) + " EUR é: " + eur.getValorC() + " CAD");
        }
    }
}
