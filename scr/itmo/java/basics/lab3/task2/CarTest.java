package itmo.java.basics.lab3.task2;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(Color.DARK_PURPLE, 5000);

        car1.setColor(Color.TOTAL_BLACK);
        car1.setName("Tesla Cybertruck");
        car1.setWeightKg(3113);

        car2.setName("Monster Truck");

        System.out.println(car1.getInfo());
        System.out.println(car2.getInfo());
    }
}
