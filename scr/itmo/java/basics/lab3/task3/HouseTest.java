package itmo.java.basics.lab3.task3;

public class HouseTest {
    public static void main(String[] args){
        House house1 = new House();
        House house2 = new House();

        house1.setAllInfo("Circus", 2013, 13);
        house2.setAllInfo("Restaurant", 1989, 3);

        System.out.println(house1.getInfo());
        System.out.println(house1.yearsNumberCounter1());
        System.out.println(house1.yearsNumberCounter2());

        System.out.println(house2.getInfo());
        System.out.println(house2.yearsNumberCounter1());
        System.out.println(house2.yearsNumberCounter2());
    }
}
