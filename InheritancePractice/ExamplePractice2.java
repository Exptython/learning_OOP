class Amount{
    double balance=5000;
    public void deposit(double amount){
        balance+=amount;
    }
}
class savingAmount extends Amount{
    void addInterest(){
        balance+=balance*0.5;
    }
}




public class ExamplePractice2 {
    public static void main(String[] args) {
        savingAmount amount1=new savingAmount();
        amount1.deposit(500);
        amount1.addInterest();
    }
}
