package itmo.java.basics.lab3.task4;

/*
    1 - Создать класс Tree с полями: возраст, живое ли дерево и название дерева.
    2 - Создать 3 конструктора:
        * который устанавливает только возраст и название;
        * который устанавливает все переменные в классе;
        * который ничего не устанавливает, но выводит сообщение
            «Пустой конструктор без параметров сработал».
    3 - Создать 3 объекта на основе класса и использовать по одному конструктору на каждый.
*/
public class Tree {
    private String name;
    private int age;
    private Boolean isAlive;

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
        System.out.println();
    }

    public Tree(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Tree(String name, int age, Boolean isAlive) {
        this.name = name;
        this.age = age;
        this.isAlive = isAlive;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isAlive=" + isAlive +
                '}';
    }
}
