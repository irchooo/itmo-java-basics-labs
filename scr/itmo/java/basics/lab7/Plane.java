package itmo.java.basics.lab7;

public class Plane {
    private String name;

    public Plane(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    class PlaneWing {
        private int wingWeightKg;

        public PlaneWing(int wingWeightKg) {
            this.wingWeightKg = wingWeightKg;
        }

        public int getWeightKg() {
            return wingWeightKg;
        }
    }

    public void planeMethodCall(int wingWeightKg) {
        PlaneWing planeWing = new PlaneWing(wingWeightKg);
        System.out.println("Вес крыла " + planeWing.getWeightKg() + " кг");
    }

    public static void main(String[] args) {
        Plane plane1 = new Plane("'Истребитель'");
        System.out.println("Самолет " + plane1.getName());
        plane1.planeMethodCall(2000);
        System.out.println();

        Plane plane2 = new Plane("'Боинг'");
        System.out.println("Самолет " + plane2.getName());
        PlaneWing rightWing = plane2.new PlaneWing(3000);
        System.out.println("Вес правого крыла " + rightWing.getWeightKg() + " кг");
        PlaneWing leftWing = plane2.new PlaneWing(2900);
        System.out.println("Вес левого крыла " + leftWing.getWeightKg() + " кг");
        System.out.println();
    }
}
