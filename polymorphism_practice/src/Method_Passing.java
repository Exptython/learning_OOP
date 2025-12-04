class Payment{
    void pay(){
        System.out.println("Generic Payment");
    }
}
class Paypal extends Payment{
    void pay(){
        System.out.println("paid via paypal..");
    }
}
class creditCard extends Payment{
    void pay(){
        System.out.println("Paid using credit card..");
    }
}
class PaymentProcessor{
    void process(Payment p){
        p.pay();
    }
}





public class Method_Passing {
    public static void main(String[] args) {
        PaymentProcessor p1=new PaymentProcessor();
        p1.process(new Paypal());
        p1.process(new creditCard());
    }
}
