package day54_abstraction.voiceCallable;

import javax.print.attribute.standard.JobMediaSheetsSupported;

public abstract class MessagingApp {

    public String name;
    protected boolean isFree;  // proT var/Meth accessible within the package or out side if we have inheritance r/ship
    boolean allOSCompatible;    // defaut variable/method with in a package only,,,,,
    private int count;           // private = only in one class ............// public = all class, packe and the proje

    public static final String APP_TYPE = "Messenger";

    public MessagingApp(){
        System.out.println("MessegingApp no-arg constructor");
    }
    public MessagingApp(String name, int count){
        this.name=name;
        this.count=count;
    }

    public abstract void sendMesage(String msg);  // abs metho, static method, varia method,,,

    void launch(){
        System.out.println("Messaging app is launching.........");
    }

    public static void close(){
        System.out.println("Messaging app is closing......");
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;  // this with out parentesis represent the current project in ja
    }                        // this with parentetis,,,,call constructor ,,,chaining
                                // super with out parenntisis,,,,call the parent class eleemnts
                               // super with parentesis ....it call parent class constructors....

}
