### Principio de Herencia:

La **herencia** es uno de los principios fundamentales de la Programación Orientada a Objetos (POO). Permite que una clase (llamada clase hija o subclase) herede atributos y métodos de otra clase (llamada clase padre o superclase). Esto promueve la reutilización de código y establece una jerarquía entre las clases.

Cuando una clase hereda de otra, automáticamente tiene acceso a los atributos y métodos de la clase padre, pero también puede definir sus propios atributos y métodos, o sobrescribir (override) los métodos de la clase padre para cambiar su comportamiento.

### Ejemplo 1: Herencia básica

```java
// Clase padre o superclase
public class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

// Clase hija o subclase
public class Perro extends Animal {

    // Constructor que llama al constructor de la clase padre
    public Perro(String nombre) {
        super(nombre); // Llamamos al constructor de la clase Animal
    }

    // Sobrescribimos el método hacerSonido para cambiar el comportamiento
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra");
    }
}

// Clase principal para ejecutar el ejemplo
public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Rex");
        
        // Llamamos a métodos heredados
        System.out.println(perro.getNombre()); // Rex

        // Llamamos al método sobrescrito
        perro.hacerSonido(); // El perro ladra
    }
}
```

#### Explicación:
- En este ejemplo, la clase `Perro` hereda de la clase `Animal`. Como resultado, la clase `Perro` tiene acceso al método `getNombre` y al atributo `nombre`, que son definidos en la clase `Animal`.
- La clase `Perro` también sobrescribe el método `hacerSonido` para proporcionar un comportamiento específico ("El perro ladra").
- El uso de `super(nombre)` en el constructor de la clase `Perro` llama al constructor de la clase padre (`Animal`), permitiendo la inicialización correcta del objeto.

### Ejemplo 2: Herencia con más de una subclase

```java
// Clase padre o superclase
public class Vehiculo {
    private String marca;
    private int velocidadMaxima;

    public Vehiculo(String marca, int velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Velocidad Máxima: " + velocidadMaxima);
    }
}

// Subclase Coche que hereda de Vehiculo
public class Coche extends Vehiculo {
    private int numeroPuertas;

    public Coche(String marca, int velocidadMaxima, int numeroPuertas) {
        super(marca, velocidadMaxima);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    @Override
    public void mostrarInfo() {
        // Llamamos al método mostrarInfo() de la clase padre
        super.mostrarInfo();
        System.out.println("Número de puertas: " + numeroPuertas);
    }
}

// Subclase Moto que hereda de Vehiculo
public class Moto extends Vehiculo {
    private boolean tieneSidecar;

    public Moto(String marca, int velocidadMaxima, boolean tieneSidecar) {
        super(marca, velocidadMaxima);
        this.tieneSidecar = tieneSidecar;
    }

    public boolean isTieneSidecar() {
        return tieneSidecar;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("¿Tiene sidecar?: " + (tieneSidecar ? "Sí" : "No"));
    }
}

// Clase principal para ejecutar el ejemplo
public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota", 180, 4);
        Moto moto = new Moto("Yamaha", 120, false);

        // Llamamos a mostrarInfo() en ambos objetos
        coche.mostrarInfo(); 
        // Marca: Toyota, Velocidad Máxima: 180
        // Número de puertas: 4

        moto.mostrarInfo();
        // Marca: Yamaha, Velocidad Máxima: 120
        // ¿Tiene sidecar?: No
    }
}
```

#### Explicación:
- Aquí tenemos una clase padre `Vehiculo`, y dos clases hijas `Coche` y `Moto`.
- Ambas subclases heredan los atributos `marca` y `velocidadMaxima`, así como el método `mostrarInfo`, de la clase padre `Vehiculo`.
- Cada subclase tiene sus propios atributos adicionales (`numeroPuertas` en `Coche` y `tieneSidecar` en `Moto`), además de sus propios constructores y métodos sobrescritos.
- Las subclases también sobrescriben el método `mostrarInfo` para agregar información específica a su tipo de vehículo.

### Ventajas de la Herencia:
1. **Reutilización de Código:** Permite que las subclases reutilicen el código de la clase padre, evitando duplicación.
2. **Organización Jerárquica:** Facilita la creación de una estructura jerárquica donde las clases más generales se encuentran en la parte superior y las más específicas en la parte inferior.
3. **Polimorfismo:** Las subclases pueden sobrescribir los métodos de la clase padre para proporcionar comportamientos específicos, lo que facilita el polimorfismo.

En resumen, la herencia es una herramienta poderosa que permite reutilizar y extender el código de una manera más organizada y modular, creando relaciones jerárquicas entre las clases y mejorando la mantenibilidad del código.