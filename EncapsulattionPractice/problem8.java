

class Account{
    String holderName;
    double balance;

    public Account(String holderName,double balance){
        this.balance=balance;
        this.holderName=holderName;
    }
}
class Bank{
    public void checkBalance(Account a){
        System.out.println("HolderName: "+a.holderName);
        System.out.println("balance: "+a.balance);
        System.out.println("Maintain minimum balance.....");
    }

}
public class problem8 {
    public static void main(String[] args) {
        Account am=new Account("wahab",2000);
        Bank bb=new Bank();
        bb.checkBalance(am);
    }
}
