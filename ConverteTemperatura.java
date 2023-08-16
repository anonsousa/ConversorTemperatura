import java.util.Scanner;

public class ConverteTemperatura {
    public static void main(String[] args){
        double temperaturaCelsius = 0;
        double temperaturaFahrenheit = 0;
        double entrada;

        Scanner input = new Scanner(System.in);
        System.out.println("Quantos °C faz na sua cidade?: ");
        temperaturaCelsius = input.nextDouble();

        if (temperaturaCelsius >= -50 && temperaturaCelsius <= 45) {
            temperaturaFahrenheit = (temperaturaCelsius * 9 / 5) + 32;
            System.out.println("Temperatura em Fahrenheit: " + temperaturaFahrenheit + "°F.");
        } else {
            System.out.println("Parametro errado e/ou acima da realidade");
        }
    }
}