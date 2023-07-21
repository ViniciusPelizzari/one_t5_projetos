package moedas;

public class EUR extends MoedasConversor{

    @Override
    public double getAUD() {
        return 1.65;
    }

    @Override
    public double getCAD() {
        return 1.48;
    }

    @Override
    public double getCHF() {
        return 0.96;
    }

    @Override
    public double getBRL() {
        return 5.40;
    }

    @Override
    public double getGBP() {
        return 0.86;
    }

    @Override
    public double getUSD() {
        return 1.12;
    }

    @Override
    public double converterMoeda(String nomeMoeda, double taxaCambio, double quantidade, String nomeMoedaConverter) {
        return super.converterMoeda(nomeMoeda, taxaCambio, quantidade, nomeMoedaConverter);
    }
}
