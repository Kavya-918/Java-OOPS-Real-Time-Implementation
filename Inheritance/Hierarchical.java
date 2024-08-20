class WhatsAppV1 {
    public void sendMsg() {
        System.out.println("Text Message Sent!");
    }
}
class WhatsAppV2 extends WhatsAppV1 {
    public void sendVoiceMsg() {
        System.out.println("Voice Message Sent!");
    }
}
class WhatsAppV3 extends WhatsAppV1 {
    public void videoCall() {
        System.out.println("Video Call Started!");
    }
}
public class Hierarchical {
    public static void main(String[] args) {
        WhatsAppV2 appV2 = new WhatsAppV2();
        appV2.sendMsg();       // Inherited from WhatsAppV1
        appV2.sendVoiceMsg();  // Defined in WhatsAppV2
        System.out.println("---");
        WhatsAppV3 appV3 = new WhatsAppV3();
        appV3.sendMsg();       // Inherited from WhatsAppV1
        appV3.videoCall();     // Defined in WhatsAppV3
    }
}
