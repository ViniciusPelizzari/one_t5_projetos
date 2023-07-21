package moedas;

public class CAD extends MoedasConversor{

    @Override
    public double getAUD() {
        return 1.11;
    }

    @Override
    public double getBRL() {
        return 3.64;
    }

    @Override
    public double getCHF() {
        return 0.65;
    }

    @Override
    public double getEUR() {
        return 0.67;
    }

    @Override
    public double getGBP() {
        return 0.58;
    }

    @Override
    public double getUSD() {
        return 0.75;
    }

    @Override
    public double converterMoeda(String nomeMoeda, double taxaCambio, double quantidade, String nomeMoedaConverter) {
        return super.converterMoeda(nomeMoeda, taxaCambio, quantidade, nomeMoedaConverter);
    }
}
