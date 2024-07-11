package ConverterTemperatura;

public class Main {
    public static void main(String[] args) {

        double temperaturaCelsius = 28.3;
        double temperaturaFahrenheit = 85.0;

        System.out.println("[Convertendo de Celsius para Fahrenheit]");
        System.out.printf("\tCelsius: %.1f \n", temperaturaCelsius);
        System.out.printf("\tFahrenheit: %.1f \n\n", converterParaFahrenheit(temperaturaCelsius));

        System.out.println("[Convertendo de Fahrenheit para Celsius]");
        System.out.printf("\tFahrenheit: %.1f \n", temperaturaFahrenheit);
        System.out.printf("\tCelsius: %.1f \n\n", converterParaCelsius(temperaturaFahrenheit));

    }

    public static double converterParaFahrenheit(double _celsius) {
        return (_celsius * 9/5) + 32;
    }

    public static double converterParaCelsius(double _fahrenheit) {
        return (_fahrenheit - 32.0) * 5/9;
    }
}
