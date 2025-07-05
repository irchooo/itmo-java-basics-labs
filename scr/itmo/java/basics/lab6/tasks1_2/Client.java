package itmo.java.basics.lab6.tasks1_2;

class Client extends Person implements BankRelated{
    private String bankName;

    public Client(String name, String surname, String bankName) {
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
