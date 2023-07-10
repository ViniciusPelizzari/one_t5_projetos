public class TesteTributos {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(333, 333);
        cc.depositar(3000);

        SeguroVida seguroVida = new SeguroVida();
        seguroVida.setValorSeguro(658000);

        CalculoImposto calculoImposto = new CalculoImposto();
        calculoImposto.registra(cc);
        calculoImposto.registra(seguroVida);
        System.out.println(calculoImposto.getTotalImposto());
    }
}
