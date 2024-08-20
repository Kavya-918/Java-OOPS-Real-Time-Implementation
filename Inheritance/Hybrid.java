class WhatsAppV1 {
    public void sendMsg() {
        System.out.println("Text Message Sent!");
    }
}
interface WhatsAppV2 {
    void sendVoiceMsg();
}
interface WhatsAppV3 {
    void videoCall();
}
interface WhatsAppV4 {
    void statusUpdate();
}
interface WhatsAppV5 {
    void payment();
}
class WhatsAppV6 extends WhatsAppV1 implements WhatsAppV2, WhatsAppV3, WhatsAppV4, WhatsAppV5 {
    public void sendVoiceMsg() {
        System.out.println("Voice Message Sent!");
    }

    public void videoCall() {
        System.out.println("Video Call Started!");
    }

    public void statusUpdate() {
        System.out.println("Status Updated!");
    }

    public void payment() {
        System.out.println("Payment Made!");
    }
}
public class Hybrid  {
    public static void main(String[] args) {
        WhatsAppV6 app = new WhatsAppV6();
        app.sendMsg();       // Inherited from WhatsAppV1
        app.sendVoiceMsg();  // Implemented from WhatsAppV2
        app.videoCall();     // Implemented from WhatsAppV3
        app.statusUpdate();  // Implemented from WhatsAppV4
        app.payment();       // Implemented from WhatsAppV5
    }
}
