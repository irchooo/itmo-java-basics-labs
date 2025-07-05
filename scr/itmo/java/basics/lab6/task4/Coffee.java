package itmo.java.basics.lab6.task4;

public class Coffee extends Drink{
    private String name;
    private String coffeeSort;

    public Coffee(String name, String coffeeSort) {
        super();
        this.name = name;
        this.coffeeSort = coffeeSort;
    }

    public String printAllInfo() {
        return "\nНаименование напитка: " + this.name
                + "\nОбъем: " + volumeMl
                + "\nСорт кофе: " + coffeeSort;
    }
}
