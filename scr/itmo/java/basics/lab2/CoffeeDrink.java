package itmo.java.basics.lab2;

public class CoffeeDrink {
    private String name;
    private Size size;
    private Boolean isFromSeasonalMenu;
    private double price;

    //конструктор без параметров, заданный явно
    public CoffeeDrink() {
    }

    //конструктор со всеми параметрами
    public CoffeeDrink(String name, Size size, Boolean isFromSeasonalMenu, double price) {
        this.name = name;
        this.size = size;
        this.isFromSeasonalMenu = isFromSeasonalMenu;
        this.price = price;
    }

    //геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Boolean getIsFromSeasonalMenu() {
        return isFromSeasonalMenu;
    }

    public void setIsFromSeasonalMenu(Boolean isFromSeasonalMenu) {
        this.isFromSeasonalMenu = isFromSeasonalMenu;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CoffeeDrink{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", isFromSeasonalMenu=" + isFromSeasonalMenu +
                ", price=" + price +
                '}';
    }
}
