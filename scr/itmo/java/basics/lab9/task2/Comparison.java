package itmo.java.basics.lab9.task2;

import java.util.List;
import java.util.Random;

public class Comparison {

    //метод для добавления случайных эл-ов в список
    public static void addElements(List<Integer> list, int listSize) {
        if (listSize <= 0) {
            System.out.println("Некорректный размер списка, список не заполнен!");
        }

        Random random = new Random();
        for (int i = 0; i < listSize; i++) {
            list.add(random.nextInt(1_000_000));
        }
        //System.out.println("Заполненный список: " + list);
    }

    //метод, который выбирает случайный элемент из заполненного списка 100 000 раз
    public static void selectRandomElements(List<Integer> list, int elementsNumber) {
        Random random = new Random();
        for (int i = 0; i < elementsNumber; i++) {
                int randomIndex = random.nextInt(list.size());
                list.get(randomIndex);
        }
    }

    //метод для измерения времени, потребовавшегося на выбор случайных элементов из списка
    public static long measureTime(Runnable operation) {
        long startTime = System.currentTimeMillis();
        operation.run();
        return System.currentTimeMillis() - startTime;
    }
}
