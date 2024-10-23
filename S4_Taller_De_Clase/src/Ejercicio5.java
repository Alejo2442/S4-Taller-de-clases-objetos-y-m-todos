import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Ejercicio5 {
    private String cedula;
    private String nombre;
    private String apellido;
    private String genero;
    private double salario;
    private LocalDate fechaNacimiento;
    private LocalDate fechaIngreso;

    public Ejercicio5(String cedula, String nombre, String apellido, String genero, double salario, LocalDate fechaNacimiento, LocalDate fechaIngreso) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.salario = salario;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
    }

    public void modificarSalario(double nuevoSalario) {
        this.salario = nuevoSalario;
    }

    public int calcularEdad() {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    public int calcularAntiguedad() {
        return Period.between(fechaIngreso, LocalDate.now()).getYears();
    }

    public double calcularPrestaciones() {
        int antiguedad = calcularAntiguedad();
        return (antiguedad * salario) / 12;
    }

    public void mostrarInformacion() {
        System.out.println("Cédula: " + cedula);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Género: " + genero);
        System.out.println("Salario: $" + salario);
        System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
        System.out.println("Fecha de Ingreso: " + fechaIngreso);
        System.out.println("Edad: " + calcularEdad() + " años");
        System.out.println("Antigüedad: " + calcularAntiguedad() + " años");
        System.out.println("Prestaciones: $" + calcularPrestaciones());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cédula: ");
        String cedula = scanner.nextLine();

        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingrese el género: ");
        String genero = scanner.nextLine();

        System.out.print("Ingrese el salario: ");
        double salario = scanner.nextDouble();

        System.out.print("Ingrese la fecha de nacimiento (YYYY-MM-DD): ");
        LocalDate fechaNacimiento = LocalDate.parse(scanner.next());

        System.out.print("Ingrese la fecha de ingreso (YYYY-MM-DD): ");
        LocalDate fechaIngreso = LocalDate.parse(scanner.next());

        Ejercicio5 empleado = new Ejercicio5(cedula, nombre, apellido, genero, salario, fechaNacimiento, fechaIngreso);
        empleado.mostrarInformacion();

        System.out.print("¿Desea modificar el salario? (S/N): ");
        String opcion = scanner.next();

        if (opcion.equalsIgnoreCase("S")) {
            System.out.print("Ingrese el nuevo salario: ");
            double nuevoSalario = scanner.nextDouble();
            empleado.modificarSalario(nuevoSalario);
        }

        System.out.println("\nInformación actualizada:");
        empleado.mostrarInformacion();

        scanner.close();
    }
}
