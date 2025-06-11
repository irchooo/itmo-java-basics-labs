package itmo.java.basics.lab1;

public class DataTypes {
    public static void main(String[] args) {
        System.out.println("Задача 1:\n" + outputString());
        System.out.println();

        System.out.println("Задача 2:\n" + calculateExpression1());
        System.out.println(calculateExpression2());
        System.out.println();

        System.out.println("Задача 3:\n" + calculateExpression3());
        System.out.println();

        System.out.println("Задача 4:\n" + calculateExpression4());
    }

    public static String outputString() {
        return "Я\nхорошо\nзнаю\nJava";
    }

    public static double calculateExpression1() {
        return (46 + 10) * (10 / 3.0);
    }

    public static int calculateExpression2() {
        return 29 * 4 * (-15);
    }

    public static int calculateExpression3() {
        int number = 10500;
        return (number / 10) / 10;
    }

    public static double calculateExpression4() {
        double number1 = 3.6;
        double number2 = 4.1;
        double number3 = 5.9;
        double result = number1 * number2 * number3;
        return result;
    }
}
