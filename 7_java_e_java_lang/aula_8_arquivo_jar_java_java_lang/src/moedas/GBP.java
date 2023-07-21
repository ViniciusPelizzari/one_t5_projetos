package moedas;

public class GBP extends MoedasConversor{

    @Override
    public double getAUD() {
        return 1.91;
    }

    @Override
    public double getCAD() {
        return 1.72;
    }

    @Override
    public double getCHF() {
        return 1.12;
    }

    @Override
    public double getEUR() {
        return 1.16;
    }

    @Override
    public double getBRL() {
        return 6.28;
    }

    @Override
    public double getUSD() {
        return 1.30;
    }

    @Override
    public double converterMoeda(String nomeMoeda, double taxaCambio, double quantidade, String nomeMoedaConverter) {
        return super.converterMoeda(nomeMoeda, taxaCambio, quantidade, nomeMoedaConverter);
    }
}
