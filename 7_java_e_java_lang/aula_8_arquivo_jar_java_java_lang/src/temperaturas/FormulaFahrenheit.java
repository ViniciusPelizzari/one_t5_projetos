package temperaturas;

public class FormulaFahrenheit {

    public double fahrenheitToCelsius;
    public double fahrenheitToKelvin;
    public double FahrenheitToCelsius(double temperaturaFahrenheit){
        double temperatura =  (temperaturaFahrenheit - 32) * 5/9;
        setFahrenheitToCelsius(temperatura);
        return temperatura;
    }

    public double FahrenheitToKelvin(double temperaturaFahrenheit){
        double temperatura =  (temperaturaFahrenheit - 32) * 5/9 + 273.15;
        setFahrenheitToKelvin(temperatura);
        return temperatura;
    }

    public double getFahrenheitToCelsius() {
        return fahrenheitToCelsius;
    }

    public void setFahrenheitToCelsius(double fahrenheitToCelsius) {
        this.fahrenheitToCelsius = fahrenheitToCelsius;
    }

    public double getFahrenheitToKelvin() {
        return fahrenheitToKelvin;
    }

    public void setFahrenheitToKelvin(double fahrenheitToKelvin) {
        this.fahrenheitToKelvin = fahrenheitToKelvin;
    }
}
