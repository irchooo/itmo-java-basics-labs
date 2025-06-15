package itmo.java.basics.lab3.task3;

/*
    1 - Создать класс Дом
        * поля: количество этажей, год постройки, наименование;
        * метод для установки всех значений;
        * метод для вывода всех значений;
        * метод, возвращающий количество лет с момента постройки.
    2 - На основе класса создать 2 объекта и прописать для каждого характеристики.
    3 - Добавить характеристики для каждого через метод класса.
    4 - Вывести информацию про каждый объект.
*/

import java.time.LocalDate;
import java.util.Scanner;

public class House {
    private String name;
    private int constructionYear;
    private int floorsNumber;

    public House() {

    }

    public void setAllInfo(String name, int constructionYear, int floorsNumber) {
        this.name = name;
        this.constructionYear = constructionYear;
        this.floorsNumber = floorsNumber;
    }

    public String getInfo() {
        return "\n--> Данные о доме <--\nНаименование: " + name
                + "\nГод постройки: " + constructionYear + "\nКоличество этажей: " + floorsNumber;
    }

    //вычисление "возраста" дома с помощью встроенного метода
    public int yearsNumberCounter1() {
        System.out.println();
        System.out.println("Давайте вычислим, насколько старый дом!");
        int currentYear = LocalDate.now().getYear();
        return currentYear - constructionYear;
    }

    //вычисление "возраста" дома с помощью данных, введенных пользователем
    public int yearsNumberCounter2() {
        System.out.println();
        System.out.println("Давайте вычислим, насколько старый дом!");
        System.out.println("Пожалуйста, введите текущий год: ");
        Scanner scanner = new Scanner(System.in);

        int currentYear = scanner.nextInt();
        return currentYear - constructionYear;
    }
}
