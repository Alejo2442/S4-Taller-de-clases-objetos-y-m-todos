import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ejercicio2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese el primer número:");
        double numero1 = Double.parseDouble(br.readLine());

        System.out.println("Ingrese el segundo número:");
        double numero2 = Double.parseDouble(br.readLine());

        System.out.println("Seleccione la operación: 1. Suma 2. Resta 3. Multiplicación 4. División");
        int opcion = Integer.parseInt(br.readLine());

        switch(opcion) {
            case 1:
                sumar(numero1, numero2);
                break;
            case 2:
                restar(numero1, numero2);
                break;
            case 3:
                multiplicar(numero1, numero2);
                break;
            case 4:
                dividir(numero1, numero2);
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }

    public static void sumar(double num1, double num2) {
        double resultado = num1 + num2;
        System.out.println("El resultado de la suma es: " + resultado);
    }

    public static void restar(double num1, double num2) {
        double resultado = num1 - num2;
        System.out.println("El resultado de la resta es: " + resultado);
    }

    public static void multiplicar(double num1, double num2) {
        double resultado = num1 * num2;
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }

    public static void dividir(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: No se puede dividir entre cero.");
        } else {
            double resultado = num1 / num2;
            System.out.println("El resultado de la división es: " + resultado);
        }
    }
}
