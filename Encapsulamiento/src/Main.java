public class Main {
    public static void main(String[] args) {
        Humano humano = new Humano();

        humano.setNombre("Carlos");
        humano.setSexo("Masculino");
        humano.setEdad(22);

        System.out.println(humano.getNombre());
        System.out.println(humano.getSexo());
        System.out.println(humano.getEdad());
    }
}