public class Car extends Vehiculo {
    private String color;

    public Car(int wheels,String marca, String color){
        super(wheels,marca);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Color: " + color);
    }


}
