package Abstract;

interface MessageSender{
    void sendMessage(String message);
}

class EmailSender implements MessageSender{
    public  void sendMessage(String message){
        System.out.println("Sending an email : " + message);
    }
}

class SMSSender implements MessageSender{
    public  void sendMessage(String message){
        System.out.println("Sending an SMS : " + message);
    }
}
public class InterfaceDemo {
    public static void main(String a[]) {
        EmailSender emailSender = new EmailSender();
        SMSSender smsSender = new SMSSender();

        emailSender.sendMessage("Hellooo email");
        smsSender.sendMessage("Heyyy sms");

    }
}
