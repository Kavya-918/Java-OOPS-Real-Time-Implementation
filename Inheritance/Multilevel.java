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

class WhatsAppV3 extends WhatsAppV2 {
    public void videoCall() {
        System.out.println("Video Call Started!");
    }
}
public class Multilevel {
    public static void main(String[] args) {
        WhatsAppV3 app = new WhatsAppV3();
        app.sendMsg();       // Inherited from WhatsAppV1
        app.sendVoiceMsg();  // Inherited from WhatsAppV2
        app.videoCall();     // Defined in WhatsAppV3
    }
    
}
