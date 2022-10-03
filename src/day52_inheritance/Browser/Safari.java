package day52_inheritance.Browser;

public final class Safari extends Browser {


    @Override
    public void open(){
        System.out.println("Opening Safari Browser");
    }

    @Override
    public void close(){
        System.out.println("Closing Safari  Browser");
    }



}