public class Main {
    public static void main(String[] args) {
        Pago pagoTarjeta = new PagoTarjetaCredito(1500.00, "1234-5678-9012-3456");
        pagoTarjeta.mostrarMonto();  // Muestra el monto
        pagoTarjeta.procesarPago();  // Procesa el pago con tarjeta de crédito

        Pago pagoEfectivo = new PagoEfectivo(500.00);
        pagoEfectivo.mostrarMonto();  // Muestra el monto
        pagoEfectivo.procesarPago();  // Procesa el pago en efectivo
    }
}
