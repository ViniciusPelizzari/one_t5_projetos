package moedas;

import javax.swing.*;

public class AUDmoedas extends AUD {

    private JComboBox<String> moedasConversaoAUD;
    private String quantia;
    public String escolhaAUD;

    public AUDmoedas() {
        criarMoedasConversaoAUD();
        criarFrame();
    }

    public void criarMoedasConversaoAUD(){
        moedasConversaoAUD = new JComboBox<>(new String[]{"", "AUD to BRL", "AUD to USD", "AUD to GBP", "AUD to EUR", "AUD to CHF", "AUD to CAD"});
        moedasConversaoAUD.setBounds(20, 20, 100, 30);
        //new Framee("DÓLAR AUSTRALIANO", moedasConversaoAUD, "OK");
    }

    public void criarFrame() {
        FrameeMoedas frameeMoedas = new FrameeMoedas("DÓLAR AUSTRALIANO", moedasConversaoAUD, "CONVERTER");
        frameeMoedas.getOkButton().addActionListener(e -> {
            quantia = frameeMoedas.getTextFieldValue();
            Exe();
        });
    }

    public void Exe() {
        AUD aud = new AUD();
        escolhaAUD = moedasConversaoAUD.getSelectedItem().toString();
        System.out.println("Moeda selecionada: " + escolhaAUD);
        System.out.println("AUDmoedas: " + quantia);
        if (escolhaAUD.equals("AUD to BRL")) {
            aud.converterMoeda("AUD", getBRL(), Double.parseDouble(quantia), "BRL");
            aud.setValorC(String.valueOf(aud.getValorConvertido()));
            new ImprimirFrameMoeda("VALOR", "VALOR CONVERTIDO DE " + Double.parseDouble(quantia) + " AUD é: " + aud.getValorC() + " BRL");
        } else if (escolhaAUD.equals("AUD to USD")) {
            aud.converterMoeda("AUD", getUSD(), Double.parseDouble(quantia), "USD");
            aud.setValorC(String.valueOf(aud.getValorConvertido()));
            new ImprimirFrameMoeda("VALOR", "VALOR CONVERTIDO DE " + Double.parseDouble(quantia) + " AUD é: " + aud.getValorC() + " USD");
        } else if (escolhaAUD.equals("AUD to GBP")) {
            aud.converterMoeda("AUD", getCHF(), Double.parseDouble(quantia), "GBP");
            aud.setValorC(String.valueOf(aud.getValorConvertido()));
            new ImprimirFrameMoeda("VALOR", "VALOR CONVERTIDO DE " + Double.parseDouble(quantia) + " AUD é: " + aud.getValorC() + " CHF");
        } else if (escolhaAUD.equals("AUD to EUR")) {
            aud.converterMoeda("AUD", getEUR(), Double.parseDouble(quantia), "EUR");
            aud.setValorC(String.valueOf(aud.getValorConvertido()));
            new ImprimirFrameMoeda("VALOR", "VALOR CONVERTIDO DE " + Double.parseDouble(quantia) + " AUD é: " + aud.getValorC() + " EUR");
        } else if (escolhaAUD.equals("AUD to CHF")) {
            aud.converterMoeda("AUD", getAUD(), Double.parseDouble(quantia), "CHF");
            aud.setValorC(String.valueOf(aud.getValorConvertido()));
            new ImprimirFrameMoeda("VALOR", "VALOR CONVERTIDO DE " + Double.parseDouble(quantia) + " AUD é: " + aud.getValorC() + " CHF");
        } else if (escolhaAUD.equals("AUD to CAD")) {
            aud.converterMoeda("AUD", getCAD(), Double.parseDouble(quantia), "CAD");
            aud.setValorC(String.valueOf(aud.getValorConvertido()));
            new ImprimirFrameMoeda("VALOR", "VALOR CONVERTIDO DE " + Double.parseDouble(quantia) + " AUD é: " + aud.getValorC() + " CAD");
        }
    }
}
