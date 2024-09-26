
### Explicación de Encapsulamiento:
El encapsulamiento es uno de los conceptos fundamentales de la programación orientada a objetos (POO). Consiste en agrupar los datos (variables) y los métodos (funciones) que operan sobre esos datos en una única unidad o clase, restringiendo el acceso a algunos de los componentes del objeto. Esto se hace para proteger la integridad de los datos, evitando que sean accedidos o modificados de manera no controlada desde fuera de la clase. El encapsulamiento garantiza que la representación interna de un objeto esté oculta, y el acceso se proporciona a través de métodos públicos (getters y setters).

En el código proporcionado, el encapsulamiento se demuestra al hacer que los atributos de la clase `Humano` sean privados, lo que significa que no pueden ser accedidos directamente desde fuera de la clase. En cambio, el acceso se proporciona a través de métodos públicos (getters y setters), asegurando un acceso controlado a los datos del objeto.

### Código Documentado:

#### Clase Principal:
```java
public class Main {
    public static void main(String[] args) {
        // Se crea una instancia de la clase Humano
        Humano humano = new Humano();

        // Se establecen los valores para los atributos del objeto humano
        humano.setNombre("Carlos"); // Usamos el método setter para asignar el nombre
        humano.setSexo("Masculino"); // Usamos el método setter para asignar el sexo
        humano.setEdad(22); // Usamos el método setter para asignar la edad

        // Se imprimen los valores de los atributos utilizando los métodos getter
        System.out.println(humano.getNombre()); // Obtiene y muestra el nombre
        System.out.println(humano.getSexo());   // Obtiene y muestra el sexo
        System.out.println(humano.getEdad());   // Obtiene y muestra la edad
    }
}
```

#### Explicación de la Clase Principal:
1. Se crea un objeto de la clase `Humano`.
2. Usando los métodos `setNombre`, `setSexo` y `setEdad`, se establecen los valores de los atributos del objeto `Humano`. Este es un ejemplo de encapsulamiento, ya que no se están modificando directamente las variables del objeto, sino a través de métodos que controlan el acceso y la modificación.
3. Los métodos `getNombre`, `getSexo` y `getEdad` se utilizan para recuperar y mostrar los atributos del objeto, lo que demuestra aún más el uso del encapsulamiento.

#### Clase Humano:
```java
public class Humano {
    // Atributos privados para proteger el acceso directo a los datos
    private String nombre;
    private String sexo;
    private int edad;

    // Constructor por defecto que inicializa los atributos
    public Humano() {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
    }

    // Métodos getter para obtener los valores de los atributos
    public String getNombre() {
        return nombre;
    }

    // Métodos setter para establecer los valores de los atributos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
}
```

#### Explicación de la Clase Humano:
1. **Atributos Privados:** Los atributos `nombre`, `sexo` y `edad` están declarados como privados, lo que significa que no pueden ser accedidos directamente desde fuera de la clase. Este es el núcleo del encapsulamiento, ya que oculta el estado interno.
2. **Getters y Setters:** Estos métodos públicos proporcionan acceso controlado a los atributos privados. Los métodos `get` se usan para recuperar el valor de los atributos, y los métodos `set` se usan para modificarlos. Esto garantiza que el acceso externo a los datos esté regulado.

En resumen, el encapsulamiento se aplica de manera efectiva aquí al mantener los atributos privados y exponerlos a través de métodos getter y setter públicos. Este patrón ayuda a garantizar que los datos permanezcan consistentes y seguros, al mismo tiempo que permite el acceso externo de manera controlada.