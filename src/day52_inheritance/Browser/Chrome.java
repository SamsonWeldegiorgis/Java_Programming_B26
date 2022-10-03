package day52_inheritance.Browser;

public class Chrome extends Browser{   // we can make it final,,,,
  /*
    public Chrome() {
        super("101");
    }
     */

    @Override
    public void open(){
        System.out.println("Opening Chrome Browser");
    }

    @Override
    public void close(){
        System.out.println("Closing Chrome  Browser");
    }

}