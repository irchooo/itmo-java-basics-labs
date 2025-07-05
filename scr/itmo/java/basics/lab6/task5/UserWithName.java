package itmo.java.basics.lab6.task5;

public class UserWithName extends User{
    private String name;

    public UserWithName() {
        super();
        scanner.nextLine();
        System.out.println("Введите имя пользователя: ");
        this.name = scanner.nextLine();
    }

    @Override
    public int getAge() {
        int age = super.getAge();
        System.out.println("Возраст пользователя " + this.name + ": " + age);
        return age;
    }
}
