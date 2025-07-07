package itmo.java.basics.lab6.task3;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(3113, "Tesla CyberTruck", 'g', 200.0f);
        car.outPut();

        Truck truck = new Truck(5000, "Grave Digger", 'v', 160.0f, 4, 10000);
        truck.outPut();
        truck.newWheels(6);
    }
}
