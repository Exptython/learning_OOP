
class Account{
    double balance;

    public Account(double balance){
        this.balance=balance;
    }
    public void DisplayInfo(){
        System.out.println("balance: "+balance);
    }
    }
    class Bank{
    static void AddInterest(Account acc,double rate){
        double Interest=acc.balance*rate/100;
        acc.balance+=Interest;
        System.out.println("Interest added: "+Interest);
    }
        }

public class problem4 {
        public static void main(String[] args) {
        Account myAcc=new Account(1000);
        myAcc.DisplayInfo();
        Bank.AddInterest(myAcc,5.0);
        myAcc.DisplayInfo();

    }
    }
