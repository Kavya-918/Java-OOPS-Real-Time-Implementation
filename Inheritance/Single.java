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

public class Single {
    public static void main(String[] args) {
        WhatsAppV2 app = new WhatsAppV2();
        app.sendMsg();       // Inherited from WhatsAppV1
        app.sendVoiceMsg();  // Defined in WhatsAppV2
    }
}
