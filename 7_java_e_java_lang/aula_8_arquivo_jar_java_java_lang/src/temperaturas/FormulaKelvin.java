package temperaturas;

public class FormulaKelvin {

    public double kelvinToFahrenheit;
    public double kelvinToCelsius;
    public double KelvinToFahrenheit(double temperaturaKelvin){
        double temperatura =  (temperaturaKelvin - 273.15) * 9/5 + 32;
        setKelvinToFahrenheit(temperatura);
        return temperatura;
    }

    public double KelvinToCelsius(double temperaturaKelvin){
        double temperatura =  temperaturaKelvin - 273.15;
        setKelvinToCelsius(temperatura);
        return temperatura;
    }

    public double getKelvinToFahrenheit() {
        return kelvinToFahrenheit;
    }

    public void setKelvinToFahrenheit(double kelvinToFahrenheit) {
        this.kelvinToFahrenheit = kelvinToFahrenheit;
    }

    public double getKelvinToCelsius() {
        return kelvinToCelsius;
    }

    public void setKelvinToCelsius(double kelvinToCelsius) {
        this.kelvinToCelsius = kelvinToCelsius;
    }
}
