
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada: temperatura em Celsius
        System.out.print("Digite a temperatura em graus Celsius (°C): ");
        double celsius = scanner.nextDouble();

        // Conversão para Fahrenheit e Kelvin
        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;

        // Exibição dos resultados
        System.out.println("\n=== Conversão de Temperatura ===");
        System.out.printf("Temperatura em Celsius: %.2f °C\n", celsius);
        System.out.printf("Temperatura em Fahrenheit: %.2f °F\n", fahrenheit);
        System.out.printf("Temperatura em Kelvin: %.2f K\n", kelvin);

        scanner.close();
    }
}
