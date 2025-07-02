package itmo.java.basics.lab5;


import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        //1
        System.out.println("--> Задача 1 <--");
        System.out.println("Введите текст для поиска самого длинного слова в нем: ");
        String userInput1 = readInput();
        System.out.println("Самое длинное слово в веденном тексте: " + findTheLongestWord(userInput1));
        System.out.println();
        //2
        System.out.println("--> Задача 2 <--");
        System.out.println("Введите слово для проверки на палиндром: ");
        String userInput2 = readInput();
        System.out.println("Метод с ручной инверсией: ");
        System.out.println(isPalindromeManual(userInput2));
        System.out.println("Метод с reverse: ");
        System.out.println(isPalindromeWithReverse(userInput2));
        System.out.println();
        //3
        System.out.println("--> Задача 3 <--");
        System.out.println("Введите текст с 'бякой': ");
        String userInput3 = readInput();
        System.out.println(replaceByaka(userInput3));
        System.out.println();
        //4
        System.out.println("--> Задача 4 <--");
        System.out.println("Введите строку: ");
        String userInput4 = readInput();
        System.out.println("Введите подстроку: ");
        String userSubstring = readInput();
        System.out.println("Количество вхождений подстроки в строку: " + countSubstringsOccurrences(userInput4, userSubstring));
        System.out.println();
        //5
        System.out.println("--> Задача 5 <--");
        System.out.println("Введите строку для инверсии ее слов: ");
        String userInput5 = readInput();
        System.out.println("Преобразованная строка: " + reverseWordByWord(userInput5));
        System.out.println();
    }

    public static String readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input == null || input.trim().isEmpty()) {
            input = "Введенная строка была пустой, поэтому будет обрабатываться эта!";
        }
        System.out.println("Вы ввели: " + input);
        return input;
    }

    public static String findTheLongestWord(String text) {
        String[] wordsArray = text.split(" ");
        String theLongestWord = "";
        for (String word : wordsArray) {
            if (word.length() > theLongestWord.length()) {
                theLongestWord = word;
            }
        }
        return theLongestWord;
    }

    public static boolean isPalindromeManual(String word) {
        boolean isPalindrome = false;
        if (word.contains(" ")) {
            System.out.println("Вы ввели несколько слов! Пожалуйста, ограничьтесь одним!");
            return isPalindrome;
        } else {
            word = word.toLowerCase();
            char[] wordChars = word.toCharArray();
            int leftPointer = 0;
            int rightPointer = wordChars.length - 1;

            while (leftPointer < rightPointer) {
                char temp = wordChars[leftPointer];
                wordChars[leftPointer] = wordChars[rightPointer];
                wordChars[rightPointer] = temp;
                leftPointer ++;
                rightPointer --;
            }
            String wordReversed = new String (wordChars);
            isPalindrome = word.equals(wordReversed);
            return isPalindrome;
        }
    }

    public static boolean isPalindromeWithReverse(String word) {
        boolean isPalindrome = false;
        if (word.contains(" ")) {
            System.out.println("Вы ввели несколько слов! Пожалуйста, ограничьтесь одним!");
            return isPalindrome;
        } else {
            word = word.toLowerCase();
            String wordReversed = new StringBuilder(word).reverse().toString();
            isPalindrome = word.equals(wordReversed);
            return isPalindrome;
        }
    }

    public static String replaceByaka(String text) {
        if (text.contains("бяка")) {
            return text.replaceAll("бяка", "[вырезано цензурой]");
        } else {
            return "Ваш текст не содержит слов, которые должны быть 'зацензурены'!";
        }
    }

    public static int countSubstringsOccurrences(String userString, String userSubstring) {
        int occurrencesCounter = 0;
        int i = 0;

        while (i != -1) {
            i = userString.indexOf(userSubstring, i);
            if (i != -1) {
                occurrencesCounter++;
                i += userSubstring.length();
            }
        }
        return occurrencesCounter;
    }

    public static String reverseWordByWord(String string) {
        StringBuilder reversedString = new StringBuilder();
        String[] wordsArray = string.trim().split(" ");
        for (String word : wordsArray) {
            word = new StringBuilder(word).reverse().toString();
            reversedString = reversedString.append(word).append(" ");
        }
        return reversedString.toString().trim();
    }
}
