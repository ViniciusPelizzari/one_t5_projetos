package moedas;

public class BRL extends MoedasConversor{

    @Override
    public double getAUD() {
        return 0.305;
    }

    @Override
    public double getCAD() {
        return 0.273;
    }

    @Override
    public double getCHF() {
        return 0.178;
    }

    @Override
    public double getEUR() {
        return 0.185;
    }

    @Override
    public double getGBP() {
        return 0.16;
    }

    @Override
    public double getUSD() {
        return 0.207;
    }

    @Override
    public double converterMoeda(String nomeMoeda, double taxaCambio, double quantidade, String nomeMoedaConverter) {
        return super.converterMoeda(nomeMoeda, taxaCambio, quantidade, nomeMoedaConverter);
    }
}
