package itmo.java.basics.lab6.tasks1_2;

abstract class Person implements Identifiable{
    private String name;
    private String surname;

    public Person (String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    //абстрактный метод для вывода всей инфы
    public abstract void printAllInfo();
}