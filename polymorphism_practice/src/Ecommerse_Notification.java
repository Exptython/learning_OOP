class Notification{
    void send(){
        System.out.println("Sending a generic notification...");
    }
}
class EmailNotification extends Notification{
    public void send(){
        System.out.println("Sending Email Notification:Order confirmed");
    }
}
class SMSNotification extends Notification{
    public void send(){
        System.out.println("Sending SMS notification.");
    }
}

public class Ecommerse_Notification {
    public static void main(String[] args) {
        Notification n;
      

        n=new SMSNotification();
        n.send();

    }
}
