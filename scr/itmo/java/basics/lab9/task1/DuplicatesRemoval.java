package itmo.java.basics.lab9.task1;

import java.util.*;

public class DuplicatesRemoval {
    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        System.out.println("Коллекция: " + collection);
        Set<T> uniqueSet = new HashSet<>(collection);
        return uniqueSet;
    }

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>(List.of("banana", "strawberry", "banana", "cucumber"));
        System.out.println("Коллекция без дубликатов: " + removeDuplicates(arrayList));
    }
}
