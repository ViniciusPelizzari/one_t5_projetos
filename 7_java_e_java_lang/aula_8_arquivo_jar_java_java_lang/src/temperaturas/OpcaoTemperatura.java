package temperaturas;

public class OpcaoTemperatura {

    public static void Temperaturas(){
        Temperaturas temperaturas = new Temperaturas();
        String temperaturaSelecionada = temperaturas.escolhaT;
        System.out.println("Temperatura selecionada: " + temperaturaSelecionada);
        if(temperaturaSelecionada.equals("Celsius (°C)")){
            new Celsius();
        } else if (temperaturaSelecionada.equals("Fahrenheit (°F)")){
            new Fahrenheit();
        } else if (temperaturaSelecionada.equals("Kelvin (K)")) {
            new Kelvin();
        }

    }
}
