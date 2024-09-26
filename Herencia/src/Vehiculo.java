public class Vehiculo {
    private int wheels;
    private String marca;

    //Metodoa
    public void move(){
        System.out.println("The vehicle is moving");
    }

    //Cosntructor
    public Vehiculo(int wheels, String marca) {
        this.wheels = wheels;
        this.marca = marca;
    }


    //Getters and Setters
    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels){
        this.wheels = wheels;
    }

    public String getMarca(){
        return marca;
    }

    public void getMarca(String marca){
        this.marca = marca;
    }

    // Método toString para representar el objeto como una cadena

    public void showInfo() {
        System.out.println("WHEELS: " + wheels);
        System.out.println("MARCA: " + marca);
    }
}





