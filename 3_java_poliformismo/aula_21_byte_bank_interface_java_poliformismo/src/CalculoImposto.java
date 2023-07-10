public class CalculoImposto {

    private double totalImposto;
    public void registra(Tributos imposto){
        double valorImposto = imposto.getValorImposto();
        this.totalImposto += valorImposto;
    }

    public double getTotalImposto() {
        return totalImposto;
    }
}
