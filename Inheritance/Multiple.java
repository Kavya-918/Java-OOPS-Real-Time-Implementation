interface WhatsAppV1 {
    void sendMsg();
}

interface WhatsAppV2 {
    void sendVoiceMsg();
}

interface WhatsAppV3 {
    void videoCall();
}
class WhatsApp implements WhatsAppV1, WhatsAppV2, WhatsAppV3 {
    @Override
    public void sendMsg() {
        System.out.println("Message Sent from WhatsAppV1");
    }

    @Override
    public void sendVoiceMsg() {
        System.out.println("Voice Message Sent from WhatsAppV2");
    }

    @Override
    public void videoCall() {
        System.out.println("Video Call Started from WhatsAppV3");
    }
}

public class Multiple {
    public static void main(String[] args) {
        WhatsApp app = new WhatsApp();
        app.sendMsg();         // WhatsAppV1 feature
        app.sendVoiceMsg();    // WhatsAppV2 feature
        app.videoCall();       // WhatsAppV3 feature
    }
}