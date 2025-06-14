package itmo.java.basics.lab2;

public class Calculator {

    //addition methods
    public static int calcAdd(int number1, int number2) {
        return number1 + number2;
    }
    public static long calcAdd(long number1, long number2) {
        return number1 + number2;
    }
    public static double calcAdd(double number1, double number2) {
        return number1 + number2;
    }

    //subtraction methods
    public static int calcSub(int number1, int number2) {
        return number1 - number2;
    }
    public static long calcSub(long number1, long number2) {
        return number1 - number2;
    }
    public static double calcSub(double number1, double number2) {
        return number1 - number2;
    }

    //multiplication methods
    public static int calcMul(int number1, int number2) {
        return number1 * number2;
    }
    public static long calcMul(long number1, long number2) {
        return number1 * number2;
    }
    public static double calcMul(double number1, double number2) {
        return number1 * number2;
    }

    //division methods
    public static int calcDiv(int number1, int number2) {
        if (number2 != 0) {
            return number1 / number2;
        } else {
            System.out.println("Ошибка - деление на ноль");
            return 0;
        }
    }
    public static long calcDiv(long number1, long number2) {
        if (number2 != 0) {
            return number1 / number2;
        } else {
            System.out.println("Ошибка - деление на ноль");
            return 0;
        }
    }
    public static double calcDiv(double number1, double number2) {
        if (number2 != 0) {
            return number1 / number2;
        } else {
            System.out.println("Ошибка - деление на ноль");
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Тестирование сложения:");
        System.out.println("13 + 2 = " + calcAdd(13, 2));
        System.out.println("20000000000000 + 10000000000000 = " + calcAdd(20000000000000L, 10000000000000L));
        System.out.println("2.22 + 1.1 = " + calcAdd(2.22, 1.1 ));
        System.out.println();

        System.out.println("Тестирование вычитания:");
        System.out.println("13 - 13 = " + calcSub(13, 13));
        System.out.println("20000000000000 - 10000000000000 = " + calcSub(20000000000000L, 10000000000000L));
        System.out.println("2.22 - 1.1 = " + calcSub(2.22, 1.1));
        System.out.println();

        System.out.println("Тестирование умножения:");
        System.out.println("20 * 10 = " + calcMul(20, 10));
        System.out.println("20000000000000 * 20000000000000 = " + calcMul(20000000000000L, 20000000000000L));
        System.out.println("2.22 * 1.1 = " + calcMul(2.22, 1.1));
        System.out.println();

        System.out.println("Тестирование деления:");
        System.out.println("13 / 0 = " + calcDiv(13, 0));
        System.out.println("20000000000000 / 0 = " + calcDiv(20000000000000L, 0));
        System.out.println("1.3 / 0 = " + calcDiv(1.3, 0));

        System.out.println("0 / 10 = " + calcDiv(0, 10));
        System.out.println("20 / 10 = " + calcDiv(20, 10));
        System.out.println("2.22 / 1.1 = " + calcDiv(2.22, 1.1));
        System.out.println("20000000000000 / 20000000000000 = " + calcDiv(20000000000000L, 20000000000000L));
    }
}
