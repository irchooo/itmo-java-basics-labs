package itmo.java.basics.lab6.tasks1_2;

public class BankEmployee extends Person implements BankRelated{
    private String bankName;

    public BankEmployee(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    @Override
    public String getBankName() {
        return bankName;
    }

    @Override
    public void printAllInfo() {
        System.out.println("Имя: " + getName() + "\nФамилия: " + getSurname() + "\nНазвание банка: " + bankName);
        System.out.println();
    }
}
