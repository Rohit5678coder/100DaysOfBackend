public class Car implements Drivable {
    String brand;
    int speed;

    public Car(String brand,int speed){
        this.brand=brand;
        this.speed=speed;

    }

    public void drive(){
        System.out.println(brand +"is driving at"+speed +"km/h");
    }


}