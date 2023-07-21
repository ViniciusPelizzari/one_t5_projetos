package temperaturas;

public class FormulaCelsius {

    public double celsiusToFahrenheit;
    public double celsiusToKelvin;
    public double CelsiusToFahrenheit(double temperaturaCelsius){
        double temperatura =  temperaturaCelsius * 9/5 + 32;
        setCelsiusToFahrenheit(temperatura);
        return temperatura;
    }

    public double CelsiusToKelvin(double temperaturaCelsius){
        double temperatura =  temperaturaCelsius + 273.15;
        setCelsiusToKelvin(temperatura);
        return temperatura;
    }

    public double getCelsiusToFahrenheit() {
        return celsiusToFahrenheit;
    }


    public void setCelsiusToFahrenheit(double celsiusToFahrenheit) {
        this.celsiusToFahrenheit = celsiusToFahrenheit;
    }

    public double getCelsiusToKelvin() {
        return celsiusToKelvin;
    }

    public void setCelsiusToKelvin(double celsiusToKelvin) {
        this.celsiusToKelvin = celsiusToKelvin;
    }
}
