public class SeguroVida implements Tributos {

    private double valorSeguro;

    public void setValorSeguro(double valorSeguro) {
        this.valorSeguro = valorSeguro;
    }

    @Override
    public double getValorImposto() {
        return this.valorSeguro * 0.036;
    }
}
