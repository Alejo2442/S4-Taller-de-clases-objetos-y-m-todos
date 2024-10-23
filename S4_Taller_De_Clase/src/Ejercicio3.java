import javax.swing.JOptionPane;

public class Ejercicio3 {

    public static void main(String[] args) {
        String numeroMotor = JOptionPane.showInputDialog("Ingrese el número de motor:");
        int numeroVentanas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de ventanas:"));
        int numeroPuertas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de puertas:"));
        String marca = JOptionPane.showInputDialog("Ingrese la marca del vehículo:");
        String modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehículo:");
        double kilometrajeInicial = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el kilometraje inicial:"));
        double kilometrajeFinal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el kilometraje final:"));

        double kilometrosRecorridos = kilometrajeFinal - kilometrajeInicial;

        JOptionPane.showMessageDialog(null,
                "Número de Motor: " + numeroMotor + "\n" +
                        "Número de Ventanas: " + numeroVentanas + "\n" +
                        "Número de Puertas: " + numeroPuertas + "\n" +
                        "Marca: " + marca + "\n" +
                        "Modelo: " + modelo + "\n" +
                        "Kilometraje Inicial: " + kilometrajeInicial + "\n" +
                        "Kilometraje Final: " + kilometrajeFinal + "\n" +
                        "Kilómetros Recorridos: " + kilometrosRecorridos);
    }
}
