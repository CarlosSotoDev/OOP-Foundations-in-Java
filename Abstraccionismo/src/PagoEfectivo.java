// Implementación concreta para pagos en efectivo
class PagoEfectivo extends Pago {

    public PagoEfectivo(double monto) {
        super(monto);
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando el pago en efectivo.");
        // Aquí podría ir la lógica para procesar el pago en efectivo
    }
}