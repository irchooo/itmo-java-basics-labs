package itmo.java.basics.lab3.task2;

/*
    1 - Создать простой класс с полями: цвет, название, вес.
    2 - Создать метод в классе для вывода всех этих данных.
    3 - Добавить два объекта, установить для них значения и вывести все с помощью ранее созданного метода.
    4 - Добавить несколько конструкторов, которые будут устанавливать:
         - только цвет машины;
         - цвет и вес машины;
         - и пустой конструктор.
*/

public class Car {
    private Color color;
    private String name;
    private Integer weightKg;

    //конструкторы
    public Car(Color color) {
        this.color = color;
    }

    public Car(Color color, Integer weightKg) {
        this.color = color;
        this.weightKg = weightKg;
    }

    public Car() {
    }

    //геттеры и сеттеры
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeightKg() {
        return weightKg;
    }
    public void setWeightKg(Integer weightKg) {
        this.weightKg = weightKg;
    }

    //метод для вывода
    public String getInfo() {
        return "\n--> Данные о машине <--\nЦвет:" + color
                + "\nНазвание модели: " + name + "\nВес модели, кг: " + weightKg;
    }
}
