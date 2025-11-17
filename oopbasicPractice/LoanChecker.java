class Loan{
    int loanAmount;
    float interestRate;
    int year;

    public Loan(int loanAmount,float interestRate,int year){
        this.interestRate=interestRate;
        this.loanAmount=loanAmount;
        this.year=year;
    }

    public double calculateTotalPayment(){
       double TotalAmount=(interestRate*loanAmount*year)/100;
        return TotalAmount;
    }
    public void DisplayInfo(){
        System.out.println("loan amount: "+loanAmount);
        System.out.println("interestrate: "+interestRate);
        System.out.println("year: "+year);
        System.out.println("Total amount: "+calculateTotalPayment());
    }

}

public class LoanChecker {
    public static void main(String[] args) {
        Loan loan1=new Loan(1200,2,1);
        loan1.DisplayInfo();
    }
}
