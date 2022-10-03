package day54_abstraction.voiceCallable;

public class WhatsApp extends  MessagingApp implements VoiceCallable, VideoCall{  // 1st concrete class of MessApp AbsCla

    // we have default constructor here, super() - > it calls the non parameterized constructor of super class,, thats way we dont any error

    @Override
    public void sendMesage(String msg) {
        System.out.println("WhatsApp - sending msg" + msg + " ....");
    }
    @Override
    public void videoCall() {
        System.out.println("WhatsApp - making a video call ...");
    }
    @Override
    public void call(String contact) {
        System.out.println("WhatsApp - calling " + contact + " ....");

    }
}
