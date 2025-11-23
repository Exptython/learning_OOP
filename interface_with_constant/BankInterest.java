interface Bank1{
    double Interest=7.5;
    void deposit(double amount);
    void withdraw(double amount);
    void showBalance();
}
class BankAccount implements Bank1{
    private double balance;

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. New Balance: " + balance);
    }
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance -= amount;
            System.out.println(amount + " withdrawn. New Balance: " + balance);
        }
    }
    public void showBalance() {
        System.out.println("Current Balance: " + balance);
    }
    public void applyInterest() {
        double interestAmount = (balance * Interest) / 100;
        balance += interestAmount;
        System.out.println("Interest added: " + interestAmount);
        System.out.println("Balance after interest: " + balance);
    }


}

public class BankInterest {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        acc.deposit(1000);
        acc.withdraw(300);
        acc.showBalance();
        acc.applyInterest();
        acc.showBalance();
    }
}
