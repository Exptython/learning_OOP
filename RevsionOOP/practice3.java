
class Account{
    int balance;
    void addBonus(int Amount){
        balance+=Amount;
    }
    }

public class practice3 {
    static void updateBalance(Account acc){
        acc.addBonus(500);
    }

    public static void main(String[] args) {
        Account a1=new Account();
        updateBalance(a1);
        System.out.println("new balance"+a1.balance);
    }
}
