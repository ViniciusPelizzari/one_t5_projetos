package moedas;

import javax.swing.*;

public class BRLmoedas extends BRL{

    private JComboBox<String> moedasConversaoBRL;
    private String quantia;
    public String escolhaBRL;

    public BRLmoedas() {
        criarMoedasConversaoBRL();
        criarFrame();
    }

    public void criarMoedasConversaoBRL(){
        moedasConversaoBRL = new JComboBox<>(new String[]{"", "BRL to EUR", "BRL to USD", "BRL to GBP", "BRL to AUD", "BRL to CHF", "BRL to CAD"});
        moedasConversaoBRL.setBounds(20, 20, 100, 30);
        //new Framee("REAL BRASILEIRO", moedasConversaoBRL, "OK");
    }

    public void criarFrame() {
        FrameeMoedas frameeMoedas = new FrameeMoedas("REAL BRASILEIRO", moedasConversaoBRL, "CONVERTER");
        frameeMoedas.getOkButton().addActionListener(e -> {
            quantia = frameeMoedas.getTextFieldValue();
            Exe();
        });
    }

    public void Exe() {
        BRL brl = new BRL();
        escolhaBRL = moedasConversaoBRL.getSelectedItem().toString();
        System.out.println("Moeda selecionada: " + escolhaBRL);
        System.out.println("BRLmoedas: " + quantia);
        if (escolhaBRL.equals("BRL to EUR")) {
            brl.converterMoeda("BRL", getEUR(), Double.parseDouble(quantia), "EUR");
            brl.setValorC(String.valueOf(brl.getValorConvertido()));
            new ImprimirFrameMoeda("VALOR", "VALOR CONVERTIDO DE " + Double.parseDouble(quantia) + " BRL é: " + brl.getValorC() + " EUR");
        } else if (escolhaBRL.equals("BRL to USD")) {
            brl.converterMoeda("BRL", getUSD(), Double.parseDouble(quantia), "USD");
            brl.setValorC(String.valueOf(brl.getValorConvertido()));
            new ImprimirFrameMoeda("VALOR", "VALOR CONVERTIDO DE " + Double.parseDouble(quantia) + " BRL é: " + brl.getValorC() + " USD");
        } else if (escolhaBRL.equals("BRL to GBP")) {
            brl.converterMoeda("BRL", getGBP(), Double.parseDouble(quantia), "GBP");
            brl.setValorC(String.valueOf(brl.getValorConvertido()));
            new ImprimirFrameMoeda("VALOR", "VALOR CONVERTIDO DE " + Double.parseDouble(quantia) + " BRL é: " + brl.getValorC() + " GBP");
        } else if (escolhaBRL.equals("BRL to AUD")) {
            brl.converterMoeda("BRL", getAUD(), Double.parseDouble(quantia), "AUD");
            brl.setValorC(String.valueOf(brl.getValorConvertido()));
            new ImprimirFrameMoeda("VALOR", "VALOR CONVERTIDO DE " + Double.parseDouble(quantia) + " BRL é: " + brl.getValorC() + " AUD");
        } else if (escolhaBRL.equals("BRL to CHF")) {
            brl.converterMoeda("BRL", getCHF(), Double.parseDouble(quantia), "CHF");
            brl.setValorC(String.valueOf(brl.getValorConvertido()));
            new ImprimirFrameMoeda("VALOR", "VALOR CONVERTIDO DE " + Double.parseDouble(quantia) + " BRL é: " + brl.getValorC() + " AUD");
        } else if (escolhaBRL.equals("BRL to CAD")) {
            brl.converterMoeda("BRL", getCAD(), Double.parseDouble(quantia), "CAD");
            brl.setValorC(String.valueOf(brl.getValorConvertido()));
            new ImprimirFrameMoeda("VALOR", "VALOR CONVERTIDO DE " + Double.parseDouble(quantia) + " BRL é: " + brl.getValorC() + " CAD");
        }
    }
}
