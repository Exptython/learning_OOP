
class BankAccount{
    private double balance1;

  public void setBalance1(double balance1){
      this.balance1=balance1;
  }
  public double getBalance1(){
      return balance1;
  }

  public void depositAmount (double Amount){

  }

  public void withDraw(double Amount){
      if (Amount>0){
          balance1-=Amount;
          System.out.println("Deposited:"+Amount);
      }else {
          System.out.println("deposit must be positive ");
      }

  }
  public void DisplayInfo(){
      System.out.println("balance: "+balance1);
  }

}

public class problem10 {
    public static void main(String[] args) {
        BankAccount account=new BankAccount();
        account.setBalance1(1000);

        account.depositAmount(500);
        account.withDraw(200);
        account.DisplayInfo();


    }
}
