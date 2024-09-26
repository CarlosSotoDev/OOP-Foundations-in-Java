// Implementación concreta para pagos con tarjeta de crédito
class PagoTarjetaCredito extends Pago {
    private String numeroTarjeta;

    public PagoTarjetaCredito(double monto, String numeroTarjeta) {
        super(monto);
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando el pago con tarjeta de crédito: " + numeroTarjeta);
        // Aquí podría ir la lógica para procesar el pago con la tarjeta de crédito
    }
}
