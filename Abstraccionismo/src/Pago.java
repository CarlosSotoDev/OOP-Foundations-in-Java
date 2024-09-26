// Clase abstracta que define el comportamiento general de un pago
abstract class Pago {
    protected double monto;

    public Pago(double monto) {
        this.monto = monto;
    }

    // Método abstracto que debe implementarse en las clases hijas
    public abstract void procesarPago();

    // Método concreto que podemos usar en todas las subclases
    public void mostrarMonto() {
        System.out.println("El monto a pagar es: " + monto);
    }
}