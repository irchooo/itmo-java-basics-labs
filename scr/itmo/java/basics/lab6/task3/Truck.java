package itmo.java.basics.lab6.task3;

public class Truck extends Car{
    private int wheelsNumber;
    private int maxWeightKg;

    public void newWheels(int newWheelsNumber) {
        System.out.println("Установленное количество колёс для " + getModel() + " при создании экземпляра: " + this.wheelsNumber);
        this.wheelsNumber = newWheelsNumber;
        System.out.println("Новое установленное количество колёс для " + getModel() + ": " + this.wheelsNumber);
        System.out.println();
    }

    public Truck(int w, String m, char c, float s, int wheelsNumber, int maxWeightKg) {
        super(w, m, c, s);
        this.wheelsNumber = wheelsNumber;
        this.maxWeightKg = maxWeightKg;
    }
}
