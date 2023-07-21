package moedas;

public class USD extends MoedasConversor{

    @Override
    public double getAUD() {
        return 1.46;
    }

    @Override
    public double getCAD() {
        return 1.32;
    }

    @Override
    public double getCHF() {
        return 0.86;
    }

    @Override
    public double getEUR() {
        return 0.89;
    }

    @Override
    public double getGBP() {
        return 0.76;
    }

    @Override
    public double getBRL() {
        return 4.80;
    }

    @Override
    public double converterMoeda(String nomeMoeda, double taxaCambio, double quantidade, String nomeMoedaConverter) {
        return super.converterMoeda(nomeMoeda, taxaCambio, quantidade, nomeMoedaConverter);
    }
}
