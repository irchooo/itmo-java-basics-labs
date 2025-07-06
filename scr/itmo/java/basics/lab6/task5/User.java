package itmo.java.basics.lab6.task5;

import java.util.Scanner;

public class User {
    protected Scanner scanner;
    protected int age;

    public User() {
        scanner = new Scanner(System.in);
        System.out.println("Введите возраст пользователя: ");
        int inputAge = scanner.nextInt();
        if (inputAge > 0 && inputAge < 120) {
            this.age = inputAge;
        } else {
            this.age = 0;
        }
    }

    public void printAge() {
        System.out.println("Возраст пользователя: " + this.age);
    }
}
