abstract class Notification{

    abstract void send();
}
class SMS extends Notification{
    void send(){
        System.out.println("sending SMS notification.....");
    }
}

class Email extends Notification{
    void send(){
        System.out.println("Sending Email Notification...");
    }
}
class PushNotification extends Notification{
    void send(){
        System.out.println("Sending push Notification...");
    }
}
public class NotificationSendingSystem {
    public static void main(String[] args) {

        Notification n1=new SMS();
        n1.send();
        Notification n2=new Email();
        n2.send();
        Notification n3=new PushNotification();
        n3.send();
    }
}
