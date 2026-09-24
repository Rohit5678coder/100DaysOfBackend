public class Main {
    public static void main(String[] args){
        Car car1=new Car("Toyota",120);
        car1.drive();

        ElectricCar tesla=new ElectricCar("Tesla",200,500);
        tesla.drive();
        tesla.showRange();
    }

    
} 

