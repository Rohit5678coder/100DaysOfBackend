public class ElectricCar extends Car{
    int batteryRange;

    public ElectricCar(String brand,int speed,int batteryRange){
        super(brand,speed);
        this.batteryRange=batteryRange;

    }

    public void showRange(){
        System.out.println(brand+"has a range"+batteryRange +"km");
        
    }
}