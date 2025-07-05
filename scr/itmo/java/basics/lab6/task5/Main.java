package itmo.java.basics.lab6.task5;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        System.out.println("Возраст пользователя: " + user.getAge());

        UserWithName userWithName = new UserWithName();
        userWithName.getAge();
    }
}
