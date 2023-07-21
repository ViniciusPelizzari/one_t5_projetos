package moedas;

import java.text.DecimalFormat;

public abstract class MoedasConversor {
    protected double BRL;
    protected double USD;
    protected double EUR;
    protected double GBP;
    protected double AUD;
    protected double CHF;
    protected double CAD;
    public String valorC;
    protected double valorConvertido;

    public double getBRL() {
        return BRL;
    }

    public double getUSD() {
        return USD;
    }

    public double getEUR() {
        return EUR;
    }

    public double getGBP() {
        return GBP;
    }

    public double getAUD() {
        return AUD;
    }

    public double getCHF() {
        return CHF;
    }

    public double getCAD() {
        return CAD;
    }

    public double getValorConvertido() {
        return valorConvertido;
    }

    public String getValorC() {
        double valor = Double.parseDouble(valorC);
        DecimalFormat df = new DecimalFormat("#.###");
        return df.format(valor);
    }

    public void setValorC(String valorC) {
        this.valorC = valorC;
    }

    public double converterMoeda(String nomeMoedaConverter, double taxaCambio, double quantidade, String nomeMoedaConvertida) {
        valorConvertido = taxaCambio * quantidade;
        System.out.println("Valor convertido de " + quantidade + " " + nomeMoedaConverter + " é: " + valorConvertido + " " + nomeMoedaConvertida);
        return valorConvertido;
    }
}
