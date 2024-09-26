La **abstracción** en la Programación Orientada a Objetos (POO) es un concepto que permite enfocar el diseño del software en los **aspectos esenciales** del sistema, ocultando los detalles complejos o irrelevantes para el usuario. La abstracción ayuda a simplificar la complejidad al centrarse en lo que un objeto **hace** en lugar de cómo lo hace.

### Concepto de Abstracción en Java

En Java, la abstracción se puede lograr utilizando **clases abstractas** y **interfaces**. Estos mecanismos permiten definir **qué** hará una clase, pero no necesariamente **cómo** lo hará.

1. **Clase Abstracta**:
    - Es una clase que no se puede instanciar directamente.
    - Puede contener métodos abstractos (sin implementación) y métodos concretos (con implementación).
    - Sirve como plantilla para que otras clases hereden de ella y proporcionen la implementación de los métodos abstractos.

2. **Interface**:
    - Define un conjunto de métodos que una clase debe implementar.
    - Todas las interfaces son 100% abstractas (hasta Java 8), es decir, no contienen implementaciones (hasta que se introdujeron los métodos `default`).
    - Una clase puede implementar múltiples interfaces.

### Ejemplo explícito

Vamos a crear un ejemplo que ilustre el uso de la abstracción mediante una clase abstracta y una implementación concreta.

#### Caso: Sistema de Pago

Supongamos que estamos diseñando un sistema que maneja pagos. Queremos abstraer la forma en que se procesan los pagos, de modo que el sistema pueda soportar diferentes métodos de pago sin conocer los detalles de cada uno.

```java
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
```

#### Explicación del ejemplo:

1. **Clase abstracta `Pago`:**
    - Tiene un método abstracto `procesarPago()` que debe ser implementado por las clases concretas (como `PagoTarjetaCredito` y `PagoEfectivo`).
    - También contiene un método concreto `mostrarMonto()` que imprime el monto del pago. Este método no necesita ser implementado en las subclases porque ya tiene una implementación común.

2. **Clase concreta `PagoTarjetaCredito`:**
    - Extiende de `Pago` e implementa el método abstracto `procesarPago()`. En este caso, especifica la lógica particular para procesar pagos con tarjeta de crédito.

3. **Clase concreta `PagoEfectivo`:**
    - Extiende de `Pago` e implementa el método abstracto `procesarPago()` con la lógica específica para pagos en efectivo.

#### Uso de las clases:

```java
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
```

#### Salida del código:

```
El monto a pagar es: 1500.0
Procesando el pago con tarjeta de crédito: 1234-5678-9012-3456
El monto a pagar es: 500.0
Procesando el pago en efectivo.
```

### Conclusión

La abstracción en POO nos permite definir **qué** hace un objeto, sin necesidad de especificar **cómo** lo hace hasta las subclases concretas. En el ejemplo, hemos definido un contrato común para todos los tipos de pagos mediante la clase abstracta `Pago`, pero la lógica específica de procesamiento se ha delegado a las subclases `PagoTarjetaCredito` y `PagoEfectivo`.

Esta técnica permite que el código sea más flexible y fácil de mantener, ya que si en el futuro agregamos un nuevo método de pago, solo necesitamos crear una nueva subclase que implemente el método abstracto, sin modificar el código existente.