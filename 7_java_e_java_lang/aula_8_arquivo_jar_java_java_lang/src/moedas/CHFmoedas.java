package moedas;

import javax.swing.*;

public class CHFmoedas extends CHF {

    private JComboBox<String> moedasConversaoCHF;
    private String quantia;
    public String escolhaCHF;

    public CHFmoedas() {
        criarMoedasConversaoCHF();
        criarFrame();
    }

    public void criarMoedasConversaoCHF(){
        moedasConversaoCHF = new JComboBox<>(new String[]{"", "CHF to BRL", "CHF to USD", "CHF to GBP", "CHF to EUR", "CHF to AUD", "CHF to CAD"});
        moedasConversaoCHF.setBounds(20, 20, 100, 30);
    }

    public void criarFrame() {
        FrameeMoedas frameeMoedas = new FrameeMoedas("FRANCO SUIÇO", moedasConversaoCHF, "CONVERTER");
        frameeMoedas.getOkButton().addActionListener(e -> {
            quantia = frameeMoedas.getTextFieldValue();
            Exe();
        });
    }

    public void Exe() {
        CHF chf = new CHF();
        escolhaCHF = moedasConversaoCHF.getSelectedItem().toString();
        System.out.println("Moeda selecionada: " + escolhaCHF);
        System.out.println("CHFmoedas: " + quantia);
        if (escolhaCHF.equals("CHF to BRL")) {
            chf.converterMoeda("CHF", getBRL(), Double.parseDouble(quantia), "BRL");
            chf.setValorC(String.valueOf(chf.getValorConvertido()));
            new ImprimirFrameMoeda("VALOR", "VALOR CONVERTIDO DE " + Double.parseDouble(quantia) + " CHF é: " + chf.getValorC() + " BRL");
        } else if (escolhaCHF.equals("CHF to USD")) {
            chf.converterMoeda("CHF", getUSD(), Double.parseDouble(quantia), "USD");
            chf.setValorC(String.valueOf(chf.getValorConvertido()));
            new ImprimirFrameMoeda("VALOR", "VALOR CONVERTIDO DE " + Double.parseDouble(quantia) + " CHF é: " + chf.getValorC() + " USD");
        } else if (escolhaCHF.equals("CHF to GBP")) {
            chf.converterMoeda("CHF", getCHF(), Double.parseDouble(quantia), "GBP");
            chf.setValorC(String.valueOf(chf.getValorConvertido()));
            new ImprimirFrameMoeda("VALOR", "VALOR CONVERTIDO DE " + Double.parseDouble(quantia) + " CHF é: " + chf.getValorC() + " GBP");
        } else if (escolhaCHF.equals("CHF to EUR")) {
            chf.converterMoeda("CHF", getEUR(), Double.parseDouble(quantia), "EUR");
            chf.setValorC(String.valueOf(chf.getValorConvertido()));
            new ImprimirFrameMoeda("VALOR", "VALOR CONVERTIDO DE " + Double.parseDouble(quantia) + " CHF é: " + chf.getValorC() + " EUR");
        } else if (escolhaCHF.equals("CHF to AUD")) {
            chf.converterMoeda("CHF", getAUD(), Double.parseDouble(quantia), "AUD");
            chf.setValorC(String.valueOf(chf.getValorConvertido()));
            new ImprimirFrameMoeda("VALOR", "VALOR CONVERTIDO DE " + Double.parseDouble(quantia) + " CHF é: " + chf.getValorC() + " AUD");
        } else if (escolhaCHF.equals("CHF to CAD")) {
            chf.converterMoeda("CHF", getCAD(), Double.parseDouble(quantia), "CAD");
            chf.setValorC(String.valueOf(chf.getValorConvertido()));
            new ImprimirFrameMoeda("VALOR", "VALOR CONVERTIDO DE " + Double.parseDouble(quantia) + " CHF é: " + chf.getValorC() + " CAD");
        }
    }
}
