package day54_abstraction.voiceCallable;

public class CallApp extends MessagingApp implements VoiceCallable{

    @Override
    public void sendMesage(String msg) {
        System.out.println("CallApp - sending msg" + msg );

    }

    @Override
    public void call(String contact) {
        System.out.println("CallApp - calling " + contact + " ....");

    }
}
