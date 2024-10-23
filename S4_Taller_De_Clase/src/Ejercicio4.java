import javax.swing.JOptionPane;

public class Ejercicio4 {

    public static void main(String[] args) {
        String nombreProducto = JOptionPane.showInputDialog("Ingrese el nombre del producto:");
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto:"));
        int tieneIVA = JOptionPane.showConfirmDialog(null, "¿El producto tiene IVA?", "IVA", JOptionPane.YES_NO_OPTION);

        double iva = 0;

        if (tieneIVA == JOptionPane.YES_OPTION) {
            if (precio <= 500) {
                iva = precio * 0.12;
            } else if (precio > 500 && precio <= 1500) {
                iva = precio * 0.14;
            } else if (precio > 1500) {
                iva = precio * 0.15;
            }
        }

        double total = precio + iva;

        JOptionPane.showMessageDialog(null,
                "Producto: " + nombreProducto + "\n" +
                        "Precio: $" + precio + "\n" +
                        "IVA: $" + iva + "\n" +
                        "Precio Total: $" + total);
    }
}
