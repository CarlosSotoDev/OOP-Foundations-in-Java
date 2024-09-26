public class Main {
    public static void main(String[] args) {

        Animal myAnimal = new Animal();  // Crea un objeto de tipo Animal
        Animal myDog = new Dog();        // Crea un objeto de tipo Dog, pero lo referencia como Animal

        myAnimal.makeSound(); // Salida: Animal hace un sonido
        myDog.makeSound();    // Salida: El perro ladra

        // No se puede llamar a myDog.wagTail() directamente porque myDog está referenciado como Animal
        // Se necesita hacer casting:
        ((Dog) myDog).wagTail(); // Salida: El perro mueve la cola

    }
}