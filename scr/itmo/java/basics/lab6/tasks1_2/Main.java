package itmo.java.basics.lab6.tasks1_2;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Клиент", "Клиентович", "ВТБ");
        BankEmployee bankEmployee = new BankEmployee("Сотрудник", "Сотрудниковский", "Сбер");

        client.printAllInfo();
        bankEmployee.printAllInfo();

        Identifiable[] people = {client, bankEmployee};
        for (Identifiable person : people) {
            System.out.println("Добрый день, " + person.getName() + " " + person.getSurname() + "!");
            System.out.println();
        }

        BankRelated[] bankRelated = {client, bankEmployee};
        for (BankRelated person : bankRelated) {
            System.out.println("Обслуживается в банке " + person.getBankName());
            System.out.println();
        }
    }
}
