package moedas;

public class OpcaoMoedas {

    public static void OpcaoMoedas() {
        Moedas moedas = new Moedas();
        String moedaSelecionada = moedas.escolhaM;
        System.out.println("Moeda selecionada: " + moedaSelecionada);
        if (moedaSelecionada.equals("BRL")) {
            new BRLmoedas();
        } else if (moedaSelecionada.equals("USD")) {
            new USDmoedas();
        } else if (moedaSelecionada.equals("EUR")) {
            new EURmoedas();
        } else if (moedaSelecionada.equals("GBP")) {
            new GBPmoedas();
        } else if (moedaSelecionada.equals("AUD")) {
            new AUDmoedas();
        } else if (moedaSelecionada.equals("CHF")) {
            new CHFmoedas();
        } else if (moedaSelecionada.equals("CAD")) {
            new CADmoedas();
        }
    }
}
