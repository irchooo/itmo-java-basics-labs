package itmo.java.basics.lab9.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя пользователя: ");
        String inputName = scanner.nextLine();

        UserGameService userGameService = new UserGameService();
        userGameService.printUserScore(inputName);

        scanner.close();
    }
}
