package moedas;

import javax.swing.*;

public class USDmoedas extends USD{

    private JComboBox<String> moedasConversaoUSD;
    private String quantia;
    public String escolhaUSD;

    public USDmoedas() {
        criarMoedasConversaoUSD();
        criarFrame();
    }

    public void criarMoedasConversaoUSD(){
        moedasConversaoUSD = new JComboBox<>(new String[]{"", "USD to BRL", "USD to CHF", "USD to GBP", "USD to EUR", "USD to AUD", "USD to CAD"});
        moedasConversaoUSD.setBounds(20, 20, 100, 30);
    }

    public void criarFrame() {
        FrameeMoedas frameeMoedas = new FrameeMoedas("DÓLAR AMERICANO", moedasConversaoUSD, "CONVERTER");
        frameeMoedas.getOkButton().addActionListener(e -> {
            quantia = frameeMoedas.getTextFieldValue();
            Exe();
        });
    }

    public void Exe() {
        USD usd = new USD();
        escolhaUSD = moedasConversaoUSD.getSelectedItem().toString();
        System.out.println("Moeda selecionada: " + escolhaUSD);
        System.out.println("USDmoedas: " + quantia);
        if (escolhaUSD.equals("USD to BRL")) {
            usd.converterMoeda("USD", getBRL(), Double.parseDouble(quantia), "BRL");
            usd.setValorC(String.valueOf(usd.getValorConvertido()));
            new ImprimirFrameMoeda("VALOR", "VALOR CONVERTIDO DE " + Double.parseDouble(quantia) + " USD é: " + usd.getValorC() + " BRL");
        } else if (escolhaUSD.equals("USD to CHF")) {
            usd.converterMoeda("USD", getUSD(), Double.parseDouble(quantia), "USD");
            usd.setValorC(String.valueOf(usd.getValorConvertido()));
            new ImprimirFrameMoeda("VALOR", "VALOR CONVERTIDO DE " + Double.parseDouble(quantia) + " USD é: " + usd.getValorC() + " USD");
        } else if (escolhaUSD.equals("USD to GBP")) {
            usd.converterMoeda("USD", getCHF(), Double.parseDouble(quantia), "CHF");
            usd.setValorC(String.valueOf(usd.getValorConvertido()));
            new ImprimirFrameMoeda("VALOR", "VALOR CONVERTIDO DE " + Double.parseDouble(quantia) + " USD é: " + usd.getValorC() + " CHF");
        } else if (escolhaUSD.equals("USD to EUR")) {
            usd.converterMoeda("USD", getEUR(), Double.parseDouble(quantia), "EUR");
            usd.setValorC(String.valueOf(usd.getValorConvertido()));
            new ImprimirFrameMoeda("VALOR", "VALOR CONVERTIDO DE " + Double.parseDouble(quantia) + " USD é: " + usd.getValorC() + " EUR");
        } else if (escolhaUSD.equals("USD to AUD")) {
            usd.converterMoeda("USD", getAUD(), Double.parseDouble(quantia), "AUD");
            usd.setValorC(String.valueOf(usd.getValorConvertido()));
            new ImprimirFrameMoeda("VALOR", "VALOR CONVERTIDO DE " + Double.parseDouble(quantia) + " USD é: " + usd.getValorC() + " AUD");
        } else if (escolhaUSD.equals("USD to CAD")) {
            usd.converterMoeda("USD", getCAD(), Double.parseDouble(quantia), "CAD");
            usd.setValorC(String.valueOf(usd.getValorConvertido()));
            new ImprimirFrameMoeda("VALOR", "VALOR CONVERTIDO DE " + Double.parseDouble(quantia) + " USD é: " + usd.getValorC() + " CAD");
        }
    }
}

