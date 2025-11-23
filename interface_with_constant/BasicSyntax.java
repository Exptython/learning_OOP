interface Bank{
    double INTEREST=7.5;
    void openAccount();
        }
class HBL implements Bank{
    public void openAccount(){
        System.out.println("HBL Account Opened.Default Interest= "+INTEREST);

    }
}
class MeezanBank implements Bank {
    public void openAccount() {
        System.out.println("Meezan Bank Account Opened. Profit Rate = " + INTEREST);
    }
}

public class BasicSyntax {
    public static void main(String[] args) {
        Bank b1=new HBL();
        Bank b2=new MeezanBank();

        b1.openAccount();
        b2.openAccount();
    }



}
