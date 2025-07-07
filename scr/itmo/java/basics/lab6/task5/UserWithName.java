package itmo.java.basics.lab6.task5;

public class UserWithName extends User{

    @Override
    public void printAge() {
        System.out.println("Возраст пользователя " + this.name + ": " + age);
    }
}
