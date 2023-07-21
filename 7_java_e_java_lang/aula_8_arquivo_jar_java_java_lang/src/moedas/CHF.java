package moedas;

public class CHF extends MoedasConversor{

    @Override
    public double getAUD() {
        return 1.70;
    }

    @Override
    public double getCAD() {
        return 1.53;
    }

    @Override
    public double getBRL() {
        return 5.58;
    }

    @Override
    public double getEUR() {
        return 1.03;
    }

    @Override
    public double getGBP() {
        return 0.88;
    }

    @Override
    public double getUSD() {
        return 1.16;
    }

    @Override
    public double converterMoeda(String nomeMoeda, double taxaCambio, double quantidade, String nomeMoedaConverter) {
        return super.converterMoeda(nomeMoeda, taxaCambio, quantidade, nomeMoedaConverter);
    }
}
