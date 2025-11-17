class BankAccount{
    double balance;

    BankAccount(double balance){
        this.balance=balance;

    }
    void DepositAmount(double amount){

        balance+=amount;
        System.out.println("Deposited: "+amount);
    }
    void showBalance(){
        System.out.println("current balance"+balance);
    }
}

class SavingAmount extends BankAccount{
    SavingAmount(double balance){
        super(balance);

    }
    void addInterest(){
        double interest= balance*0.05;
        System.out.println("Interest added: " + interest);
    }
}




public class Problem4 {
    public static void main(String[] args) {
        SavingAmount acc = new SavingAmount(1000);

       acc.showBalance();
       acc.DepositAmount(500);
       acc.addInterest();
       acc.showBalance();
    }
}
