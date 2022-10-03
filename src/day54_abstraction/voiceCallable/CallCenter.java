package day54_abstraction.voiceCallable;

import java.awt.geom.QuadCurve2D;

public class CallCenter {
    public static void main(String[] args) {

        WhatsApp wa = new WhatsApp();

        wa.launch();

        wa.allOSCompatible=true;
        wa.isFree = true;
        wa.name="WhatsApp";

        wa.call("Mehmet");
        wa.sendMesage("Thank you Mehmet.......");
        wa.videoCall();
        wa.accept();

        VoiceCallable.decline();










    }
}
