package moedas;

public class AUD extends MoedasConversor {

    @Override
    public double getBRL() {
        return super.getBRL();
    }

    @Override
    public double getCAD() {
        return 0.89;
    }

    @Override
    public double getCHF() {
        return 0.58;
    }

    @Override
    public double getEUR() {
        return 0.60;
    }

    @Override
    public double getGBP() {
        return 0.52;
    }

    @Override
    public double getUSD() {
        return 0.68;
    }

    @Override
    public double converterMoeda(String nomeMoeda, double taxaCambio, double quantidade, String nomeMoedaConverter) {
        return super.converterMoeda(nomeMoeda, taxaCambio, quantidade, nomeMoedaConverter);
    }
}
