import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ejercicio1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Seleccione la figura: 1. Triángulo 2. Cuadrado 3. Rectángulo");
        int opcion = Integer.parseInt(br.readLine());

        switch(opcion) {
            case 1:
                calcularTriangulo(br);
                break;
            case 2:
                calcularCuadrado(br);
                break;
            case 3:
                calcularRectangulo(br);
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }

    public static void calcularTriangulo(BufferedReader br) throws IOException {
        System.out.println("Ingrese la base del triángulo:");
        double base = Double.parseDouble(br.readLine());
        System.out.println("Ingrese la altura del triángulo:");
        double altura = Double.parseDouble(br.readLine());
        double area = (base * altura) / 2;

        System.out.println("Ingrese los tres lados del triángulo:");
        double lado1 = Double.parseDouble(br.readLine());
        double lado2 = Double.parseDouble(br.readLine());
        double lado3 = Double.parseDouble(br.readLine());
        double perimetro = lado1 + lado2 + lado3;

        System.out.println("Área del triángulo: " + area);
        System.out.println("Perímetro del triángulo: " + perimetro);
    }

    public static void calcularCuadrado(BufferedReader br) throws IOException {
        System.out.println("Ingrese el lado del cuadrado:");
        double lado = Double.parseDouble(br.readLine());
        double area = lado * lado;
        double perimetro = 4 * lado;

        System.out.println("Área del cuadrado: " + area);
        System.out.println("Perímetro del cuadrado: " + perimetro);
    }

    public static void calcularRectangulo(BufferedReader br) throws IOException {
        System.out.println("Ingrese la base del rectángulo:");
        double base = Double.parseDouble(br.readLine());
        System.out.println("Ingrese la altura del rectángulo:");
        double altura = Double.parseDouble(br.readLine());
        double area = base * altura;
        double perimetro = 2 * (base + altura);

        System.out.println("Área del rectángulo: " + area);
        System.out.println("Perímetro del rectángulo: " + perimetro);
    }
}
