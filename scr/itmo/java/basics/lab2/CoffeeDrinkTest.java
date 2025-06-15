package itmo.java.basics.lab2;

import static itmo.java.basics.lab2.Size.MEDIUM;
import static itmo.java.basics.lab2.Size.SMALL;

public class CoffeeDrinkTest {
    public static void main(String[] args) {
        CoffeeDrink coffeeDrink1 = new CoffeeDrink();
        CoffeeDrink coffeeDrink2 = new CoffeeDrink("Lavender Raf", MEDIUM, true, 300);

        System.out.println(coffeeDrink1);
        System.out.println(coffeeDrink2);
        System.out.println();

        coffeeDrink1.setName("Ballerina Cappuccino");
        coffeeDrink1.setSize(SMALL);
        coffeeDrink1.setIsFromSeasonalMenu(false);
        coffeeDrink1.setPrice(250);
        System.out.println("Coffee Drink '" + coffeeDrink1.getName() + "'\nSize: "+ coffeeDrink1.getSize()
                            + "\nPrice: "+ coffeeDrink1.getPrice());
    }
}
